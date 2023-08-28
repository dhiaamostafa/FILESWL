package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.AbstractCa;
import androidx.appcompat.widget.AbstractCj1;
import androidx.appcompat.widget.Cp;
import androidx.appcompat.widget.Cv2;
import androidx.appcompat.widget.Cy0;
import androidx.appcompat.widget.RunnableCf;
import com.google.android.material.internal.CheckableImageButton;
import com.plat.mustashe.R;
import com.swift.sandhook.annotation.HookMode;
import com.swift.sandhook.utils.FileUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import p٠١٠c.AbstractCc;
import p٠١١c0.Cb;
import p٠١٤d.Cb0;
import p٠١٨e0.AbstractCd0;
import p٠١٨e0.AbstractCe0;
import p٠١٨e0.AbstractCf0;
import p٠١٨e0.AbstractCh0;
import p٠١٨e0.AbstractCm0;
import p٠١٨e0.AbstractCv0;
import p٠٢٢f0.Cf;
import p٠٣٨j0.AbstractCb;
import p٠٥٥n1.AbstractCd;
import p٠٥٥n1.AbstractCm;
import p٠٥٥n1.AbstractCq;
import p٠٥٥n1.Cc;
import p٠٧٢s1.Ck;
import p٠٧٢s1.InterfaceCc;
import p٠٧٨u1.AbstractCo;
import p٠٧٨u1.Cg;
import p٠٧٨u1.Ci;
import p٠٧٨u1.Cn;
import p٠٧٨u1.Cq;
import p٠٧٨u1.Cr;
import p٠٧٨u1.Cu;
import p٠٧٨u1.Cv;
import p٠٧٨u1.Cw;
import p٠٧٨u1.Cx;
import p٠٨٣w0.AbstractCv;
import p٠٨٣w0.Cm;
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: A  reason: contains not printable characters */
    public Cm f٦٨٢٧A;

    /* renamed from: A0  reason: contains not printable characters */
    public int f٦٨٢٨A0;

    /* renamed from: B  reason: contains not printable characters */
    public Cm f٦٨٢٩B;

    /* renamed from: B0  reason: contains not printable characters */
    public int f٦٨٣٠B0;

    /* renamed from: C  reason: contains not printable characters */
    public ColorStateList f٦٨٣١C;

    /* renamed from: C0  reason: contains not printable characters */
    public int f٦٨٣٢C0;

    /* renamed from: D  reason: contains not printable characters */
    public ColorStateList f٦٨٣٣D;

    /* renamed from: D0  reason: contains not printable characters */
    public int f٦٨٣٤D0;

    /* renamed from: E  reason: contains not printable characters */
    public CharSequence f٦٨٣٥E;

    /* renamed from: E0  reason: contains not printable characters */
    public int f٦٨٣٦E0;

    /* renamed from: F  reason: contains not printable characters */
    public final TextView f٦٨٣٧F;

    /* renamed from: F0  reason: contains not printable characters */
    public boolean f٦٨٣٨F0;

    /* renamed from: G  reason: contains not printable characters */
    public boolean f٦٨٣٩G;

    /* renamed from: G0  reason: contains not printable characters */
    public final Cc f٦٨٤٠G0;

    /* renamed from: H  reason: contains not printable characters */
    public CharSequence f٦٨٤١H;

    /* renamed from: H0  reason: contains not printable characters */
    public boolean f٦٨٤٢H0;

    /* renamed from: I  reason: contains not printable characters */
    public boolean f٦٨٤٣I;

    /* renamed from: I0  reason: contains not printable characters */
    public boolean f٦٨٤٤I0;

    /* renamed from: J  reason: contains not printable characters */
    public p٠٧٢s1.Ch f٦٨٤٥J;

    /* renamed from: J0  reason: contains not printable characters */
    public ValueAnimator f٦٨٤٦J0;

    /* renamed from: K  reason: contains not printable characters */
    public p٠٧٢s1.Ch f٦٨٤٧K;

    /* renamed from: K0  reason: contains not printable characters */
    public boolean f٦٨٤٨K0;

    /* renamed from: L  reason: contains not printable characters */
    public p٠٧٢s1.Ch f٦٨٤٩L;

    /* renamed from: L0  reason: contains not printable characters */
    public boolean f٦٨٥٠L0;

    /* renamed from: M  reason: contains not printable characters */
    public Ck f٦٨٥١M;

    /* renamed from: N  reason: contains not printable characters */
    public boolean f٦٨٥٢N;

    /* renamed from: O  reason: contains not printable characters */
    public final int f٦٨٥٣O;

    /* renamed from: P  reason: contains not printable characters */
    public int f٦٨٥٤P;

    /* renamed from: Q  reason: contains not printable characters */
    public int f٦٨٥٥Q;

    /* renamed from: R  reason: contains not printable characters */
    public int f٦٨٥٦R;

    /* renamed from: S  reason: contains not printable characters */
    public int f٦٨٥٧S;

    /* renamed from: T  reason: contains not printable characters */
    public int f٦٨٥٨T;

    /* renamed from: U  reason: contains not printable characters */
    public int f٦٨٥٩U;

    /* renamed from: V  reason: contains not printable characters */
    public int f٦٨٦٠V;

    /* renamed from: W  reason: contains not printable characters */
    public final Rect f٦٨٦١W;

    /* renamed from: a0  reason: contains not printable characters */
    public final Rect f٦٨٦٢a0;

    /* renamed from: b0  reason: contains not printable characters */
    public final RectF f٦٨٦٣b0;

    /* renamed from: c0  reason: contains not printable characters */
    public Typeface f٦٨٦٤c0;

    /* renamed from: d0  reason: contains not printable characters */
    public Drawable f٦٨٦٥d0;

    /* renamed from: e  reason: contains not printable characters */
    public final FrameLayout f٦٨٦٦e;

    /* renamed from: e0  reason: contains not printable characters */
    public int f٦٨٦٧e0;

    /* renamed from: f  reason: contains not printable characters */
    public final Cw f٦٨٦٨f;

    /* renamed from: f0  reason: contains not printable characters */
    public final LinkedHashSet f٦٨٦٩f0;

    /* renamed from: g  reason: contains not printable characters */
    public final LinearLayout f٦٨٧٠g;

    /* renamed from: g0  reason: contains not printable characters */
    public int f٦٨٧١g0;

    /* renamed from: h  reason: contains not printable characters */
    public final FrameLayout f٦٨٧٢h;

    /* renamed from: h0  reason: contains not printable characters */
    public final SparseArray f٦٨٧٣h0;

    /* renamed from: i  reason: contains not printable characters */
    public EditText f٦٨٧٤i;

    /* renamed from: i0  reason: contains not printable characters */
    public final CheckableImageButton f٦٨٧٥i0;

    /* renamed from: j  reason: contains not printable characters */
    public CharSequence f٦٨٧٦j;

    /* renamed from: j0  reason: contains not printable characters */
    public final LinkedHashSet f٦٨٧٧j0;

    /* renamed from: k  reason: contains not printable characters */
    public int f٦٨٧٨k;

    /* renamed from: k0  reason: contains not printable characters */
    public ColorStateList f٦٨٧٩k0;

    /* renamed from: l  reason: contains not printable characters */
    public int f٦٨٨٠l;

    /* renamed from: l0  reason: contains not printable characters */
    public PorterDuff.Mode f٦٨٨١l0;

    /* renamed from: m  reason: contains not printable characters */
    public int f٦٨٨٢m;

    /* renamed from: m0  reason: contains not printable characters */
    public Drawable f٦٨٨٣m0;

    /* renamed from: n  reason: contains not printable characters */
    public int f٦٨٨٤n;

    /* renamed from: n0  reason: contains not printable characters */
    public int f٦٨٨٥n0;

    /* renamed from: o  reason: contains not printable characters */
    public final Cr f٦٨٨٦o;

    /* renamed from: o0  reason: contains not printable characters */
    public Drawable f٦٨٨٧o0;

    /* renamed from: p  reason: contains not printable characters */
    public boolean f٦٨٨٨p;

    /* renamed from: p0  reason: contains not printable characters */
    public View.OnLongClickListener f٦٨٨٩p0;

    /* renamed from: q  reason: contains not printable characters */
    public int f٦٨٩٠q;

    /* renamed from: q0  reason: contains not printable characters */
    public View.OnLongClickListener f٦٨٩١q0;

    /* renamed from: r  reason: contains not printable characters */
    public boolean f٦٨٩٢r;

    /* renamed from: r0  reason: contains not printable characters */
    public final CheckableImageButton f٦٨٩٣r0;

    /* renamed from: s  reason: contains not printable characters */
    public TextView f٦٨٩٤s;

    /* renamed from: s0  reason: contains not printable characters */
    public ColorStateList f٦٨٩٥s0;

    /* renamed from: t  reason: contains not printable characters */
    public int f٦٨٩٦t;

    /* renamed from: t0  reason: contains not printable characters */
    public PorterDuff.Mode f٦٨٩٧t0;

    /* renamed from: u  reason: contains not printable characters */
    public int f٦٨٩٨u;

    /* renamed from: u0  reason: contains not printable characters */
    public ColorStateList f٦٨٩٩u0;

    /* renamed from: v  reason: contains not printable characters */
    public CharSequence f٦٩٠٠v;

    /* renamed from: v0  reason: contains not printable characters */
    public ColorStateList f٦٩٠١v0;

    /* renamed from: w  reason: contains not printable characters */
    public boolean f٦٩٠٢w;

    /* renamed from: w0  reason: contains not printable characters */
    public int f٦٩٠٣w0;

    /* renamed from: x  reason: contains not printable characters */
    public TextView f٦٩٠٤x;

    /* renamed from: x0  reason: contains not printable characters */
    public int f٦٩٠٥x0;

    /* renamed from: y  reason: contains not printable characters */
    public ColorStateList f٦٩٠٦y;

    /* renamed from: y0  reason: contains not printable characters */
    public int f٦٩٠٧y0;

    /* renamed from: z  reason: contains not printable characters */
    public int f٦٩٠٨z;

    /* renamed from: z0  reason: contains not printable characters */
    public ColorStateList f٦٩٠٩z0;

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a  reason: invalid class name */
    /* loaded from: classes.dex */
    public class Ca implements TextWatcher {
        public Ca() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m٤٦٩٢z(!textInputLayout.f٦٨٥٠L0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f٦٨٨٨p) {
                textInputLayout2.m٤٦٨٥s(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.f٦٩٠٢w) {
                textInputLayout3.m٤٦٦٤A(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b  reason: invalid class name */
    /* loaded from: classes.dex */
    public class RunnableCb implements Runnable {
        public RunnableCb() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f٦٨٧٥i0.performClick();
            TextInputLayout.this.f٦٨٧٥i0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c  reason: invalid class name */
    /* loaded from: classes.dex */
    public class RunnableCc implements Runnable {
        public RunnableCc() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f٦٨٧٤i.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d  reason: invalid class name */
    /* loaded from: classes.dex */
    public class Cd implements ValueAnimator.AnimatorUpdateListener {
        public Cd() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f٦٨٤٠G0.m٥٨٩٩p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e  reason: invalid class name */
    /* loaded from: classes.dex */
    public static class Ce extends p٠١٨e0.Cc {

        /* renamed from: d  reason: contains not printable characters */
        public final TextInputLayout f٦٩١٤d;

        public Ce(TextInputLayout textInputLayout) {
            this.f٦٩١٤d = textInputLayout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
            if (r2 != null) goto L٥٠;
         */
        @Override // p٠١٨e0.Cc
        /* renamed from: d  reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo٦٣٠٩d(View view, Cf cf) {
            View view2;
            this.f٧١٩٥a.onInitializeAccessibilityNodeInfo(view, cf.f٧٢٩١a);
            EditText editText = this.f٦٩١٤d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f٦٩١٤d.getHint();
            CharSequence error = this.f٦٩١٤d.getError();
            CharSequence placeholderText = this.f٦٩١٤d.getPlaceholderText();
            int counterMaxLength = this.f٦٩١٤d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f٦٩١٤d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f٦٩١٤d.f٦٨٣٨F0;
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            Cw cw = this.f٦٩١٤d.f٦٨٦٨f;
            if (cw.f٨٧٢٨f.getVisibility() == 0) {
                cf.f٧٢٩١a.setLabelFor(cw.f٨٧٢٨f);
                view2 = cw.f٨٧٢٨f;
            } else {
                view2 = cw.f٨٧٣٠h;
            }
            cf.f٧٢٩١a.setTraversalAfter(view2);
            if (z) {
                cf.f٧٢٩١a.setText(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                cf.f٧٢٩١a.setText(charSequence);
                if (z3 && placeholderText != null) {
                    placeholderText = charSequence + ", " + ((Object) placeholderText);
                    cf.f٧٢٩١a.setText(placeholderText);
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    cf.m٥٢٥٦k(charSequence);
                } else {
                    if (z) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    cf.f٧٢٩١a.setText(charSequence);
                }
                boolean z6 = !z;
                if (i >= 26) {
                    cf.f٧٢٩١a.setShowingHintText(z6);
                } else {
                    cf.m٥٢٥٣h(4, z6);
                }
            }
            cf.f٧٢٩١a.setMaxTextLength((text == null || text.length() != counterMaxLength) ? -1 : -1);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                cf.f٧٢٩١a.setError(error);
            }
            TextView textView = this.f٦٩١٤d.f٦٨٨٦o.f٨٧١٥r;
            if (textView != null) {
                cf.f٧٢٩١a.setLabelFor(textView);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f  reason: invalid class name */
    /* loaded from: classes.dex */
    public interface InterfaceCf {
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g  reason: invalid class name */
    /* loaded from: classes.dex */
    public interface InterfaceCg {
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$h  reason: invalid class name */
    /* loaded from: classes.dex */
    public static class Ch extends AbstractCb {
        public static final Parcelable.Creator<Ch> CREATOR = new Cx();

        /* renamed from: g  reason: contains not printable characters */
        public CharSequence f٦٩١٥g;

        /* renamed from: h  reason: contains not printable characters */
        public boolean f٦٩١٦h;

        /* renamed from: i  reason: contains not printable characters */
        public CharSequence f٦٩١٧i;

        /* renamed from: j  reason: contains not printable characters */
        public CharSequence f٦٩١٨j;

        /* renamed from: k  reason: contains not printable characters */
        public CharSequence f٦٩١٩k;

        public Ch(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f٦٩١٥g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f٦٩١٦h = parcel.readInt() == 1;
            this.f٦٩١٧i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f٦٩١٨j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f٦٩١٩k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public Ch(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = AbstractCa.m٢٨٧٢a("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            sb.append((Object) this.f٦٩١٥g);
            sb.append(" hint=");
            sb.append((Object) this.f٦٩١٧i);
            sb.append(" helperText=");
            sb.append((Object) this.f٦٩١٨j);
            sb.append(" placeholderText=");
            sb.append((Object) this.f٦٩١٩k);
            sb.append("}");
            return sb.toString();
        }

        @Override // p٠٣٨j0.AbstractCb, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f٧٦٣٧e, i);
            TextUtils.writeToParcel(this.f٦٩١٥g, parcel, i);
            parcel.writeInt(this.f٦٩١٦h ? 1 : 0);
            TextUtils.writeToParcel(this.f٦٩١٧i, parcel, i);
            TextUtils.writeToParcel(this.f٦٩١٨j, parcel, i);
            TextUtils.writeToParcel(this.f٦٩١٩k, parcel, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v63 */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(p٠٨١v1.AbstractCa.m٦٣٥٩a(context, attributeSet, R.attr.textInputStyle, 2131755799), attributeSet, R.attr.textInputStyle);
        ?? r6;
        int colorForState;
        this.f٦٨٧٨k = -1;
        this.f٦٨٨٠l = -1;
        this.f٦٨٨٢m = -1;
        this.f٦٨٨٤n = -1;
        this.f٦٨٨٦o = new Cr(this);
        this.f٦٨٦١W = new Rect();
        this.f٦٨٦٢a0 = new Rect();
        this.f٦٨٦٣b0 = new RectF();
        this.f٦٨٦٩f0 = new LinkedHashSet();
        this.f٦٨٧١g0 = 0;
        SparseArray sparseArray = new SparseArray();
        this.f٦٨٧٣h0 = sparseArray;
        this.f٦٨٧٧j0 = new LinkedHashSet();
        Cc cc = new Cc(this);
        this.f٦٨٤٠G0 = cc;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f٦٨٦٦e = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f٦٨٧٢h = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f٦٨٧٠g = linearLayout;
        Cy0 cy0 = new Cy0(context2);
        this.f٦٨٣٧F = cy0;
        linearLayout.setVisibility(8);
        frameLayout2.setVisibility(8);
        cy0.setVisibility(8);
        LayoutInflater from = LayoutInflater.from(context2);
        CheckableImageButton checkableImageButton = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) linearLayout, false);
        this.f٦٨٩٣r0 = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.f٦٨٧٥i0 = checkableImageButton2;
        frameLayout.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = p٠٠٢a1.AbstractCa.f٤٥٠٥a;
        cc.f٨٠١٧Q = timeInterpolator;
        cc.m٥٨٩٥k(false);
        cc.f٨٠١٦P = timeInterpolator;
        cc.m٥٨٩٥k(false);
        cc.m٥٨٩٧n(8388659);
        int[] iArr = p٠٩٢z0.AbstractCa.f٨٩٦١A;
        AbstractCm.m٥٩٠٨a(context2, attributeSet, R.attr.textInputStyle, 2131755799);
        AbstractCm.m٥٩٠٩b(context2, attributeSet, iArr, R.attr.textInputStyle, 2131755799, 22, 20, 35, 40, 44);
        Cv2 cv2 = new Cv2(context2, context2.obtainStyledAttributes(attributeSet, iArr, R.attr.textInputStyle, 2131755799));
        Cw cw = new Cw(this, cv2);
        this.f٦٨٦٨f = cw;
        this.f٦٨٣٩G = cv2.m٣٢٥٩o(43, true);
        setHint(cv2.m٣٢٣٦E(4));
        this.f٦٨٤٤I0 = cv2.m٣٢٥٩o(42, true);
        this.f٦٨٤٢H0 = cv2.m٣٢٥٩o(37, true);
        if (cv2.m٣٢٣٧F(6)) {
            setMinEms(cv2.m٣٢٣٢A(6, -1));
        } else if (cv2.m٣٢٣٧F(3)) {
            setMinWidth(cv2.m٣٢٦٥u(3, -1));
        }
        if (cv2.m٣٢٣٧F(5)) {
            setMaxEms(cv2.m٣٢٣٢A(5, -1));
        } else if (cv2.m٣٢٣٧F(2)) {
            setMaxWidth(cv2.m٣٢٦٥u(2, -1));
        }
        this.f٦٨٥١M = Ck.m٦٢٤٣b(context2, attributeSet, R.attr.textInputStyle, 2131755799).m٦٢٤٨a();
        this.f٦٨٥٣O = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f٦٨٥٥Q = cv2.m٣٢٦٤t(9, 0);
        this.f٦٨٥٧S = cv2.m٣٢٦٥u(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f٦٨٥٨T = cv2.m٣٢٦٥u(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f٦٨٥٦R = this.f٦٨٥٧S;
        float f = cv2.m٣٢٦٣s(13, -1.0f);
        float f2 = cv2.m٣٢٦٣s(12, -1.0f);
        float f3 = cv2.m٣٢٦٣s(10, -1.0f);
        float f4 = cv2.m٣٢٦٣s(11, -1.0f);
        Ck ck = this.f٦٨٥١M;
        Objects.requireNonNull(ck);
        Ck.Ca ca = new Ck.Ca(ck);
        if (f >= 0.0f) {
            ca.m٦٢٥٢f(f);
        }
        if (f2 >= 0.0f) {
            ca.m٦٢٥٣g(f2);
        }
        if (f3 >= 0.0f) {
            ca.m٦٢٥١e(f3);
        }
        if (f4 >= 0.0f) {
            ca.m٦٢٥٠d(f4);
        }
        this.f٦٨٥١M = ca.m٦٢٤٨a();
        ColorStateList colorStateList = AbstractCc.m٤٣٨٤j(context2, cv2, 7);
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            this.f٦٨٢٨A0 = defaultColor;
            this.f٦٨٦٠V = defaultColor;
            if (colorStateList.isStateful()) {
                this.f٦٨٣٠B0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f٦٨٣٢C0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
                colorForState = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.f٦٨٣٢C0 = this.f٦٨٢٨A0;
                ColorStateList colorStateList2 = p٠١٧e.AbstractCa.m٤٩٠٦a(context2, R.color.mtrl_filled_background_color);
                this.f٦٨٣٠B0 = colorStateList2.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateList2.getColorForState(new int[]{16843623}, -1);
            }
            this.f٦٨٣٤D0 = colorForState;
        } else {
            this.f٦٨٦٠V = 0;
            this.f٦٨٢٨A0 = 0;
            this.f٦٨٣٠B0 = 0;
            this.f٦٨٣٢C0 = 0;
            this.f٦٨٣٤D0 = 0;
        }
        if (cv2.m٣٢٣٧F(1)) {
            ColorStateList colorStateList3 = cv2.m٣٢٦٢r(1);
            this.f٦٩٠١v0 = colorStateList3;
            this.f٦٨٩٩u0 = colorStateList3;
        }
        ColorStateList colorStateList4 = AbstractCc.m٤٣٨٤j(context2, cv2, 14);
        this.f٦٩٠٧y0 = cv2.m٣٢٦١q(14, 0);
        Object obj = p٠٧٦u.AbstractCb.f٨٦٢٧a;
        this.f٦٩٠٣w0 = p٠٧٩v.AbstractCc.m٦٣٥٥a(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.f٦٨٣٦E0 = p٠٧٩v.AbstractCc.m٦٣٥٥a(context2, R.color.mtrl_textinput_disabled_color);
        this.f٦٩٠٥x0 = p٠٧٩v.AbstractCc.m٦٣٥٥a(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateList4 != null) {
            setBoxStrokeColorStateList(colorStateList4);
        }
        if (cv2.m٣٢٣٧F(15)) {
            setBoxStrokeErrorColor(AbstractCc.m٤٣٨٤j(context2, cv2, 15));
        }
        if (cv2.m٣٢٣٤C(44, -1) != -1) {
            r6 = 0;
            setHintTextAppearance(cv2.m٣٢٣٤C(44, 0));
        } else {
            r6 = 0;
        }
        int i = cv2.m٣٢٣٤C(35, r6);
        CharSequence charSequence = cv2.m٣٢٣٦E(30);
        boolean z = cv2.m٣٢٥٩o(31, r6);
        checkableImageButton.setId(R.id.text_input_error_icon);
        if (AbstractCc.m٤٣٨٩o(context2)) {
            p٠١٨e0.AbstractCm.m٥٠٦٦h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r6);
        }
        if (cv2.m٣٢٣٧F(33)) {
            this.f٦٨٩٥s0 = AbstractCc.m٤٣٨٤j(context2, cv2, 33);
        }
        if (cv2.m٣٢٣٧F(34)) {
            this.f٦٨٩٧t0 = AbstractCq.m٥٩١٤b(cv2.m٣٢٣٢A(34, -1), null);
        }
        if (cv2.m٣٢٣٧F(32)) {
            setErrorIconDrawable(cv2.m٣٢٦٦v(32));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        AbstractCe0.m٤٩٦٧s(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int i2 = cv2.m٣٢٣٤C(40, 0);
        boolean z2 = cv2.m٣٢٥٩o(39, false);
        CharSequence charSequence2 = cv2.m٣٢٣٦E(38);
        int i3 = cv2.m٣٢٣٤C(52, 0);
        CharSequence charSequence3 = cv2.m٣٢٣٦E(51);
        int i4 = cv2.m٣٢٣٤C(65, 0);
        CharSequence charSequence4 = cv2.m٣٢٣٦E(64);
        boolean z3 = cv2.m٣٢٥٩o(18, false);
        setCounterMaxLength(cv2.m٣٢٣٢A(19, -1));
        this.f٦٨٩٨u = cv2.m٣٢٣٤C(22, 0);
        this.f٦٨٩٦t = cv2.m٣٢٣٤C(20, 0);
        setBoxBackgroundMode(cv2.m٣٢٣٢A(8, 0));
        if (AbstractCc.m٤٣٨٩o(context2)) {
            p٠١٨e0.AbstractCm.m٥٠٦٦h((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        int i5 = cv2.m٣٢٣٤C(26, 0);
        sparseArray.append(-1, new p٠٧٨u1.Ch(this, i5));
        sparseArray.append(0, new Cu(this));
        sparseArray.append(1, new Cv(this, i5 == 0 ? cv2.m٣٢٣٤C(47, 0) : i5));
        sparseArray.append(2, new Cg(this, i5));
        sparseArray.append(3, new Cn(this, i5));
        if (!cv2.m٣٢٣٧F(48)) {
            if (cv2.m٣٢٣٧F(28)) {
                this.f٦٨٧٩k0 = AbstractCc.m٤٣٨٤j(context2, cv2, 28);
            }
            if (cv2.m٣٢٣٧F(29)) {
                this.f٦٨٨١l0 = AbstractCq.m٥٩١٤b(cv2.m٣٢٣٢A(29, -1), null);
            }
        }
        if (cv2.m٣٢٣٧F(27)) {
            setEndIconMode(cv2.m٣٢٣٢A(27, 0));
            if (cv2.m٣٢٣٧F(25)) {
                setEndIconContentDescription(cv2.m٣٢٣٦E(25));
            }
            setEndIconCheckable(cv2.m٣٢٥٩o(24, true));
        } else if (cv2.m٣٢٣٧F(48)) {
            if (cv2.m٣٢٣٧F(49)) {
                this.f٦٨٧٩k0 = AbstractCc.m٤٣٨٤j(context2, cv2, 49);
            }
            if (cv2.m٣٢٣٧F(50)) {
                this.f٦٨٨١l0 = AbstractCq.m٥٩١٤b(cv2.m٣٢٣٢A(50, -1), null);
            }
            setEndIconMode(cv2.m٣٢٥٩o(48, false) ? 1 : 0);
            setEndIconContentDescription(cv2.m٣٢٣٦E(46));
        }
        cy0.setId(R.id.textinput_suffix_text);
        cy0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        AbstractCh0.m٥٠٠٩f(cy0, 1);
        setErrorContentDescription(charSequence);
        setCounterOverflowTextAppearance(this.f٦٨٩٦t);
        setHelperTextTextAppearance(i2);
        setErrorTextAppearance(i);
        setCounterTextAppearance(this.f٦٨٩٨u);
        setPlaceholderText(charSequence3);
        setPlaceholderTextAppearance(i3);
        setSuffixTextAppearance(i4);
        if (cv2.m٣٢٣٧F(36)) {
            setErrorTextColor(cv2.m٣٢٦٢r(36));
        }
        if (cv2.m٣٢٣٧F(41)) {
            setHelperTextColor(cv2.m٣٢٦٢r(41));
        }
        if (cv2.m٣٢٣٧F(45)) {
            setHintTextColor(cv2.m٣٢٦٢r(45));
        }
        if (cv2.m٣٢٣٧F(23)) {
            setCounterTextColor(cv2.m٣٢٦٢r(23));
        }
        if (cv2.m٣٢٣٧F(21)) {
            setCounterOverflowTextColor(cv2.m٣٢٦٢r(21));
        }
        if (cv2.m٣٢٣٧F(53)) {
            setPlaceholderTextColor(cv2.m٣٢٦٢r(53));
        }
        if (cv2.m٣٢٣٧F(66)) {
            setSuffixTextColor(cv2.m٣٢٦٢r(66));
        }
        setEnabled(cv2.m٣٢٥٩o(0, true));
        cv2.m٣٢٤٣N();
        AbstractCe0.m٤٩٦٧s(this, 2);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26 && i6 >= 26) {
            AbstractCm0.m٥٠٧٨l(this, 1);
        }
        frameLayout2.addView(checkableImageButton2);
        linearLayout.addView(cy0);
        linearLayout.addView(checkableImageButton);
        linearLayout.addView(frameLayout2);
        frameLayout.addView(cw);
        frameLayout.addView(linearLayout);
        addView(frameLayout);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(charSequence2);
        setSuffixText(charSequence4);
    }

    private AbstractCo getEndIconDelegate() {
        AbstractCo abstractCo = (AbstractCo) this.f٦٨٧٣h0.get(this.f٦٨٧١g0);
        return abstractCo != null ? abstractCo : (AbstractCo) this.f٦٨٧٣h0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f٦٨٩٣r0.getVisibility() == 0) {
            return this.f٦٨٩٣r0;
        }
        if (m٤٦٧٦h() && m٤٦٧٨j()) {
            return this.f٦٨٧٥i0;
        }
        return null;
    }

    /* renamed from: n  reason: contains not printable characters */
    public static void m٤٦٦٢n(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m٤٦٦٢n((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: p  reason: contains not printable characters */
    public static void m٤٦٦٣p(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = AbstractCv0.f٧٢٦١a;
        boolean z = AbstractCd0.m٤٩٣٩a(checkableImageButton);
        boolean z2 = false;
        boolean z3 = onLongClickListener != null;
        if (z || z3) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(z);
        checkableImageButton.setPressable(z);
        checkableImageButton.setLongClickable(z3);
        AbstractCe0.m٤٩٦٧s(checkableImageButton, z2 ? 1 : 2);
    }

    private void setEditText(EditText editText) {
        if (this.f٦٨٧٤i != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f٦٨٧١g0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f٦٨٧٤i = editText;
        int i = this.f٦٨٧٨k;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f٦٨٨٢m);
        }
        int i2 = this.f٦٨٨٠l;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f٦٨٨٤n);
        }
        m٤٦٨٠l();
        setTextInputAccessibilityDelegate(new Ce(this));
        this.f٦٨٤٠G0.m٥٩٠١r(this.f٦٨٧٤i.getTypeface());
        Cc cc = this.f٦٨٤٠G0;
        float textSize = this.f٦٨٧٤i.getTextSize();
        if (cc.f٨٠٣٩j != textSize) {
            cc.f٨٠٣٩j = textSize;
            cc.m٥٨٩٥k(false);
        }
        Cc cc2 = this.f٦٨٤٠G0;
        float letterSpacing = this.f٦٨٧٤i.getLetterSpacing();
        if (cc2.f٨٠٢٣W != letterSpacing) {
            cc2.f٨٠٢٣W = letterSpacing;
            cc2.m٥٨٩٥k(false);
        }
        int gravity = this.f٦٨٧٤i.getGravity();
        this.f٦٨٤٠G0.m٥٨٩٧n((gravity & (-113)) | 48);
        Cc cc3 = this.f٦٨٤٠G0;
        if (cc3.f٨٠٣٧h != gravity) {
            cc3.f٨٠٣٧h = gravity;
            cc3.m٥٨٩٥k(false);
        }
        this.f٦٨٧٤i.addTextChangedListener(new Ca());
        if (this.f٦٨٩٩u0 == null) {
            this.f٦٨٩٩u0 = this.f٦٨٧٤i.getHintTextColors();
        }
        if (this.f٦٨٣٩G) {
            if (TextUtils.isEmpty(this.f٦٨٤١H)) {
                CharSequence hint = this.f٦٨٧٤i.getHint();
                this.f٦٨٧٦j = hint;
                setHint(hint);
                this.f٦٨٧٤i.setHint((CharSequence) null);
            }
            this.f٦٨٤٣I = true;
        }
        if (this.f٦٨٩٤s != null) {
            m٤٦٨٥s(this.f٦٨٧٤i.getText().length());
        }
        m٤٦٨٨v();
        this.f٦٨٨٦o.m٦٣٢٦b();
        this.f٦٨٦٨f.bringToFront();
        this.f٦٨٧٠g.bringToFront();
        this.f٦٨٧٢h.bringToFront();
        this.f٦٨٩٣r0.bringToFront();
        Iterator it = this.f٦٨٦٩f0.iterator();
        while (it.hasNext()) {
            ((p٠٧٨u1.Cc) ((InterfaceCf) it.next())).m٦٣٠٠a(this);
        }
        m٤٦٦٦C();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m٤٦٩٢z(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f٦٨٤١H)) {
            return;
        }
        this.f٦٨٤١H = charSequence;
        Cc cc = this.f٦٨٤٠G0;
        if (charSequence == null || !TextUtils.equals(cc.f٨٠٠٢B, charSequence)) {
            cc.f٨٠٠٢B = charSequence;
            cc.f٨٠٠٣C = null;
            Bitmap bitmap = cc.f٨٠٠٥E;
            if (bitmap != null) {
                bitmap.recycle();
                cc.f٨٠٠٥E = null;
            }
            cc.m٥٨٩٥k(false);
        }
        if (this.f٦٨٣٨F0) {
            return;
        }
        m٤٦٨١m();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f٦٩٠٢w == z) {
            return;
        }
        if (z) {
            TextView textView = this.f٦٩٠٤x;
            if (textView != null) {
                this.f٦٨٦٦e.addView(textView);
                this.f٦٩٠٤x.setVisibility(0);
            }
        } else {
            TextView textView2 = this.f٦٩٠٤x;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.f٦٩٠٤x = null;
        }
        this.f٦٩٠٢w = z;
    }

    /* renamed from: A  reason: contains not printable characters */
    public final void m٤٦٦٤A(int i) {
        if (i == 0 && !this.f٦٨٣٨F0) {
            if (this.f٦٩٠٤x == null || !this.f٦٩٠٢w || TextUtils.isEmpty(this.f٦٩٠٠v)) {
                return;
            }
            this.f٦٩٠٤x.setText(this.f٦٩٠٠v);
            AbstractCv.m٦٥٠٤a(this.f٦٨٦٦e, this.f٦٨٢٧A);
            this.f٦٩٠٤x.setVisibility(0);
            this.f٦٩٠٤x.bringToFront();
            announceForAccessibility(this.f٦٩٠٠v);
            return;
        }
        m٤٦٧٧i();
    }

    /* renamed from: B  reason: contains not printable characters */
    public final void m٤٦٦٥B(boolean z, boolean z2) {
        int defaultColor = this.f٦٩٠٩z0.getDefaultColor();
        int colorForState = this.f٦٩٠٩z0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f٦٩٠٩z0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f٦٨٥٩U = colorForState2;
        } else if (z2) {
            this.f٦٨٥٩U = colorForState;
        } else {
            this.f٦٨٥٩U = defaultColor;
        }
    }

    /* renamed from: C  reason: contains not printable characters */
    public final void m٤٦٦٦C() {
        int i;
        if (this.f٦٨٧٤i == null) {
            return;
        }
        if (m٤٦٧٨j() || m٤٦٧٩k()) {
            i = 0;
        } else {
            EditText editText = this.f٦٨٧٤i;
            WeakHashMap weakHashMap = AbstractCv0.f٧٢٦١a;
            i = AbstractCf0.m٤٩٨٣e(editText);
        }
        TextView textView = this.f٦٨٣٧F;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.f٦٨٧٤i.getPaddingTop();
        int paddingBottom = this.f٦٨٧٤i.getPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractCv0.f٧٢٦١a;
        AbstractCf0.m٤٩٨٩k(textView, dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    /* renamed from: D  reason: contains not printable characters */
    public final void m٤٦٦٧D() {
        int visibility = this.f٦٨٣٧F.getVisibility();
        int i = (this.f٦٨٣٥E == null || this.f٦٨٣٨F0) ? 8 : 0;
        if (visibility != i) {
            getEndIconDelegate().mo٦٣٢٤c(i == 0);
        }
        m٤٦٨٩w();
        this.f٦٨٣٧F.setVisibility(i);
        m٤٦٨٧u();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9  */
    /* renamed from: E  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m٤٦٦٨E() {
        int i;
        TextView textView;
        AbstractCo endIconDelegate;
        EditText editText;
        EditText editText2;
        if (this.f٦٨٤٥J == null || this.f٦٨٥٤P == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f٦٨٧٤i) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f٦٨٧٤i) != null && editText.isHovered())) {
            z = true;
        }
        if (isEnabled()) {
            if (this.f٦٨٨٦o.m٦٣٢٩e()) {
                if (this.f٦٩٠٩z0 == null) {
                    i = this.f٦٨٨٦o.m٦٣٣١g();
                }
                m٤٦٦٥B(z2, z);
            } else if (!this.f٦٨٩٢r || (textView = this.f٦٨٩٤s) == null) {
                i = z2 ? this.f٦٩٠٧y0 : z ? this.f٦٩٠٥x0 : this.f٦٩٠٣w0;
            } else {
                if (this.f٦٩٠٩z0 == null) {
                    i = textView.getCurrentTextColor();
                }
                m٤٦٦٥B(z2, z);
            }
            m٤٦٩٠x();
            p٠١٠c.AbstractCb.m٤٣٦٢n(this, this.f٦٨٩٣r0, this.f٦٨٩٥s0);
            Cw cw = this.f٦٨٦٨f;
            p٠١٠c.AbstractCb.m٤٣٦٢n(cw.f٨٧٢٧e, cw.f٨٧٣٠h, cw.f٨٧٣١i);
            m٤٦٨٢o();
            endIconDelegate = getEndIconDelegate();
            Objects.requireNonNull(endIconDelegate);
            if (endIconDelegate instanceof Cn) {
                if (!this.f٦٨٨٦o.m٦٣٢٩e() || getEndIconDrawable() == null) {
                    p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٨٧٥i0, this.f٦٨٧٩k0, this.f٦٨٨١l0);
                } else {
                    Drawable mutate = getEndIconDrawable().mutate();
                    p٠٨٨y.AbstractCb.m٦٥٩٠g(mutate, this.f٦٨٨٦o.m٦٣٣١g());
                    this.f٦٨٧٥i0.setImageDrawable(mutate);
                }
            }
            if (this.f٦٨٥٤P == 2) {
                int i2 = this.f٦٨٥٦R;
                int i3 = (z2 && isEnabled()) ? this.f٦٨٥٨T : this.f٦٨٥٧S;
                this.f٦٨٥٦R = i3;
                if (i3 != i2 && m٤٦٧٣e() && !this.f٦٨٣٨F0) {
                    if (m٤٦٧٣e()) {
                        ((Ci) this.f٦٨٤٥J).m٦٣٠٨x(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    m٤٦٨١m();
                }
            }
            if (this.f٦٨٥٤P == 1) {
                this.f٦٨٦٠V = !isEnabled() ? this.f٦٨٣٠B0 : (!z || z2) ? z2 ? this.f٦٨٣٢C0 : this.f٦٨٢٨A0 : this.f٦٨٣٤D0;
            }
            m٤٦٧١c();
        }
        i = this.f٦٨٣٦E0;
        this.f٦٨٥٩U = i;
        m٤٦٩٠x();
        p٠١٠c.AbstractCb.m٤٣٦٢n(this, this.f٦٨٩٣r0, this.f٦٨٩٥s0);
        Cw cw2 = this.f٦٨٦٨f;
        p٠١٠c.AbstractCb.m٤٣٦٢n(cw2.f٨٧٢٧e, cw2.f٨٧٣٠h, cw2.f٨٧٣١i);
        m٤٦٨٢o();
        endIconDelegate = getEndIconDelegate();
        Objects.requireNonNull(endIconDelegate);
        if (endIconDelegate instanceof Cn) {
        }
        if (this.f٦٨٥٤P == 2) {
        }
        if (this.f٦٨٥٤P == 1) {
        }
        m٤٦٧١c();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m٤٦٦٩a(InterfaceCf interfaceCf) {
        this.f٦٨٦٩f0.add(interfaceCf);
        if (this.f٦٨٧٤i != null) {
            ((p٠٧٨u1.Cc) interfaceCf).m٦٣٠٠a(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f٦٨٦٦e.addView(view, layoutParams2);
        this.f٦٨٦٦e.setLayoutParams(layoutParams);
        m٤٦٩١y();
        setEditText((EditText) view);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m٤٦٧٠b(float f) {
        if (this.f٦٨٤٠G0.f٨٠٣١c == f) {
            return;
        }
        if (this.f٦٨٤٦J0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f٦٨٤٦J0 = valueAnimator;
            valueAnimator.setInterpolator(p٠٠٢a1.AbstractCa.f٤٥٠٦b);
            this.f٦٨٤٦J0.setDuration(167L);
            this.f٦٨٤٦J0.addUpdateListener(new Cd());
        }
        this.f٦٨٤٦J0.setFloatValues(this.f٦٨٤٠G0.f٨٠٣١c, f);
        this.f٦٨٤٦J0.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    /* renamed from: c  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m٤٦٧١c() {
        boolean z;
        p٠٧٢s1.Ch ch;
        p٠٧٢s1.Ch ch2 = this.f٦٨٤٥J;
        if (ch2 == null) {
            return;
        }
        Ck ck = ch2.f٨٥٢٦e.f٨٥٠٢a;
        Ck ck2 = this.f٦٨٥١M;
        boolean z2 = false;
        if (ck != ck2) {
            ch2.setShapeAppearanceModel(ck2);
            if (this.f٦٨٧١g0 == 3 && this.f٦٨٥٤P == 2) {
                Cn cn = (Cn) this.f٦٨٧٣h0.get(3);
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.f٦٨٧٤i;
                Objects.requireNonNull(cn);
                if (!(autoCompleteTextView.getKeyListener() != null) && cn.f٨٦٨٨a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
                    cn.m٦٣١٨i(autoCompleteTextView);
                }
            }
        }
        if (this.f٦٨٥٤P == 2) {
            if (this.f٦٨٥٦R > -1 && this.f٦٨٥٩U != 0) {
                z = true;
                if (z) {
                    this.f٦٨٤٥J.m٦٢٣٤r(this.f٦٨٥٦R, this.f٦٨٥٩U);
                }
                int i = this.f٦٨٦٠V;
                if (this.f٦٨٥٤P == 1) {
                    i = p٠٨٥x.AbstractCa.m٦٥٣١b(this.f٦٨٦٠V, p٠١٠c.AbstractCb.m٤٣٥٦h(getContext(), R.attr.colorSurface, 0));
                }
                this.f٦٨٦٠V = i;
                this.f٦٨٤٥J.m٦٢٣٢p(ColorStateList.valueOf(i));
                if (this.f٦٨٧١g0 == 3) {
                    this.f٦٨٧٤i.getBackground().invalidateSelf();
                }
                ch = this.f٦٨٤٧K;
                if (ch != null && this.f٦٨٤٩L != null) {
                    if (this.f٦٨٥٦R > -1 && this.f٦٨٥٩U != 0) {
                        z2 = true;
                    }
                    if (z2) {
                        ch.m٦٢٣٢p(ColorStateList.valueOf(this.f٦٨٧٤i.isFocused() ? this.f٦٩٠٣w0 : this.f٦٨٥٩U));
                        this.f٦٨٤٩L.m٦٢٣٢p(ColorStateList.valueOf(this.f٦٨٥٩U));
                    }
                    invalidate();
                }
                invalidate();
            }
        }
        z = false;
        if (z) {
        }
        int i2 = this.f٦٨٦٠V;
        if (this.f٦٨٥٤P == 1) {
        }
        this.f٦٨٦٠V = i2;
        this.f٦٨٤٥J.m٦٢٣٢p(ColorStateList.valueOf(i2));
        if (this.f٦٨٧١g0 == 3) {
        }
        ch = this.f٦٨٤٧K;
        if (ch != null) {
            if (this.f٦٨٥٦R > -1) {
                z2 = true;
            }
            if (z2) {
            }
            invalidate();
        }
        invalidate();
    }

    /* renamed from: d  reason: contains not printable characters */
    public final int m٤٦٧٢d() {
        float f;
        if (this.f٦٨٣٩G) {
            int i = this.f٦٨٥٤P;
            if (i == 0) {
                f = this.f٦٨٤٠G0.m٥٨٩٠e();
            } else if (i != 2) {
                return 0;
            } else {
                f = this.f٦٨٤٠G0.m٥٨٩٠e() / 2.0f;
            }
            return (int) f;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f٦٨٧٤i;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f٦٨٧٦j != null) {
            boolean z = this.f٦٨٤٣I;
            this.f٦٨٤٣I = false;
            CharSequence hint = editText.getHint();
            this.f٦٨٧٤i.setHint(this.f٦٨٧٦j);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f٦٨٧٤i.setHint(hint);
                this.f٦٨٤٣I = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.f٦٨٦٦e.getChildCount());
        for (int i2 = 0; i2 < this.f٦٨٦٦e.getChildCount(); i2++) {
            View childAt = this.f٦٨٦٦e.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f٦٨٧٤i) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f٦٨٥٠L0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f٦٨٥٠L0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        p٠٧٢s1.Ch ch;
        super.draw(canvas);
        if (this.f٦٨٣٩G) {
            Cc cc = this.f٦٨٤٠G0;
            Objects.requireNonNull(cc);
            int save = canvas.save();
            if (cc.f٨٠٠٣C != null && cc.f٨٠٢٩b) {
                cc.f٨٠١٤N.setTextSize(cc.f٨٠٠٧G);
                float f = cc.f٨٠٤٧r;
                float f2 = cc.f٨٠٤٨s;
                float f3 = cc.f٨٠٠٦F;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                if (cc.m٥٩٠٢s()) {
                    float lineStart = cc.f٨٠٤٧r - cc.f٨٠٢٥Y.getLineStart(0);
                    int alpha = cc.f٨٠١٤N.getAlpha();
                    canvas.translate(lineStart, f2);
                    float f4 = alpha;
                    cc.f٨٠١٤N.setAlpha((int) (cc.f٨٠٣٠b0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        TextPaint textPaint = cc.f٨٠١٤N;
                        float f5 = cc.f٨٠٠٨H;
                        float f6 = cc.f٨٠٠٩I;
                        float f7 = cc.f٨٠١٠J;
                        int i2 = cc.f٨٠١١K;
                        textPaint.setShadowLayer(f5, f6, f7, p٠٨٥x.AbstractCa.m٦٥٣٤e(i2, (Color.alpha(i2) * textPaint.getAlpha()) / 255));
                    }
                    cc.f٨٠٢٥Y.draw(canvas);
                    cc.f٨٠١٤N.setAlpha((int) (cc.f٨٠٢٨a0 * f4));
                    if (i >= 31) {
                        TextPaint textPaint2 = cc.f٨٠١٤N;
                        float f8 = cc.f٨٠٠٨H;
                        float f9 = cc.f٨٠٠٩I;
                        float f10 = cc.f٨٠١٠J;
                        int i3 = cc.f٨٠١١K;
                        textPaint2.setShadowLayer(f8, f9, f10, p٠٨٥x.AbstractCa.m٦٥٣٤e(i3, (Color.alpha(i3) * textPaint2.getAlpha()) / 255));
                    }
                    int lineBaseline = cc.f٨٠٢٥Y.getLineBaseline(0);
                    CharSequence charSequence = cc.f٨٠٣٢c0;
                    float f11 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, cc.f٨٠١٤N);
                    if (i >= 31) {
                        cc.f٨٠١٤N.setShadowLayer(cc.f٨٠٠٨H, cc.f٨٠٠٩I, cc.f٨٠١٠J, cc.f٨٠١١K);
                    }
                    String trim = cc.f٨٠٣٢c0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    cc.f٨٠١٤N.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(cc.f٨٠٢٥Y.getLineEnd(0), str.length()), 0.0f, f11, (Paint) cc.f٨٠١٤N);
                } else {
                    canvas.translate(f, f2);
                    cc.f٨٠٢٥Y.draw(canvas);
                }
                canvas.restoreToCount(save);
            }
        }
        if (this.f٦٨٤٩L == null || (ch = this.f٦٨٤٧K) == null) {
            return;
        }
        ch.draw(canvas);
        if (this.f٦٨٧٤i.isFocused()) {
            Rect bounds = this.f٦٨٤٩L.getBounds();
            Rect bounds2 = this.f٦٨٤٧K.getBounds();
            float f12 = this.f٦٨٤٠G0.f٨٠٣١c;
            int centerX = bounds2.centerX();
            int i4 = bounds2.left;
            TimeInterpolator timeInterpolator = p٠٠٢a1.AbstractCa.f٤٥٠٥a;
            bounds.left = Math.round((i4 - centerX) * f12) + centerX;
            bounds.right = Math.round(f12 * (bounds2.right - centerX)) + centerX;
            this.f٦٨٤٩L.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        if (this.f٦٨٤٨K0) {
            return;
        }
        boolean z3 = true;
        this.f٦٨٤٨K0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Cc cc = this.f٦٨٤٠G0;
        if (cc != null) {
            cc.f٨٠١٢L = drawableState;
            ColorStateList colorStateList2 = cc.f٨٠٤٢m;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = cc.f٨٠٤١l) != null && colorStateList.isStateful())) {
                cc.m٥٨٩٥k(false);
                z2 = true;
            } else {
                z2 = false;
            }
            z = z2 | false;
        } else {
            z = false;
        }
        if (this.f٦٨٧٤i != null) {
            WeakHashMap weakHashMap = AbstractCv0.f٧٢٦١a;
            if (!AbstractCh0.m٥٠٠٦c(this) || !isEnabled()) {
                z3 = false;
            }
            m٤٦٩٢z(z3, false);
        }
        m٤٦٨٨v();
        m٤٦٦٨E();
        if (z) {
            invalidate();
        }
        this.f٦٨٤٨K0 = false;
    }

    /* renamed from: e  reason: contains not printable characters */
    public final boolean m٤٦٧٣e() {
        return this.f٦٨٣٩G && !TextUtils.isEmpty(this.f٦٨٤١H) && (this.f٦٨٤٥J instanceof Ci);
    }

    /* renamed from: f  reason: contains not printable characters */
    public final int m٤٦٧٤f(int i, boolean z) {
        int compoundPaddingLeft = this.f٦٨٧٤i.getCompoundPaddingLeft() + i;
        return (getPrefixText() == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    /* renamed from: g  reason: contains not printable characters */
    public final int m٤٦٧٥g(int i, boolean z) {
        int compoundPaddingRight = i - this.f٦٨٧٤i.getCompoundPaddingRight();
        return (getPrefixText() == null || !z) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f٦٨٧٤i;
        if (editText != null) {
            return m٤٦٧٢d() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public p٠٧٢s1.Ch getBoxBackground() {
        int i = this.f٦٨٥٤P;
        if (i == 1 || i == 2) {
            return this.f٦٨٤٥J;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f٦٨٦٠V;
    }

    public int getBoxBackgroundMode() {
        return this.f٦٨٥٤P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f٦٨٥٥Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        InterfaceCc interfaceCc;
        if (AbstractCq.m٥٩١٣a(this)) {
            interfaceCc = this.f٦٨٥١M.f٨٥٥٦h;
        } else {
            interfaceCc = this.f٦٨٥١M.f٨٥٥٥g;
        }
        return interfaceCc.mo٦٢٤٠a(this.f٦٨٦٣b0);
    }

    public float getBoxCornerRadiusBottomStart() {
        InterfaceCc interfaceCc;
        if (AbstractCq.m٥٩١٣a(this)) {
            interfaceCc = this.f٦٨٥١M.f٨٥٥٥g;
        } else {
            interfaceCc = this.f٦٨٥١M.f٨٥٥٦h;
        }
        return interfaceCc.mo٦٢٤٠a(this.f٦٨٦٣b0);
    }

    public float getBoxCornerRadiusTopEnd() {
        InterfaceCc interfaceCc;
        if (AbstractCq.m٥٩١٣a(this)) {
            interfaceCc = this.f٦٨٥١M.f٨٥٥٣e;
        } else {
            interfaceCc = this.f٦٨٥١M.f٨٥٥٤f;
        }
        return interfaceCc.mo٦٢٤٠a(this.f٦٨٦٣b0);
    }

    public float getBoxCornerRadiusTopStart() {
        InterfaceCc interfaceCc;
        if (AbstractCq.m٥٩١٣a(this)) {
            interfaceCc = this.f٦٨٥١M.f٨٥٥٤f;
        } else {
            interfaceCc = this.f٦٨٥١M.f٨٥٥٣e;
        }
        return interfaceCc.mo٦٢٤٠a(this.f٦٨٦٣b0);
    }

    public int getBoxStrokeColor() {
        return this.f٦٩٠٧y0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f٦٩٠٩z0;
    }

    public int getBoxStrokeWidth() {
        return this.f٦٨٥٧S;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f٦٨٥٨T;
    }

    public int getCounterMaxLength() {
        return this.f٦٨٩٠q;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f٦٨٨٨p && this.f٦٨٩٢r && (textView = this.f٦٨٩٤s) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f٦٨٣١C;
    }

    public ColorStateList getCounterTextColor() {
        return this.f٦٨٣١C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f٦٨٩٩u0;
    }

    public EditText getEditText() {
        return this.f٦٨٧٤i;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f٦٨٧٥i0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f٦٨٧٥i0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f٦٨٧١g0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f٦٨٧٥i0;
    }

    public CharSequence getError() {
        Cr cr = this.f٦٨٨٦o;
        if (cr.f٨٧٠٨k) {
            return cr.f٨٧٠٧j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f٦٨٨٦o.f٨٧١٠m;
    }

    public int getErrorCurrentTextColors() {
        return this.f٦٨٨٦o.m٦٣٣١g();
    }

    public Drawable getErrorIconDrawable() {
        return this.f٦٨٩٣r0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f٦٨٨٦o.m٦٣٣١g();
    }

    public CharSequence getHelperText() {
        Cr cr = this.f٦٨٨٦o;
        if (cr.f٨٧١٤q) {
            return cr.f٨٧١٣p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f٦٨٨٦o.f٨٧١٥r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f٦٨٣٩G) {
            return this.f٦٨٤١H;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f٦٨٤٠G0.m٥٨٩٠e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f٦٨٤٠G0.m٥٨٩١f();
    }

    public ColorStateList getHintTextColor() {
        return this.f٦٩٠١v0;
    }

    public int getMaxEms() {
        return this.f٦٨٨٠l;
    }

    public int getMaxWidth() {
        return this.f٦٨٨٤n;
    }

    public int getMinEms() {
        return this.f٦٨٧٨k;
    }

    public int getMinWidth() {
        return this.f٦٨٨٢m;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f٦٨٧٥i0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f٦٨٧٥i0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f٦٩٠٢w) {
            return this.f٦٩٠٠v;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f٦٩٠٨z;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f٦٩٠٦y;
    }

    public CharSequence getPrefixText() {
        return this.f٦٨٦٨f.f٨٧٢٩g;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f٦٨٦٨f.f٨٧٢٨f.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f٦٨٦٨f.f٨٧٢٨f;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f٦٨٦٨f.f٨٧٣٠h.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f٦٨٦٨f.f٨٧٣٠h.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f٦٨٣٥E;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f٦٨٣٧F.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f٦٨٣٧F;
    }

    public Typeface getTypeface() {
        return this.f٦٨٦٤c0;
    }

    /* renamed from: h  reason: contains not printable characters */
    public final boolean m٤٦٧٦h() {
        return this.f٦٨٧١g0 != 0;
    }

    /* renamed from: i  reason: contains not printable characters */
    public final void m٤٦٧٧i() {
        TextView textView = this.f٦٩٠٤x;
        if (textView == null || !this.f٦٩٠٢w) {
            return;
        }
        textView.setText((CharSequence) null);
        AbstractCv.m٦٥٠٤a(this.f٦٨٦٦e, this.f٦٨٢٩B);
        this.f٦٩٠٤x.setVisibility(4);
    }

    /* renamed from: j  reason: contains not printable characters */
    public boolean m٤٦٧٨j() {
        return this.f٦٨٧٢h.getVisibility() == 0 && this.f٦٨٧٥i0.getVisibility() == 0;
    }

    /* renamed from: k  reason: contains not printable characters */
    public final boolean m٤٦٧٩k() {
        return this.f٦٨٩٣r0.getVisibility() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: l  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m٤٦٨٠l() {
        EditText editText;
        EditText editText2;
        int i;
        int dimensionPixelSize;
        int i2;
        Resources resources;
        int i3;
        Resources resources2;
        int i4;
        int i5 = this.f٦٨٥٤P;
        if (i5 == 0) {
            this.f٦٨٤٥J = null;
        } else if (i5 == 1) {
            this.f٦٨٤٥J = new p٠٧٢s1.Ch(this.f٦٨٥١M);
            this.f٦٨٤٧K = new p٠٧٢s1.Ch();
            this.f٦٨٤٩L = new p٠٧٢s1.Ch();
            editText = this.f٦٨٧٤i;
            if (editText == null && this.f٦٨٤٥J != null && editText.getBackground() == null && this.f٦٨٥٤P != 0) {
                EditText editText3 = this.f٦٨٧٤i;
                p٠٧٢s1.Ch ch = this.f٦٨٤٥J;
                WeakHashMap weakHashMap = AbstractCv0.f٧٢٦١a;
                AbstractCe0.m٤٩٦٥q(editText3, ch);
            }
            m٤٦٦٨E();
            if (this.f٦٨٥٤P == 1) {
                if (AbstractCc.m٤٣٩٠p(getContext())) {
                    resources2 = getResources();
                    i4 = R.dimen.material_font_2_0_box_collapsed_padding_top;
                } else if (AbstractCc.m٤٣٨٩o(getContext())) {
                    resources2 = getResources();
                    i4 = R.dimen.material_font_1_3_box_collapsed_padding_top;
                }
                this.f٦٨٥٥Q = resources2.getDimensionPixelSize(i4);
            }
            if (this.f٦٨٧٤i != null && this.f٦٨٥٤P == 1) {
                if (!AbstractCc.m٤٣٩٠p(getContext())) {
                    editText2 = this.f٦٨٧٤i;
                    WeakHashMap weakHashMap2 = AbstractCv0.f٧٢٦١a;
                    i = AbstractCf0.m٤٩٨٤f(editText2);
                    dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top);
                    i2 = AbstractCf0.m٤٩٨٣e(this.f٦٨٧٤i);
                    resources = getResources();
                    i3 = R.dimen.material_filled_edittext_font_2_0_padding_bottom;
                } else if (AbstractCc.m٤٣٨٩o(getContext())) {
                    editText2 = this.f٦٨٧٤i;
                    WeakHashMap weakHashMap3 = AbstractCv0.f٧٢٦١a;
                    i = AbstractCf0.m٤٩٨٤f(editText2);
                    dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top);
                    i2 = AbstractCf0.m٤٩٨٣e(this.f٦٨٧٤i);
                    resources = getResources();
                    i3 = R.dimen.material_filled_edittext_font_1_3_padding_bottom;
                }
                AbstractCf0.m٤٩٨٩k(editText2, i, dimensionPixelSize, i2, resources.getDimensionPixelSize(i3));
            }
            if (this.f٦٨٥٤P == 0) {
                m٤٦٩١y();
                return;
            }
            return;
        } else if (i5 != 2) {
            throw new IllegalArgumentException(this.f٦٨٥٤P + " is illegal; only @BoxBackgroundMode constants are supported.");
        } else {
            this.f٦٨٤٥J = (!this.f٦٨٣٩G || (this.f٦٨٤٥J instanceof Ci)) ? new p٠٧٢s1.Ch(this.f٦٨٥١M) : new Ci(this.f٦٨٥١M);
        }
        this.f٦٨٤٧K = null;
        this.f٦٨٤٩L = null;
        editText = this.f٦٨٧٤i;
        if (editText == null && this.f٦٨٤٥J != null && editText.getBackground() == null && this.f٦٨٥٤P != 0) {
        }
        m٤٦٦٨E();
        if (this.f٦٨٥٤P == 1) {
        }
        if (this.f٦٨٧٤i != null) {
            if (!AbstractCc.m٤٣٩٠p(getContext())) {
            }
            AbstractCf0.m٤٩٨٩k(editText2, i, dimensionPixelSize, i2, resources.getDimensionPixelSize(i3));
        }
        if (this.f٦٨٥٤P == 0) {
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    public final void m٤٦٨١m() {
        float f;
        float f2;
        float f3;
        float f4;
        if (m٤٦٧٣e()) {
            RectF rectF = this.f٦٨٦٣b0;
            Cc cc = this.f٦٨٤٠G0;
            int width = this.f٦٨٧٤i.getWidth();
            int gravity = this.f٦٨٧٤i.getGravity();
            boolean z = cc.m٥٨٨٧b(cc.f٨٠٠٢B);
            cc.f٨٠٠٤D = z;
            if (gravity == 17 || (gravity & 7) == 1) {
                f = width / 2.0f;
                f2 = cc.f٨٠٢٦Z / 2.0f;
            } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? z : !z) {
                f3 = cc.f٨٠٣٥f.left;
                rectF.left = f3;
                Rect rect = cc.f٨٠٣٥f;
                float f5 = rect.top;
                rectF.top = f5;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (cc.f٨٠٢٦Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (z) {
                        f4 = cc.f٨٠٢٦Z + f3;
                    }
                    f4 = rect.right;
                } else {
                    if (!z) {
                        f4 = cc.f٨٠٢٦Z + f3;
                    }
                    f4 = rect.right;
                }
                rectF.right = f4;
                rectF.bottom = cc.m٥٨٩٠e() + f5;
                float f6 = rectF.left;
                float f7 = this.f٦٨٥٣O;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f٦٨٥٦R);
                Ci ci = (Ci) this.f٦٨٤٥J;
                Objects.requireNonNull(ci);
                ci.m٦٣٠٨x(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                f = cc.f٨٠٣٥f.right;
                f2 = cc.f٨٠٢٦Z;
            }
            f3 = f - f2;
            rectF.left = f3;
            Rect rect2 = cc.f٨٠٣٥f;
            float f52 = rect2.top;
            rectF.top = f52;
            if (gravity != 17) {
            }
            f4 = (width / 2.0f) + (cc.f٨٠٢٦Z / 2.0f);
            rectF.right = f4;
            rectF.bottom = cc.m٥٨٩٠e() + f52;
            float f62 = rectF.left;
            float f72 = this.f٦٨٥٣O;
            rectF.left = f62 - f72;
            rectF.right += f72;
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f٦٨٥٦R);
            Ci ci2 = (Ci) this.f٦٨٤٥J;
            Objects.requireNonNull(ci2);
            ci2.m٦٣٠٨x(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    /* renamed from: o  reason: contains not printable characters */
    public void m٤٦٨٢o() {
        p٠١٠c.AbstractCb.m٤٣٦٢n(this, this.f٦٨٧٥i0, this.f٦٨٧٩k0);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f٦٨٤٠G0.m٥٨٩٣i(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0182  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f٦٨٧٤i;
        if (editText == null) {
            return;
        }
        Rect rect = this.f٦٨٦١W;
        AbstractCd.m٥٩٠٣a(this, editText, rect);
        p٠٧٢s1.Ch ch = this.f٦٨٤٧K;
        if (ch != null) {
            int i11 = rect.bottom;
            ch.setBounds(rect.left, i11 - this.f٦٨٥٧S, rect.right, i11);
        }
        p٠٧٢s1.Ch ch2 = this.f٦٨٤٩L;
        if (ch2 != null) {
            int i12 = rect.bottom;
            ch2.setBounds(rect.left, i12 - this.f٦٨٥٨T, rect.right, i12);
        }
        if (!this.f٦٨٣٩G) {
            return;
        }
        Cc cc = this.f٦٨٤٠G0;
        float textSize = this.f٦٨٧٤i.getTextSize();
        if (cc.f٨٠٣٩j != textSize) {
            cc.f٨٠٣٩j = textSize;
            cc.m٥٨٩٥k(false);
        }
        int gravity = this.f٦٨٧٤i.getGravity();
        this.f٦٨٤٠G0.m٥٨٩٧n((gravity & (-113)) | 48);
        Cc cc2 = this.f٦٨٤٠G0;
        if (cc2.f٨٠٣٧h != gravity) {
            cc2.f٨٠٣٧h = gravity;
            cc2.m٥٨٩٥k(false);
        }
        Cc cc3 = this.f٦٨٤٠G0;
        if (this.f٦٨٧٤i != null) {
            Rect rect2 = this.f٦٨٦٢a0;
            boolean z2 = AbstractCq.m٥٩١٣a(this);
            rect2.bottom = rect.bottom;
            int i13 = this.f٦٨٥٤P;
            if (i13 == 1) {
                rect2.left = m٤٦٧٤f(rect.left, z2);
                i5 = rect.top + this.f٦٨٥٥Q;
            } else if (i13 == 2) {
                rect2.left = this.f٦٨٧٤i.getPaddingLeft() + rect.left;
                rect2.top = rect.top - m٤٦٧٢d();
                i6 = rect.right - this.f٦٨٧٤i.getPaddingRight();
                rect2.right = i6;
                Objects.requireNonNull(cc3);
                i7 = rect2.left;
                i8 = rect2.top;
                i9 = rect2.right;
                i10 = rect2.bottom;
                if (!Cc.m٥٨٨٦l(cc3.f٨٠٣٥f, i7, i8, i9, i10)) {
                    cc3.f٨٠٣٥f.set(i7, i8, i9, i10);
                    cc3.f٨٠١٣M = true;
                    cc3.m٥٨٩٤j();
                }
                Cc cc4 = this.f٦٨٤٠G0;
                if (this.f٦٨٧٤i == null) {
                    Rect rect3 = this.f٦٨٦٢a0;
                    TextPaint textPaint = cc4.f٨٠١٥O;
                    textPaint.setTextSize(cc4.f٨٠٣٩j);
                    textPaint.setTypeface(cc4.f٨٠٥٢w);
                    textPaint.setLetterSpacing(cc4.f٨٠٢٣W);
                    float f = -cc4.f٨٠١٥O.ascent();
                    rect3.left = this.f٦٨٧٤i.getCompoundPaddingLeft() + rect.left;
                    rect3.top = this.f٦٨٥٤P == 1 && this.f٦٨٧٤i.getMinLines() <= 1 ? (int) (rect.centerY() - (f / 2.0f)) : rect.top + this.f٦٨٧٤i.getCompoundPaddingTop();
                    rect3.right = rect.right - this.f٦٨٧٤i.getCompoundPaddingRight();
                    int compoundPaddingBottom = this.f٦٨٥٤P == 1 && this.f٦٨٧٤i.getMinLines() <= 1 ? (int) (rect3.top + f) : rect.bottom - this.f٦٨٧٤i.getCompoundPaddingBottom();
                    rect3.bottom = compoundPaddingBottom;
                    int i14 = rect3.left;
                    int i15 = rect3.top;
                    int i16 = rect3.right;
                    if (!Cc.m٥٨٨٦l(cc4.f٨٠٣٤e, i14, i15, i16, compoundPaddingBottom)) {
                        cc4.f٨٠٣٤e.set(i14, i15, i16, compoundPaddingBottom);
                        cc4.f٨٠١٣M = true;
                        cc4.m٥٨٩٤j();
                    }
                    this.f٦٨٤٠G0.m٥٨٩٥k(false);
                    if (!m٤٦٧٣e() || this.f٦٨٣٨F0) {
                        return;
                    }
                    m٤٦٨١m();
                    return;
                }
                throw new IllegalStateException();
            } else {
                rect2.left = m٤٦٧٤f(rect.left, z2);
                i5 = getPaddingTop();
            }
            rect2.top = i5;
            i6 = m٤٦٧٥g(rect.right, z2);
            rect2.right = i6;
            Objects.requireNonNull(cc3);
            i7 = rect2.left;
            i8 = rect2.top;
            i9 = rect2.right;
            i10 = rect2.bottom;
            if (!Cc.m٥٨٨٦l(cc3.f٨٠٣٥f, i7, i8, i9, i10)) {
            }
            Cc cc42 = this.f٦٨٤٠G0;
            if (this.f٦٨٧٤i == null) {
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.f٦٨٧٤i != null && this.f٦٨٧٤i.getMeasuredHeight() < (max = Math.max(this.f٦٨٧٠g.getMeasuredHeight(), this.f٦٨٦٨f.getMeasuredHeight()))) {
            this.f٦٨٧٤i.setMinimumHeight(max);
            z = true;
        }
        boolean z2 = m٤٦٨٧u();
        if (z || z2) {
            this.f٦٨٧٤i.post(new RunnableCc());
        }
        if (this.f٦٩٠٤x != null && (editText = this.f٦٨٧٤i) != null) {
            this.f٦٩٠٤x.setGravity(editText.getGravity());
            this.f٦٩٠٤x.setPadding(this.f٦٨٧٤i.getCompoundPaddingLeft(), this.f٦٨٧٤i.getCompoundPaddingTop(), this.f٦٨٧٤i.getCompoundPaddingRight(), this.f٦٨٧٤i.getCompoundPaddingBottom());
        }
        m٤٦٦٦C();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Ch)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Ch ch = (Ch) parcelable;
        super.onRestoreInstanceState(ch.f٧٦٣٧e);
        setError(ch.f٦٩١٥g);
        if (ch.f٦٩١٦h) {
            this.f٦٨٧٥i0.post(new RunnableCb());
        }
        setHint(ch.f٦٩١٧i);
        setHelperText(ch.f٦٩١٨j);
        setPlaceholderText(ch.f٦٩١٩k);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = false;
        boolean z2 = i == 1;
        boolean z3 = this.f٦٨٥٢N;
        if (z2 != z3) {
            if (z2 && !z3) {
                z = true;
            }
            float f = this.f٦٨٥١M.f٨٥٥٣e.mo٦٢٤٠a(this.f٦٨٦٣b0);
            float f2 = this.f٦٨٥١M.f٨٥٥٤f.mo٦٢٤٠a(this.f٦٨٦٣b0);
            float f3 = this.f٦٨٥١M.f٨٥٥٦h.mo٦٢٤٠a(this.f٦٨٦٣b0);
            float f4 = this.f٦٨٥١M.f٨٥٥٥g.mo٦٢٤٠a(this.f٦٨٦٣b0);
            float f5 = z ? f : f2;
            if (z) {
                f = f2;
            }
            float f6 = z ? f3 : f4;
            if (z) {
                f3 = f4;
            }
            boolean z4 = AbstractCq.m٥٩١٣a(this);
            this.f٦٨٥٢N = z4;
            float f7 = z4 ? f : f5;
            if (!z4) {
                f5 = f;
            }
            float f8 = z4 ? f3 : f6;
            if (!z4) {
                f6 = f3;
            }
            p٠٧٢s1.Ch ch = this.f٦٨٤٥J;
            if (ch != null && ch.m٦٢٢٨l() == f7) {
                p٠٧٢s1.Ch ch2 = this.f٦٨٤٥J;
                if (ch2.f٨٥٢٦e.f٨٥٠٢a.f٨٥٥٤f.mo٦٢٤٠a(ch2.m٦٢٢٤h()) == f5) {
                    p٠٧٢s1.Ch ch3 = this.f٦٨٤٥J;
                    if (ch3.f٨٥٢٦e.f٨٥٠٢a.f٨٥٥٦h.mo٦٢٤٠a(ch3.m٦٢٢٤h()) == f8) {
                        p٠٧٢s1.Ch ch4 = this.f٦٨٤٥J;
                        if (ch4.f٨٥٢٦e.f٨٥٠٢a.f٨٥٥٥g.mo٦٢٤٠a(ch4.m٦٢٢٤h()) == f6) {
                            return;
                        }
                    }
                }
            }
            Ck ck = this.f٦٨٥١M;
            Objects.requireNonNull(ck);
            Ck.Ca ca = new Ck.Ca(ck);
            ca.m٦٢٥٢f(f7);
            ca.m٦٢٥٣g(f5);
            ca.m٦٢٥٠d(f8);
            ca.m٦٢٥١e(f6);
            this.f٦٨٥١M = ca.m٦٢٤٨a();
            m٤٦٧١c();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Ch ch = new Ch(super.onSaveInstanceState());
        if (this.f٦٨٨٦o.m٦٣٢٩e()) {
            ch.f٦٩١٥g = getError();
        }
        ch.f٦٩١٦h = m٤٦٧٦h() && this.f٦٨٧٥i0.isChecked();
        ch.f٦٩١٧i = getHint();
        ch.f٦٩١٨j = getHelperText();
        ch.f٦٩١٩k = getPlaceholderText();
        return ch;
    }

    /* renamed from: q  reason: contains not printable characters */
    public void m٤٦٨٣q(TextView textView, int i) {
        boolean z = true;
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            textView.setTextAppearance(2131755396);
            Context context = getContext();
            Object obj = p٠٧٦u.AbstractCb.f٨٦٢٧a;
            textView.setTextColor(p٠٧٩v.AbstractCc.m٦٣٥٥a(context, R.color.design_error));
        }
    }

    /* renamed from: r  reason: contains not printable characters */
    public final void m٤٦٨٤r() {
        if (this.f٦٨٩٤s != null) {
            EditText editText = this.f٦٨٧٤i;
            m٤٦٨٥s(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: s  reason: contains not printable characters */
    public void m٤٦٨٥s(int i) {
        boolean z = this.f٦٨٩٢r;
        int i2 = this.f٦٨٩٠q;
        if (i2 == -1) {
            this.f٦٨٩٤s.setText(String.valueOf(i));
            this.f٦٨٩٤s.setContentDescription(null);
            this.f٦٨٩٢r = false;
        } else {
            this.f٦٨٩٢r = i > i2;
            Context context = getContext();
            this.f٦٨٩٤s.setContentDescription(context.getString(this.f٦٨٩٢r ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.f٦٨٩٠q)));
            if (z != this.f٦٨٩٢r) {
                m٤٦٨٦t();
            }
            Cb cb = Cb.m٤٤٠٦c();
            TextView textView = this.f٦٨٩٤s;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f٦٨٩٠q));
            textView.setText(string != null ? cb.m٤٤٠٧d(string, cb.f٦٤٣٠c, true).toString() : null);
        }
        if (this.f٦٨٧٤i == null || z == this.f٦٨٩٢r) {
            return;
        }
        m٤٦٩٢z(false, false);
        m٤٦٦٨E();
        m٤٦٨٨v();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f٦٨٦٠V != i) {
            this.f٦٨٦٠V = i;
            this.f٦٨٢٨A0 = i;
            this.f٦٨٣٢C0 = i;
            this.f٦٨٣٤D0 = i;
            m٤٦٧١c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        Context context = getContext();
        Object obj = p٠٧٦u.AbstractCb.f٨٦٢٧a;
        setBoxBackgroundColor(p٠٧٩v.AbstractCc.m٦٣٥٥a(context, i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f٦٨٢٨A0 = defaultColor;
        this.f٦٨٦٠V = defaultColor;
        this.f٦٨٣٠B0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f٦٨٣٢C0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f٦٨٣٤D0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m٤٦٧١c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f٦٨٥٤P) {
            return;
        }
        this.f٦٨٥٤P = i;
        if (this.f٦٨٧٤i != null) {
            m٤٦٨٠l();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f٦٨٥٥Q = i;
    }

    public void setBoxStrokeColor(int i) {
        if (this.f٦٩٠٧y0 != i) {
            this.f٦٩٠٧y0 = i;
            m٤٦٦٨E();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f٦٩٠٧y0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            m٤٦٦٨E();
        }
        this.f٦٩٠٣w0 = colorStateList.getDefaultColor();
        this.f٦٨٣٦E0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f٦٩٠٥x0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f٦٩٠٧y0 = defaultColor;
        m٤٦٦٨E();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f٦٩٠٩z0 != colorStateList) {
            this.f٦٩٠٩z0 = colorStateList;
            m٤٦٦٨E();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f٦٨٥٧S = i;
        m٤٦٦٨E();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f٦٨٥٨T = i;
        m٤٦٦٨E();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f٦٨٨٨p != z) {
            if (z) {
                Cy0 cy0 = new Cy0(getContext());
                this.f٦٨٩٤s = cy0;
                cy0.setId(R.id.textinput_counter);
                Typeface typeface = this.f٦٨٦٤c0;
                if (typeface != null) {
                    this.f٦٨٩٤s.setTypeface(typeface);
                }
                this.f٦٨٩٤s.setMaxLines(1);
                this.f٦٨٨٦o.m٦٣٢٥a(this.f٦٨٩٤s, 2);
                p٠١٨e0.AbstractCm.m٥٠٦٦h((ViewGroup.MarginLayoutParams) this.f٦٨٩٤s.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                m٤٦٨٦t();
                m٤٦٨٤r();
            } else {
                this.f٦٨٨٦o.m٦٣٣٤j(this.f٦٨٩٤s, 2);
                this.f٦٨٩٤s = null;
            }
            this.f٦٨٨٨p = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f٦٨٩٠q != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f٦٨٩٠q = i;
            if (this.f٦٨٨٨p) {
                m٤٦٨٤r();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f٦٨٩٦t != i) {
            this.f٦٨٩٦t = i;
            m٤٦٨٦t();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f٦٨٣٣D != colorStateList) {
            this.f٦٨٣٣D = colorStateList;
            m٤٦٨٦t();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f٦٨٩٨u != i) {
            this.f٦٨٩٨u = i;
            m٤٦٨٦t();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f٦٨٣١C != colorStateList) {
            this.f٦٨٣١C = colorStateList;
            m٤٦٨٦t();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f٦٨٩٩u0 = colorStateList;
        this.f٦٩٠١v0 = colorStateList;
        if (this.f٦٨٧٤i != null) {
            m٤٦٩٢z(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m٤٦٦٢n(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f٦٨٧٥i0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f٦٨٧٥i0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f٦٨٧٥i0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? p٠١٧e.AbstractCa.m٤٩٠٧b(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f٦٨٧٥i0.setImageDrawable(drawable);
        if (drawable != null) {
            p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٨٧٥i0, this.f٦٨٧٩k0, this.f٦٨٨١l0);
            m٤٦٨٢o();
        }
    }

    public void setEndIconMode(int i) {
        int i2 = this.f٦٨٧١g0;
        if (i2 == i) {
            return;
        }
        this.f٦٨٧١g0 = i;
        Iterator it = this.f٦٨٧٧j0.iterator();
        while (true) {
            if (it.hasNext()) {
                p٠٧٨u1.Cd cd = (p٠٧٨u1.Cd) ((InterfaceCg) it.next());
                switch (cd.f٨٦٥٣a) {
                    case HookMode.AUTO /* 0 */:
                        EditText editText = getEditText();
                        if (editText != null && i2 == 2) {
                            editText.post(new RunnableCf(cd, editText));
                            if (editText.getOnFocusChangeListener() == ((Cg) cd.f٨٦٥٤b).f٨٦٦٠f) {
                                editText.setOnFocusChangeListener(null);
                            }
                            View.OnFocusChangeListener onFocusChangeListener = ((Cg) cd.f٨٦٥٤b).f٨٦٩٠c.getOnFocusChangeListener();
                            Cg cg = (Cg) cd.f٨٦٥٤b;
                            if (onFocusChangeListener != cg.f٨٦٦٠f) {
                                break;
                            } else {
                                cg.f٨٦٩٠c.setOnFocusChangeListener(null);
                                break;
                            }
                        }
                        break;
                    case 1:
                        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) getEditText();
                        if (autoCompleteTextView != null && i2 == 3) {
                            autoCompleteTextView.post(new RunnableCf(cd, autoCompleteTextView));
                            if (autoCompleteTextView.getOnFocusChangeListener() == ((Cn) cd.f٨٦٥٤b).f٨٦٧٤f) {
                                autoCompleteTextView.setOnFocusChangeListener(null);
                            }
                            autoCompleteTextView.setOnTouchListener(null);
                            autoCompleteTextView.setOnDismissListener(null);
                        }
                        if (i2 != 3) {
                            break;
                        } else {
                            removeOnAttachStateChangeListener(((Cn) cd.f٨٦٥٤b).f٨٦٧٨j);
                            Cn cn = (Cn) cd.f٨٦٥٤b;
                            AccessibilityManager accessibilityManager = cn.f٨٦٨٥q;
                            if (accessibilityManager == null) {
                                break;
                            } else {
                                p٠٢٢f0.AbstractCc.m٥٢٤٥b(accessibilityManager, cn.f٨٦٧٩k);
                                break;
                            }
                        }
                    default:
                        EditText editText2 = getEditText();
                        if (editText2 != null && i2 == 1) {
                            editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            editText2.post(new RunnableCf(cd, editText2, null));
                            break;
                        }
                        break;
                }
            } else {
                setEndIconVisible(i != 0);
                if (getEndIconDelegate().mo٦٣٢٣b(this.f٦٨٥٤P)) {
                    getEndIconDelegate().mo٦٣٤١a();
                    p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٨٧٥i0, this.f٦٨٧٩k0, this.f٦٨٨١l0);
                    return;
                }
                StringBuilder sb = AbstractCa.m٢٨٧٢a("The current box background mode ");
                sb.append(this.f٦٨٥٤P);
                sb.append(" is not supported by the end icon mode ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f٦٨٧٥i0;
        View.OnLongClickListener onLongClickListener = this.f٦٨٨٩p0;
        checkableImageButton.setOnClickListener(onClickListener);
        m٤٦٦٣p(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f٦٨٨٩p0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f٦٨٧٥i0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m٤٦٦٣p(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f٦٨٧٩k0 != colorStateList) {
            this.f٦٨٧٩k0 = colorStateList;
            p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٨٧٥i0, colorStateList, this.f٦٨٨١l0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f٦٨٨١l0 != mode) {
            this.f٦٨٨١l0 = mode;
            p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٨٧٥i0, this.f٦٨٧٩k0, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        if (m٤٦٧٨j() != z) {
            this.f٦٨٧٥i0.setVisibility(z ? 0 : 8);
            m٤٦٨٩w();
            m٤٦٦٦C();
            m٤٦٨٧u();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f٦٨٨٦o.f٨٧٠٨k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Cr cr = this.f٦٨٨٦o;
            cr.m٦٣٢٧c();
            cr.f٨٧٠٧j = charSequence;
            cr.f٨٧٠٩l.setText(charSequence);
            int i = cr.f٨٧٠٥h;
            if (i != 1) {
                cr.f٨٧٠٦i = 1;
            }
            cr.m٦٣٣٦l(i, cr.f٨٧٠٦i, cr.m٦٣٣٥k(cr.f٨٧٠٩l, charSequence));
            return;
        }
        this.f٦٨٨٦o.m٦٣٣٣i();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        Cr cr = this.f٦٨٨٦o;
        cr.f٨٧١٠m = charSequence;
        TextView textView = cr.f٨٧٠٩l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        Cr cr = this.f٦٨٨٦o;
        if (cr.f٨٧٠٨k == z) {
            return;
        }
        cr.m٦٣٢٧c();
        if (z) {
            Cy0 cy0 = new Cy0(cr.f٨٦٩٨a);
            cr.f٨٧٠٩l = cy0;
            cy0.setId(R.id.textinput_error);
            cr.f٨٧٠٩l.setTextAlignment(5);
            Typeface typeface = cr.f٨٧١٨u;
            if (typeface != null) {
                cr.f٨٧٠٩l.setTypeface(typeface);
            }
            int i = cr.f٨٧١١n;
            cr.f٨٧١١n = i;
            TextView textView = cr.f٨٧٠٩l;
            if (textView != null) {
                cr.f٨٦٩٩b.m٤٦٨٣q(textView, i);
            }
            ColorStateList colorStateList = cr.f٨٧١٢o;
            cr.f٨٧١٢o = colorStateList;
            TextView textView2 = cr.f٨٧٠٩l;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            CharSequence charSequence = cr.f٨٧١٠m;
            cr.f٨٧١٠m = charSequence;
            TextView textView3 = cr.f٨٧٠٩l;
            if (textView3 != null) {
                textView3.setContentDescription(charSequence);
            }
            cr.f٨٧٠٩l.setVisibility(4);
            AbstractCh0.m٥٠٠٩f(cr.f٨٧٠٩l, 1);
            cr.m٦٣٢٥a(cr.f٨٧٠٩l, 0);
        } else {
            cr.m٦٣٣٣i();
            cr.m٦٣٣٤j(cr.f٨٧٠٩l, 0);
            cr.f٨٧٠٩l = null;
            cr.f٨٦٩٩b.m٤٦٨٨v();
            cr.f٨٦٩٩b.m٤٦٦٨E();
        }
        cr.f٨٧٠٨k = z;
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? p٠١٧e.AbstractCa.m٤٩٠٧b(getContext(), i) : null);
        p٠١٠c.AbstractCb.m٤٣٦٢n(this, this.f٦٨٩٣r0, this.f٦٨٩٥s0);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f٦٨٩٣r0.setImageDrawable(drawable);
        m٤٦٩٠x();
        p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٨٩٣r0, this.f٦٨٩٥s0, this.f٦٨٩٧t0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f٦٨٩٣r0;
        View.OnLongClickListener onLongClickListener = this.f٦٨٩١q0;
        checkableImageButton.setOnClickListener(onClickListener);
        m٤٦٦٣p(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f٦٨٩١q0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f٦٨٩٣r0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m٤٦٦٣p(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.f٦٨٩٥s0 != colorStateList) {
            this.f٦٨٩٥s0 = colorStateList;
            p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٨٩٣r0, colorStateList, this.f٦٨٩٧t0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.f٦٨٩٧t0 != mode) {
            this.f٦٨٩٧t0 = mode;
            p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٨٩٣r0, this.f٦٨٩٥s0, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        Cr cr = this.f٦٨٨٦o;
        cr.f٨٧١١n = i;
        TextView textView = cr.f٨٧٠٩l;
        if (textView != null) {
            cr.f٨٦٩٩b.m٤٦٨٣q(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        Cr cr = this.f٦٨٨٦o;
        cr.f٨٧١٢o = colorStateList;
        TextView textView = cr.f٨٧٠٩l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f٦٨٤٢H0 != z) {
            this.f٦٨٤٢H0 = z;
            m٤٦٩٢z(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.f٦٨٨٦o.f٨٧١٤q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.f٦٨٨٦o.f٨٧١٤q) {
            setHelperTextEnabled(true);
        }
        Cr cr = this.f٦٨٨٦o;
        cr.m٦٣٢٧c();
        cr.f٨٧١٣p = charSequence;
        cr.f٨٧١٥r.setText(charSequence);
        int i = cr.f٨٧٠٥h;
        if (i != 2) {
            cr.f٨٧٠٦i = 2;
        }
        cr.m٦٣٣٦l(i, cr.f٨٧٠٦i, cr.m٦٣٣٥k(cr.f٨٧١٥r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        Cr cr = this.f٦٨٨٦o;
        cr.f٨٧١٧t = colorStateList;
        TextView textView = cr.f٨٧١٥r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        Cr cr = this.f٦٨٨٦o;
        if (cr.f٨٧١٤q == z) {
            return;
        }
        cr.m٦٣٢٧c();
        if (z) {
            Cy0 cy0 = new Cy0(cr.f٨٦٩٨a);
            cr.f٨٧١٥r = cy0;
            cy0.setId(R.id.textinput_helper_text);
            cr.f٨٧١٥r.setTextAlignment(5);
            Typeface typeface = cr.f٨٧١٨u;
            if (typeface != null) {
                cr.f٨٧١٥r.setTypeface(typeface);
            }
            cr.f٨٧١٥r.setVisibility(4);
            AbstractCh0.m٥٠٠٩f(cr.f٨٧١٥r, 1);
            int i = cr.f٨٧١٦s;
            cr.f٨٧١٦s = i;
            TextView textView = cr.f٨٧١٥r;
            if (textView != null) {
                textView.setTextAppearance(i);
            }
            ColorStateList colorStateList = cr.f٨٧١٧t;
            cr.f٨٧١٧t = colorStateList;
            TextView textView2 = cr.f٨٧١٥r;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            cr.m٦٣٢٥a(cr.f٨٧١٥r, 1);
            cr.f٨٧١٥r.setAccessibilityDelegate(new Cq(cr));
        } else {
            cr.m٦٣٢٧c();
            int i2 = cr.f٨٧٠٥h;
            if (i2 == 2) {
                cr.f٨٧٠٦i = 0;
            }
            cr.m٦٣٣٦l(i2, cr.f٨٧٠٦i, cr.m٦٣٣٥k(cr.f٨٧١٥r, ""));
            cr.m٦٣٣٤j(cr.f٨٧١٥r, 1);
            cr.f٨٧١٥r = null;
            cr.f٨٦٩٩b.m٤٦٨٨v();
            cr.f٨٦٩٩b.m٤٦٦٨E();
        }
        cr.f٨٧١٤q = z;
    }

    public void setHelperTextTextAppearance(int i) {
        Cr cr = this.f٦٨٨٦o;
        cr.f٨٧١٦s = i;
        TextView textView = cr.f٨٧١٥r;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f٦٨٣٩G) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(FileUtils.FileMode.MODE_ISUID);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f٦٨٤٤I0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f٦٨٣٩G) {
            this.f٦٨٣٩G = z;
            if (z) {
                CharSequence hint = this.f٦٨٧٤i.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f٦٨٤١H)) {
                        setHint(hint);
                    }
                    this.f٦٨٧٤i.setHint((CharSequence) null);
                }
                this.f٦٨٤٣I = true;
            } else {
                this.f٦٨٤٣I = false;
                if (!TextUtils.isEmpty(this.f٦٨٤١H) && TextUtils.isEmpty(this.f٦٨٧٤i.getHint())) {
                    this.f٦٨٧٤i.setHint(this.f٦٨٤١H);
                }
                setHintInternal(null);
            }
            if (this.f٦٨٧٤i != null) {
                m٤٦٩١y();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        Cc cc = this.f٦٨٤٠G0;
        p٠٦٣p1.Cd cd = new p٠٦٣p1.Cd(cc.f٨٠٢٧a.getContext(), i);
        ColorStateList colorStateList = cd.f٨٢٤٤j;
        if (colorStateList != null) {
            cc.f٨٠٤٢m = colorStateList;
        }
        float f = cd.f٨٢٤٥k;
        if (f != 0.0f) {
            cc.f٨٠٤٠k = f;
        }
        ColorStateList colorStateList2 = cd.f٨٢٣٥a;
        if (colorStateList2 != null) {
            cc.f٨٠٢١U = colorStateList2;
        }
        cc.f٨٠١٩S = cd.f٨٢٣٩e;
        cc.f٨٠٢٠T = cd.f٨٢٤٠f;
        cc.f٨٠١٨R = cd.f٨٢٤١g;
        cc.f٨٠٢٢V = cd.f٨٢٤٣i;
        p٠٦٣p1.Ca ca = cc.f٨٠٠١A;
        if (ca != null) {
            ca.f٨٢٢٨c = true;
        }
        Cb0 cb0 = new Cb0(cc);
        cd.m٦٠٤٣a();
        cc.f٨٠٠١A = new p٠٦٣p1.Ca(cb0, cd.f٨٢٤٨n);
        cd.m٦٠٤٥c(cc.f٨٠٢٧a.getContext(), cc.f٨٠٠١A);
        cc.m٥٨٩٥k(false);
        this.f٦٩٠١v0 = this.f٦٨٤٠G0.f٨٠٤٢m;
        if (this.f٦٨٧٤i != null) {
            m٤٦٩٢z(false, false);
            m٤٦٩١y();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f٦٩٠١v0 != colorStateList) {
            if (this.f٦٨٩٩u0 == null) {
                Cc cc = this.f٦٨٤٠G0;
                if (cc.f٨٠٤٢m != colorStateList) {
                    cc.f٨٠٤٢m = colorStateList;
                    cc.m٥٨٩٥k(false);
                }
            }
            this.f٦٩٠١v0 = colorStateList;
            if (this.f٦٨٧٤i != null) {
                m٤٦٩٢z(false, false);
            }
        }
    }

    public void setMaxEms(int i) {
        this.f٦٨٨٠l = i;
        EditText editText = this.f٦٨٧٤i;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f٦٨٨٤n = i;
        EditText editText = this.f٦٨٧٤i;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f٦٨٧٨k = i;
        EditText editText = this.f٦٨٧٤i;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f٦٨٨٢m = i;
        EditText editText = this.f٦٨٧٤i;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f٦٨٧٥i0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? p٠١٧e.AbstractCa.m٤٩٠٧b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f٦٨٧٥i0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f٦٨٧١g0 != 1) {
            setEndIconMode(1);
        } else if (z) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f٦٨٧٩k0 = colorStateList;
        p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٨٧٥i0, colorStateList, this.f٦٨٨١l0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f٦٨٨١l0 = mode;
        p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٨٧٥i0, this.f٦٨٧٩k0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f٦٩٠٤x == null) {
            Cy0 cy0 = new Cy0(getContext());
            this.f٦٩٠٤x = cy0;
            cy0.setId(R.id.textinput_placeholder);
            AbstractCe0.m٤٩٦٧s(this.f٦٩٠٤x, 2);
            Cm cm = new Cm();
            cm.f٨٨٦٢g = 87L;
            TimeInterpolator timeInterpolator = p٠٠٢a1.AbstractCa.f٤٥٠٥a;
            cm.f٨٨٦٣h = timeInterpolator;
            this.f٦٨٢٧A = cm;
            cm.f٨٨٦١f = 67L;
            Cm cm2 = new Cm();
            cm2.f٨٨٦٢g = 87L;
            cm2.f٨٨٦٣h = timeInterpolator;
            this.f٦٨٢٩B = cm2;
            setPlaceholderTextAppearance(this.f٦٩٠٨z);
            setPlaceholderTextColor(this.f٦٩٠٦y);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f٦٩٠٢w) {
                setPlaceholderTextEnabled(true);
            }
            this.f٦٩٠٠v = charSequence;
        }
        EditText editText = this.f٦٨٧٤i;
        m٤٦٦٤A(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f٦٩٠٨z = i;
        TextView textView = this.f٦٩٠٤x;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f٦٩٠٦y != colorStateList) {
            this.f٦٩٠٦y = colorStateList;
            TextView textView = this.f٦٩٠٤x;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f٦٨٦٨f.m٦٣٤٢a(charSequence);
    }

    public void setPrefixTextAppearance(int i) {
        this.f٦٨٦٨f.f٨٧٢٨f.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f٦٨٦٨f.f٨٧٢٨f.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f٦٨٦٨f.f٨٧٣٠h.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        Cw cw = this.f٦٨٦٨f;
        if (cw.f٨٧٣٠h.getContentDescription() != charSequence) {
            cw.f٨٧٣٠h.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? p٠١٧e.AbstractCa.m٤٩٠٧b(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f٦٨٦٨f.m٦٣٤٤c(drawable);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        Cw cw = this.f٦٨٦٨f;
        CheckableImageButton checkableImageButton = cw.f٨٧٣٠h;
        View.OnLongClickListener onLongClickListener = cw.f٨٧٣٣k;
        checkableImageButton.setOnClickListener(onClickListener);
        p٠١٠c.AbstractCb.m٤٣٦٧s(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        Cw cw = this.f٦٨٦٨f;
        cw.f٨٧٣٣k = onLongClickListener;
        CheckableImageButton checkableImageButton = cw.f٨٧٣٠h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p٠١٠c.AbstractCb.m٤٣٦٧s(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        Cw cw = this.f٦٨٦٨f;
        if (cw.f٨٧٣١i != colorStateList) {
            cw.f٨٧٣١i = colorStateList;
            p٠١٠c.AbstractCb.m٤٣٥٠b(cw.f٨٧٢٧e, cw.f٨٧٣٠h, colorStateList, cw.f٨٧٣٢j);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        Cw cw = this.f٦٨٦٨f;
        if (cw.f٨٧٣٢j != mode) {
            cw.f٨٧٣٢j = mode;
            p٠١٠c.AbstractCb.m٤٣٥٠b(cw.f٨٧٢٧e, cw.f٨٧٣٠h, cw.f٨٧٣١i, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f٦٨٦٨f.m٦٣٤٧f(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f٦٨٣٥E = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f٦٨٣٧F.setText(charSequence);
        m٤٦٦٧D();
    }

    public void setSuffixTextAppearance(int i) {
        this.f٦٨٣٧F.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f٦٨٣٧F.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(Ce ce) {
        EditText editText = this.f٦٨٧٤i;
        if (editText != null) {
            AbstractCv0.m٥٢٠٢p(editText, ce);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f٦٨٦٤c0) {
            this.f٦٨٦٤c0 = typeface;
            this.f٦٨٤٠G0.m٥٩٠١r(typeface);
            Cr cr = this.f٦٨٨٦o;
            if (typeface != cr.f٨٧١٨u) {
                cr.f٨٧١٨u = typeface;
                TextView textView = cr.f٨٧٠٩l;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = cr.f٨٧١٥r;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f٦٨٩٤s;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t  reason: contains not printable characters */
    public final void m٤٦٨٦t() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f٦٨٩٤s;
        if (textView != null) {
            m٤٦٨٣q(textView, this.f٦٨٩٢r ? this.f٦٨٩٦t : this.f٦٨٩٨u);
            if (!this.f٦٨٩٢r && (colorStateList2 = this.f٦٨٣١C) != null) {
                this.f٦٨٩٤s.setTextColor(colorStateList2);
            }
            if (!this.f٦٨٩٢r || (colorStateList = this.f٦٨٣٣D) == null) {
                return;
            }
            this.f٦٨٩٤s.setTextColor(colorStateList);
        }
    }

    /* renamed from: u  reason: contains not printable characters */
    public boolean m٤٦٨٧u() {
        boolean z;
        if (this.f٦٨٧٤i == null) {
            return false;
        }
        boolean z2 = true;
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f٦٨٦٨f.getMeasuredWidth() > 0) {
            int measuredWidth = this.f٦٨٦٨f.getMeasuredWidth() - this.f٦٨٧٤i.getPaddingLeft();
            if (this.f٦٨٦٥d0 == null || this.f٦٨٦٧e0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f٦٨٦٥d0 = colorDrawable;
                this.f٦٨٦٧e0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArr = p٠٣٠h0.AbstractCm.m٥٥٠٤a(this.f٦٨٧٤i);
            Drawable drawable = drawableArr[0];
            Drawable drawable2 = this.f٦٨٦٥d0;
            if (drawable != drawable2) {
                p٠٣٠h0.AbstractCm.m٥٥٠٨e(this.f٦٨٧٤i, drawable2, drawableArr[1], drawableArr[2], drawableArr[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.f٦٨٦٥d0 != null) {
                Drawable[] drawableArr2 = p٠٣٠h0.AbstractCm.m٥٥٠٤a(this.f٦٨٧٤i);
                p٠٣٠h0.AbstractCm.m٥٥٠٨e(this.f٦٨٧٤i, null, drawableArr2[1], drawableArr2[2], drawableArr2[3]);
                this.f٦٨٦٥d0 = null;
                z = true;
            }
            z = false;
        }
        if ((this.f٦٨٩٣r0.getVisibility() == 0 || ((m٤٦٧٦h() && m٤٦٧٨j()) || this.f٦٨٣٥E != null)) && this.f٦٨٧٠g.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.f٦٨٣٧F.getMeasuredWidth() - this.f٦٨٧٤i.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = p٠١٨e0.AbstractCm.m٥٠٦١c((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()) + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] drawableArr3 = p٠٣٠h0.AbstractCm.m٥٥٠٤a(this.f٦٨٧٤i);
            Drawable drawable3 = this.f٦٨٨٣m0;
            if (drawable3 == null || this.f٦٨٨٥n0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f٦٨٨٣m0 = colorDrawable2;
                    this.f٦٨٨٥n0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArr3[2];
                Drawable drawable5 = this.f٦٨٨٣m0;
                if (drawable4 != drawable5) {
                    this.f٦٨٨٧o0 = drawableArr3[2];
                    p٠٣٠h0.AbstractCm.m٥٥٠٨e(this.f٦٨٧٤i, drawableArr3[0], drawableArr3[1], drawable5, drawableArr3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.f٦٨٨٥n0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                p٠٣٠h0.AbstractCm.m٥٥٠٨e(this.f٦٨٧٤i, drawableArr3[0], drawableArr3[1], this.f٦٨٨٣m0, drawableArr3[3]);
            }
        } else if (this.f٦٨٨٣m0 == null) {
            return z;
        } else {
            Drawable[] drawableArr4 = p٠٣٠h0.AbstractCm.m٥٥٠٤a(this.f٦٨٧٤i);
            if (drawableArr4[2] == this.f٦٨٨٣m0) {
                p٠٣٠h0.AbstractCm.m٥٥٠٨e(this.f٦٨٧٤i, drawableArr4[0], drawableArr4[1], this.f٦٨٨٧o0, drawableArr4[3]);
            } else {
                z2 = z;
            }
            this.f٦٨٨٣m0 = null;
        }
        return z2;
    }

    /* renamed from: v  reason: contains not printable characters */
    public void m٤٦٨٨v() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f٦٨٧٤i;
        if (editText == null || this.f٦٨٥٤P != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractCj1.f٥٠١٤a;
        Drawable mutate = background.mutate();
        if (this.f٦٨٨٦o.m٦٣٢٩e()) {
            currentTextColor = this.f٦٨٨٦o.m٦٣٣١g();
        } else if (!this.f٦٨٩٢r || (textView = this.f٦٨٩٤s) == null) {
            mutate.clearColorFilter();
            this.f٦٨٧٤i.refreshDrawableState();
            return;
        } else {
            currentTextColor = textView.getCurrentTextColor();
        }
        mutate.setColorFilter(Cp.m٣١٧٢c(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: w  reason: contains not printable characters */
    public final void m٤٦٨٩w() {
        this.f٦٨٧٢h.setVisibility((this.f٦٨٧٥i0.getVisibility() != 0 || m٤٦٧٩k()) ? 8 : 0);
        this.f٦٨٧٠g.setVisibility(m٤٦٧٨j() || m٤٦٧٩k() || !((this.f٦٨٣٥E == null || this.f٦٨٣٨F0) ? true : false) ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: x  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m٤٦٩٠x() {
        boolean z;
        if (getErrorIconDrawable() != null) {
            Cr cr = this.f٦٨٨٦o;
            if (cr.f٨٧٠٨k && cr.m٦٣٢٩e()) {
                z = true;
                this.f٦٨٩٣r0.setVisibility(z ? 0 : 8);
                m٤٦٨٩w();
                m٤٦٦٦C();
                if (m٤٦٧٦h()) {
                    m٤٦٨٧u();
                    return;
                }
                return;
            }
        }
        z = false;
        this.f٦٨٩٣r0.setVisibility(z ? 0 : 8);
        m٤٦٨٩w();
        m٤٦٦٦C();
        if (m٤٦٧٦h()) {
        }
    }

    /* renamed from: y  reason: contains not printable characters */
    public final void m٤٦٩١y() {
        if (this.f٦٨٥٤P != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f٦٨٦٦e.getLayoutParams();
            int i = m٤٦٧٢d();
            if (i != layoutParams.topMargin) {
                layoutParams.topMargin = i;
                this.f٦٨٦٦e.requestLayout();
            }
        }
    }

    /* renamed from: z  reason: contains not printable characters */
    public final void m٤٦٩٢z(boolean z, boolean z2) {
        ColorStateList colorStateList;
        Cc cc;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f٦٨٧٤i;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f٦٨٧٤i;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean z5 = this.f٦٨٨٦o.m٦٣٢٩e();
        ColorStateList colorStateList2 = this.f٦٨٩٩u0;
        if (colorStateList2 != null) {
            Cc cc2 = this.f٦٨٤٠G0;
            if (cc2.f٨٠٤٢m != colorStateList2) {
                cc2.f٨٠٤٢m = colorStateList2;
                cc2.m٥٨٩٥k(false);
            }
            Cc cc3 = this.f٦٨٤٠G0;
            ColorStateList colorStateList3 = this.f٦٨٩٩u0;
            if (cc3.f٨٠٤١l != colorStateList3) {
                cc3.f٨٠٤١l = colorStateList3;
                cc3.m٥٨٩٥k(false);
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f٦٨٩٩u0;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.f٦٨٣٦E0) : this.f٦٨٣٦E0;
            this.f٦٨٤٠G0.m٥٨٩٦m(ColorStateList.valueOf(colorForState));
            Cc cc4 = this.f٦٨٤٠G0;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (cc4.f٨٠٤١l != valueOf) {
                cc4.f٨٠٤١l = valueOf;
                cc4.m٥٨٩٥k(false);
            }
        } else if (z5) {
            Cc cc5 = this.f٦٨٤٠G0;
            TextView textView2 = this.f٦٨٨٦o.f٨٧٠٩l;
            cc5.m٥٨٩٦m(textView2 != null ? textView2.getTextColors() : null);
        } else {
            if (this.f٦٨٩٢r && (textView = this.f٦٨٩٤s) != null) {
                cc = this.f٦٨٤٠G0;
                colorStateList = textView.getTextColors();
            } else if (z4 && (colorStateList = this.f٦٩٠١v0) != null) {
                cc = this.f٦٨٤٠G0;
            }
            cc.m٥٨٩٦m(colorStateList);
        }
        if (z3 || !this.f٦٨٤٢H0 || (isEnabled() && z4)) {
            if (z2 || this.f٦٨٣٨F0) {
                ValueAnimator valueAnimator = this.f٦٨٤٦J0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f٦٨٤٦J0.cancel();
                }
                if (z && this.f٦٨٤٤I0) {
                    m٤٦٧٠b(1.0f);
                } else {
                    this.f٦٨٤٠G0.m٥٨٩٩p(1.0f);
                }
                this.f٦٨٣٨F0 = false;
                if (m٤٦٧٣e()) {
                    m٤٦٨١m();
                }
                EditText editText3 = this.f٦٨٧٤i;
                m٤٦٦٤A(editText3 == null ? 0 : editText3.getText().length());
                Cw cw = this.f٦٨٦٨f;
                cw.f٨٧٣٤l = false;
                cw.m٦٣٤٩h();
                m٤٦٦٧D();
            }
        } else if (z2 || !this.f٦٨٣٨F0) {
            ValueAnimator valueAnimator2 = this.f٦٨٤٦J0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f٦٨٤٦J0.cancel();
            }
            if (z && this.f٦٨٤٤I0) {
                m٤٦٧٠b(0.0f);
            } else {
                this.f٦٨٤٠G0.m٥٨٩٩p(0.0f);
            }
            if (m٤٦٧٣e() && (!((Ci) this.f٦٨٤٥J).f٨٦٦٦D.isEmpty()) && m٤٦٧٣e()) {
                ((Ci) this.f٦٨٤٥J).m٦٣٠٨x(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f٦٨٣٨F0 = true;
            m٤٦٧٧i();
            Cw cw2 = this.f٦٨٦٨f;
            cw2.f٨٧٣٤l = true;
            cw2.m٦٣٤٩h();
            m٤٦٦٧D();
        }
    }
}
