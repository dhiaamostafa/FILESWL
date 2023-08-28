package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.Cq;
import com.plat.mustashe.R;
import java.util.Locale;
import p٠٥٥n1.AbstractCm;
import p٠٨١v1.AbstractCa;
/* loaded from: classes.dex */
public class TextInputEditText extends Cq {

    /* renamed from: j  reason: contains not printable characters */
    public final Rect f٦٨٢٥j;

    /* renamed from: k  reason: contains not printable characters */
    public boolean f٦٨٢٦k;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(AbstractCa.m٦٣٥٩a(context, attributeSet, R.attr.editTextStyle, 0), attributeSet, R.attr.editTextStyle);
        this.f٦٨٢٥j = new Rect();
        int[] iArr = p٠٩٢z0.AbstractCa.f٨٩٨٨z;
        AbstractCm.m٥٩٠٨a(context, attributeSet, R.attr.editTextStyle, 2131755798);
        AbstractCm.m٥٩٠٩b(context, attributeSet, iArr, R.attr.editTextStyle, 2131755798, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.editTextStyle, 2131755798);
        setTextInputLayoutFocusedRectEnabled(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: b  reason: contains not printable characters */
    public final boolean m٤٦٦١b(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f٦٨٢٦k;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m٤٦٦١b(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f٦٨٢٥j);
        rect.bottom = this.f٦٨٢٥j.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        return m٤٦٦١b(textInputLayout) ? textInputLayout.getGlobalVisibleRect(rect, point) : super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.f٦٨٤٣I) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.f٦٨٤٣I && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.Cq, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m٤٦٦١b(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f٦٨٢٥j.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f٦٨٢٥j);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f٦٨٢٦k = z;
    }
}
