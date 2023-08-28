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
import com.mustache.ultra.R;
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
    public Cm f٦٨٣٦A;

    /* renamed from: A0  reason: contains not printable characters */
    public int f٦٨٣٧A0;

    /* renamed from: B  reason: contains not printable characters */
    public Cm f٦٨٣٨B;

    /* renamed from: B0  reason: contains not printable characters */
    public int f٦٨٣٩B0;

    /* renamed from: C  reason: contains not printable characters */
    public ColorStateList f٦٨٤٠C;

    /* renamed from: C0  reason: contains not printable characters */
    public int f٦٨٤١C0;

    /* renamed from: D  reason: contains not printable characters */
    public ColorStateList f٦٨٤٢D;

    /* renamed from: D0  reason: contains not printable characters */
    public int f٦٨٤٣D0;

    /* renamed from: E  reason: contains not printable characters */
    public CharSequence f٦٨٤٤E;

    /* renamed from: E0  reason: contains not printable characters */
    public int f٦٨٤٥E0;

    /* renamed from: F  reason: contains not printable characters */
    public final TextView f٦٨٤٦F;

    /* renamed from: F0  reason: contains not printable characters */
    public boolean f٦٨٤٧F0;

    /* renamed from: G  reason: contains not printable characters */
    public boolean f٦٨٤٨G;

    /* renamed from: G0  reason: contains not printable characters */
    public final Cc f٦٨٤٩G0;

    /* renamed from: H  reason: contains not printable characters */
    public CharSequence f٦٨٥٠H;

    /* renamed from: H0  reason: contains not printable characters */
    public boolean f٦٨٥١H0;

    /* renamed from: I  reason: contains not printable characters */
    public boolean f٦٨٥٢I;

    /* renamed from: I0  reason: contains not printable characters */
    public boolean f٦٨٥٣I0;

    /* renamed from: J  reason: contains not printable characters */
    public p٠٧٢s1.Ch f٦٨٥٤J;

    /* renamed from: J0  reason: contains not printable characters */
    public ValueAnimator f٦٨٥٥J0;

    /* renamed from: K  reason: contains not printable characters */
    public p٠٧٢s1.Ch f٦٨٥٦K;

    /* renamed from: K0  reason: contains not printable characters */
    public boolean f٦٨٥٧K0;

    /* renamed from: L  reason: contains not printable characters */
    public p٠٧٢s1.Ch f٦٨٥٨L;

    /* renamed from: L0  reason: contains not printable characters */
    public boolean f٦٨٥٩L0;

    /* renamed from: M  reason: contains not printable characters */
    public Ck f٦٨٦٠M;

    /* renamed from: N  reason: contains not printable characters */
    public boolean f٦٨٦١N;

    /* renamed from: O  reason: contains not printable characters */
    public final int f٦٨٦٢O;

    /* renamed from: P  reason: contains not printable characters */
    public int f٦٨٦٣P;

    /* renamed from: Q  reason: contains not printable characters */
    public int f٦٨٦٤Q;

    /* renamed from: R  reason: contains not printable characters */
    public int f٦٨٦٥R;

    /* renamed from: S  reason: contains not printable characters */
    public int f٦٨٦٦S;

    /* renamed from: T  reason: contains not printable characters */
    public int f٦٨٦٧T;

    /* renamed from: U  reason: contains not printable characters */
    public int f٦٨٦٨U;

    /* renamed from: V  reason: contains not printable characters */
    public int f٦٨٦٩V;

    /* renamed from: W  reason: contains not printable characters */
    public final Rect f٦٨٧٠W;

    /* renamed from: a0  reason: contains not printable characters */
    public final Rect f٦٨٧١a0;

    /* renamed from: b0  reason: contains not printable characters */
    public final RectF f٦٨٧٢b0;

    /* renamed from: c0  reason: contains not printable characters */
    public Typeface f٦٨٧٣c0;

    /* renamed from: d0  reason: contains not printable characters */
    public Drawable f٦٨٧٤d0;

    /* renamed from: e  reason: contains not printable characters */
    public final FrameLayout f٦٨٧٥e;

    /* renamed from: e0  reason: contains not printable characters */
    public int f٦٨٧٦e0;

    /* renamed from: f  reason: contains not printable characters */
    public final Cw f٦٨٧٧f;

    /* renamed from: f0  reason: contains not printable characters */
    public final LinkedHashSet f٦٨٧٨f0;

    /* renamed from: g  reason: contains not printable characters */
    public final LinearLayout f٦٨٧٩g;

    /* renamed from: g0  reason: contains not printable characters */
    public int f٦٨٨٠g0;

    /* renamed from: h  reason: contains not printable characters */
    public final FrameLayout f٦٨٨١h;

    /* renamed from: h0  reason: contains not printable characters */
    public final SparseArray f٦٨٨٢h0;

    /* renamed from: i  reason: contains not printable characters */
    public EditText f٦٨٨٣i;

    /* renamed from: i0  reason: contains not printable characters */
    public final CheckableImageButton f٦٨٨٤i0;

    /* renamed from: j  reason: contains not printable characters */
    public CharSequence f٦٨٨٥j;

    /* renamed from: j0  reason: contains not printable characters */
    public final LinkedHashSet f٦٨٨٦j0;

    /* renamed from: k  reason: contains not printable characters */
    public int f٦٨٨٧k;

    /* renamed from: k0  reason: contains not printable characters */
    public ColorStateList f٦٨٨٨k0;

    /* renamed from: l  reason: contains not printable characters */
    public int f٦٨٨٩l;

    /* renamed from: l0  reason: contains not printable characters */
    public PorterDuff.Mode f٦٨٩٠l0;

    /* renamed from: m  reason: contains not printable characters */
    public int f٦٨٩١m;

    /* renamed from: m0  reason: contains not printable characters */
    public Drawable f٦٨٩٢m0;

    /* renamed from: n  reason: contains not printable characters */
    public int f٦٨٩٣n;

    /* renamed from: n0  reason: contains not printable characters */
    public int f٦٨٩٤n0;

    /* renamed from: o  reason: contains not printable characters */
    public final Cr f٦٨٩٥o;

    /* renamed from: o0  reason: contains not printable characters */
    public Drawable f٦٨٩٦o0;

    /* renamed from: p  reason: contains not printable characters */
    public boolean f٦٨٩٧p;

    /* renamed from: p0  reason: contains not printable characters */
    public View.OnLongClickListener f٦٨٩٨p0;

    /* renamed from: q  reason: contains not printable characters */
    public int f٦٨٩٩q;

    /* renamed from: q0  reason: contains not printable characters */
    public View.OnLongClickListener f٦٩٠٠q0;

    /* renamed from: r  reason: contains not printable characters */
    public boolean f٦٩٠١r;

    /* renamed from: r0  reason: contains not printable characters */
    public final CheckableImageButton f٦٩٠٢r0;

    /* renamed from: s  reason: contains not printable characters */
    public TextView f٦٩٠٣s;

    /* renamed from: s0  reason: contains not printable characters */
    public ColorStateList f٦٩٠٤s0;

    /* renamed from: t  reason: contains not printable characters */
    public int f٦٩٠٥t;

    /* renamed from: t0  reason: contains not printable characters */
    public PorterDuff.Mode f٦٩٠٦t0;

    /* renamed from: u  reason: contains not printable characters */
    public int f٦٩٠٧u;

    /* renamed from: u0  reason: contains not printable characters */
    public ColorStateList f٦٩٠٨u0;

    /* renamed from: v  reason: contains not printable characters */
    public CharSequence f٦٩٠٩v;

    /* renamed from: v0  reason: contains not printable characters */
    public ColorStateList f٦٩١٠v0;

    /* renamed from: w  reason: contains not printable characters */
    public boolean f٦٩١١w;

    /* renamed from: w0  reason: contains not printable characters */
    public int f٦٩١٢w0;

    /* renamed from: x  reason: contains not printable characters */
    public TextView f٦٩١٣x;

    /* renamed from: x0  reason: contains not printable characters */
    public int f٦٩١٤x0;

    /* renamed from: y  reason: contains not printable characters */
    public ColorStateList f٦٩١٥y;

    /* renamed from: y0  reason: contains not printable characters */
    public int f٦٩١٦y0;

    /* renamed from: z  reason: contains not printable characters */
    public int f٦٩١٧z;

    /* renamed from: z0  reason: contains not printable characters */
    public ColorStateList f٦٩١٨z0;

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a  reason: invalid class name */
    /* loaded from: classes.dex */
    public class Ca implements TextWatcher {
        public Ca() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m٤٦٩٢z(!textInputLayout.f٦٨٥٩L0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f٦٨٩٧p) {
                textInputLayout2.m٤٦٨٥s(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.f٦٩١١w) {
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
            TextInputLayout.this.f٦٨٨٤i0.performClick();
            TextInputLayout.this.f٦٨٨٤i0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c  reason: invalid class name */
    /* loaded from: classes.dex */
    public class RunnableCc implements Runnable {
        public RunnableCc() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f٦٨٨٣i.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d  reason: invalid class name */
    /* loaded from: classes.dex */
    public class Cd implements ValueAnimator.AnimatorUpdateListener {
        public Cd() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f٦٨٤٩G0.m٥٨٩٩p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e  reason: invalid class name */
    /* loaded from: classes.dex */
    public static class Ce extends p٠١٨e0.Cc {

        /* renamed from: d  reason: contains not printable characters */
        public final TextInputLayout f٦٩٢٣d;

        public Ce(TextInputLayout textInputLayout) {
            this.f٦٩٢٣d = textInputLayout;
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
            this.f٧٢٠٩a.onInitializeAccessibilityNodeInfo(view, cf.f٧٣٠٥a);
            EditText editText = this.f٦٩٢٣d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f٦٩٢٣d.getHint();
            CharSequence error = this.f٦٩٢٣d.getError();
            CharSequence placeholderText = this.f٦٩٢٣d.getPlaceholderText();
            int counterMaxLength = this.f٦٩٢٣d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f٦٩٢٣d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f٦٩٢٣d.f٦٨٤٧F0;
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            Cw cw = this.f٦٩٢٣d.f٦٨٧٧f;
            if (cw.f٨٧٤٢f.getVisibility() == 0) {
                cf.f٧٣٠٥a.setLabelFor(cw.f٨٧٤٢f);
                view2 = cw.f٨٧٤٢f;
            } else {
                view2 = cw.f٨٧٤٤h;
            }
            cf.f٧٣٠٥a.setTraversalAfter(view2);
            if (z) {
                cf.f٧٣٠٥a.setText(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                cf.f٧٣٠٥a.setText(charSequence);
                if (z3 && placeholderText != null) {
                    placeholderText = charSequence + ", " + ((Object) placeholderText);
                    cf.f٧٣٠٥a.setText(placeholderText);
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
                    cf.f٧٣٠٥a.setText(charSequence);
                }
                boolean z6 = !z;
                if (i >= 26) {
                    cf.f٧٣٠٥a.setShowingHintText(z6);
                } else {
                    cf.m٥٢٥٣h(4, z6);
                }
            }
            cf.f٧٣٠٥a.setMaxTextLength((text == null || text.length() != counterMaxLength) ? -1 : -1);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                cf.f٧٣٠٥a.setError(error);
            }
            TextView textView = this.f٦٩٢٣d.f٦٨٩٥o.f٨٧٢٩r;
            if (textView != null) {
                cf.f٧٣٠٥a.setLabelFor(textView);
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
        public CharSequence f٦٩٢٤g;

        /* renamed from: h  reason: contains not printable characters */
        public boolean f٦٩٢٥h;

        /* renamed from: i  reason: contains not printable characters */
        public CharSequence f٦٩٢٦i;

        /* renamed from: j  reason: contains not printable characters */
        public CharSequence f٦٩٢٧j;

        /* renamed from: k  reason: contains not printable characters */
        public CharSequence f٦٩٢٨k;

        public Ch(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f٦٩٢٤g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f٦٩٢٥h = parcel.readInt() == 1;
            this.f٦٩٢٦i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f٦٩٢٧j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f٦٩٢٨k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public Ch(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = AbstractCa.m٢٨٧٢a("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            sb.append((Object) this.f٦٩٢٤g);
            sb.append(" hint=");
            sb.append((Object) this.f٦٩٢٦i);
            sb.append(" helperText=");
            sb.append((Object) this.f٦٩٢٧j);
            sb.append(" placeholderText=");
            sb.append((Object) this.f٦٩٢٨k);
            sb.append("}");
            return sb.toString();
        }

        @Override // p٠٣٨j0.AbstractCb, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f٧٦٥١e, i);
            TextUtils.writeToParcel(this.f٦٩٢٤g, parcel, i);
            parcel.writeInt(this.f٦٩٢٥h ? 1 : 0);
            TextUtils.writeToParcel(this.f٦٩٢٦i, parcel, i);
            TextUtils.writeToParcel(this.f٦٩٢٧j, parcel, i);
            TextUtils.writeToParcel(this.f٦٩٢٨k, parcel, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v63 */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(p٠٨١v1.AbstractCa.m٦٣٥٩a(context, attributeSet, R.attr.textInputStyle, 2131755799), attributeSet, R.attr.textInputStyle);
        ?? r6;
        int colorForState;
        this.f٦٨٨٧k = -1;
        this.f٦٨٨٩l = -1;
        this.f٦٨٩١m = -1;
        this.f٦٨٩٣n = -1;
        this.f٦٨٩٥o = new Cr(this);
        this.f٦٨٧٠W = new Rect();
        this.f٦٨٧١a0 = new Rect();
        this.f٦٨٧٢b0 = new RectF();
        this.f٦٨٧٨f0 = new LinkedHashSet();
        this.f٦٨٨٠g0 = 0;
        SparseArray sparseArray = new SparseArray();
        this.f٦٨٨٢h0 = sparseArray;
        this.f٦٨٨٦j0 = new LinkedHashSet();
        Cc cc = new Cc(this);
        this.f٦٨٤٩G0 = cc;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f٦٨٧٥e = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f٦٨٨١h = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f٦٨٧٩g = linearLayout;
        Cy0 cy0 = new Cy0(context2);
        this.f٦٨٤٦F = cy0;
        linearLayout.setVisibility(8);
        frameLayout2.setVisibility(8);
        cy0.setVisibility(8);
        LayoutInflater from = LayoutInflater.from(context2);
        CheckableImageButton checkableImageButton = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) linearLayout, false);
        this.f٦٩٠٢r0 = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.f٦٨٨٤i0 = checkableImageButton2;
        frameLayout.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = p٠٠٢a1.AbstractCa.f٤٥١٤a;
        cc.f٨٠٣١Q = timeInterpolator;
        cc.m٥٨٩٥k(false);
        cc.f٨٠٣٠P = timeInterpolator;
        cc.m٥٨٩٥k(false);
        cc.m٥٨٩٧n(8388659);
        int[] iArr = p٠٩٢z0.AbstractCa.f٨٩٧٩A;
        AbstractCm.m٥٩٠٨a(context2, attributeSet, R.attr.textInputStyle, 2131755799);
        AbstractCm.m٥٩٠٩b(context2, attributeSet, iArr, R.attr.textInputStyle, 2131755799, 22, 20, 35, 40, 44);
        Cv2 cv2 = new Cv2(context2, context2.obtainStyledAttributes(attributeSet, iArr, R.attr.textInputStyle, 2131755799));
        Cw cw = new Cw(this, cv2);
        this.f٦٨٧٧f = cw;
        this.f٦٨٤٨G = cv2.m٣٢٥٩o(43, true);
        setHint(cv2.m٣٢٣٦E(4));
        this.f٦٨٥٣I0 = cv2.m٣٢٥٩o(42, true);
        this.f٦٨٥١H0 = cv2.m٣٢٥٩o(37, true);
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
        this.f٦٨٦٠M = Ck.m٦٢٤٣b(context2, attributeSet, R.attr.textInputStyle, 2131755799).m٦٢٤٨a();
        this.f٦٨٦٢O = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f٦٨٦٤Q = cv2.m٣٢٦٤t(9, 0);
        this.f٦٨٦٦S = cv2.m٣٢٦٥u(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f٦٨٦٧T = cv2.m٣٢٦٥u(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f٦٨٦٥R = this.f٦٨٦٦S;
        float f = cv2.m٣٢٦٣s(13, -1.0f);
        float f2 = cv2.m٣٢٦٣s(12, -1.0f);
        float f3 = cv2.m٣٢٦٣s(10, -1.0f);
        float f4 = cv2.m٣٢٦٣s(11, -1.0f);
        Ck ck = this.f٦٨٦٠M;
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
        this.f٦٨٦٠M = ca.m٦٢٤٨a();
        ColorStateList colorStateList = AbstractCc.m٤٣٨٤j(context2, cv2, 7);
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            this.f٦٨٣٧A0 = defaultColor;
            this.f٦٨٦٩V = defaultColor;
            if (colorStateList.isStateful()) {
                this.f٦٨٣٩B0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f٦٨٤١C0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
                colorForState = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.f٦٨٤١C0 = this.f٦٨٣٧A0;
                ColorStateList colorStateList2 = p٠١٧e.AbstractCa.m٤٩٠٦a(context2, R.color.mtrl_filled_background_color);
                this.f٦٨٣٩B0 = colorStateList2.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateList2.getColorForState(new int[]{16843623}, -1);
            }
            this.f٦٨٤٣D0 = colorForState;
        } else {
            this.f٦٨٦٩V = 0;
            this.f٦٨٣٧A0 = 0;
            this.f٦٨٣٩B0 = 0;
            this.f٦٨٤١C0 = 0;
            this.f٦٨٤٣D0 = 0;
        }
        if (cv2.m٣٢٣٧F(1)) {
            ColorStateList colorStateList3 = cv2.m٣٢٦٢r(1);
            this.f٦٩١٠v0 = colorStateList3;
            this.f٦٩٠٨u0 = colorStateList3;
        }
        ColorStateList colorStateList4 = AbstractCc.m٤٣٨٤j(context2, cv2, 14);
        this.f٦٩١٦y0 = cv2.m٣٢٦١q(14, 0);
        Object obj = p٠٧٦u.AbstractCb.f٨٦٤١a;
        this.f٦٩١٢w0 = p٠٧٩v.AbstractCc.m٦٣٥٥a(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.f٦٨٤٥E0 = p٠٧٩v.AbstractCc.m٦٣٥٥a(context2, R.color.mtrl_textinput_disabled_color);
        this.f٦٩١٤x0 = p٠٧٩v.AbstractCc.m٦٣٥٥a(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
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
            this.f٦٩٠٤s0 = AbstractCc.m٤٣٨٤j(context2, cv2, 33);
        }
        if (cv2.m٣٢٣٧F(34)) {
            this.f٦٩٠٦t0 = AbstractCq.m٥٩١٤b(cv2.m٣٢٣٢A(34, -1), null);
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
        this.f٦٩٠٧u = cv2.m٣٢٣٤C(22, 0);
        this.f٦٩٠٥t = cv2.m٣٢٣٤C(20, 0);
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
                this.f٦٨٨٨k0 = AbstractCc.m٤٣٨٤j(context2, cv2, 28);
            }
            if (cv2.m٣٢٣٧F(29)) {
                this.f٦٨٩٠l0 = AbstractCq.m٥٩١٤b(cv2.m٣٢٣٢A(29, -1), null);
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
                this.f٦٨٨٨k0 = AbstractCc.m٤٣٨٤j(context2, cv2, 49);
            }
            if (cv2.m٣٢٣٧F(50)) {
                this.f٦٨٩٠l0 = AbstractCq.m٥٩١٤b(cv2.m٣٢٣٢A(50, -1), null);
            }
            setEndIconMode(cv2.m٣٢٥٩o(48, false) ? 1 : 0);
            setEndIconContentDescription(cv2.m٣٢٣٦E(46));
        }
        cy0.setId(R.id.textinput_suffix_text);
        cy0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        AbstractCh0.m٥٠٠٩f(cy0, 1);
        setErrorContentDescription(charSequence);
        setCounterOverflowTextAppearance(this.f٦٩٠٥t);
        setHelperTextTextAppearance(i2);
        setErrorTextAppearance(i);
        setCounterTextAppearance(this.f٦٩٠٧u);
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
        AbstractCo abstractCo = (AbstractCo) this.f٦٨٨٢h0.get(this.f٦٨٨٠g0);
        return abstractCo != null ? abstractCo : (AbstractCo) this.f٦٨٨٢h0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f٦٩٠٢r0.getVisibility() == 0) {
            return this.f٦٩٠٢r0;
        }
        if (m٤٦٧٦h() && m٤٦٧٨j()) {
            return this.f٦٨٨٤i0;
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
        WeakHashMap weakHashMap = AbstractCv0.f٧٢٧٥a;
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
        if (this.f٦٨٨٣i != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f٦٨٨٠g0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f٦٨٨٣i = editText;
        int i = this.f٦٨٨٧k;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f٦٨٩١m);
        }
        int i2 = this.f٦٨٨٩l;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f٦٨٩٣n);
        }
        m٤٦٨٠l();
        setTextInputAccessibilityDelegate(new Ce(this));
        this.f٦٨٤٩G0.m٥٩٠١r(this.f٦٨٨٣i.getTypeface());
        Cc cc = this.f٦٨٤٩G0;
        float textSize = this.f٦٨٨٣i.getTextSize();
        if (cc.f٨٠٥٣j != textSize) {
            cc.f٨٠٥٣j = textSize;
            cc.m٥٨٩٥k(false);
        }
        Cc cc2 = this.f٦٨٤٩G0;
        float letterSpacing = this.f٦٨٨٣i.getLetterSpacing();
        if (cc2.f٨٠٣٧W != letterSpacing) {
            cc2.f٨٠٣٧W = letterSpacing;
            cc2.m٥٨٩٥k(false);
        }
        int gravity = this.f٦٨٨٣i.getGravity();
        this.f٦٨٤٩G0.m٥٨٩٧n((gravity & (-113)) | 48);
        Cc cc3 = this.f٦٨٤٩G0;
        if (cc3.f٨٠٥١h != gravity) {
            cc3.f٨٠٥١h = gravity;
            cc3.m٥٨٩٥k(false);
        }
        this.f٦٨٨٣i.addTextChangedListener(new Ca());
        if (this.f٦٩٠٨u0 == null) {
            this.f٦٩٠٨u0 = this.f٦٨٨٣i.getHintTextColors();
        }
        if (this.f٦٨٤٨G) {
            if (TextUtils.isEmpty(this.f٦٨٥٠H)) {
                CharSequence hint = this.f٦٨٨٣i.getHint();
                this.f٦٨٨٥j = hint;
                setHint(hint);
                this.f٦٨٨٣i.setHint((CharSequence) null);
            }
            this.f٦٨٥٢I = true;
        }
        if (this.f٦٩٠٣s != null) {
            m٤٦٨٥s(this.f٦٨٨٣i.getText().length());
        }
        m٤٦٨٨v();
        this.f٦٨٩٥o.m٦٣٢٦b();
        this.f٦٨٧٧f.bringToFront();
        this.f٦٨٧٩g.bringToFront();
        this.f٦٨٨١h.bringToFront();
        this.f٦٩٠٢r0.bringToFront();
        Iterator it = this.f٦٨٧٨f0.iterator();
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
        if (TextUtils.equals(charSequence, this.f٦٨٥٠H)) {
            return;
        }
        this.f٦٨٥٠H = charSequence;
        Cc cc = this.f٦٨٤٩G0;
        if (charSequence == null || !TextUtils.equals(cc.f٨٠١٦B, charSequence)) {
            cc.f٨٠١٦B = charSequence;
            cc.f٨٠١٧C = null;
            Bitmap bitmap = cc.f٨٠١٩E;
            if (bitmap != null) {
                bitmap.recycle();
                cc.f٨٠١٩E = null;
            }
            cc.m٥٨٩٥k(false);
        }
        if (this.f٦٨٤٧F0) {
            return;
        }
        m٤٦٨١m();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f٦٩١١w == z) {
            return;
        }
        if (z) {
            TextView textView = this.f٦٩١٣x;
            if (textView != null) {
                this.f٦٨٧٥e.addView(textView);
                this.f٦٩١٣x.setVisibility(0);
            }
        } else {
            TextView textView2 = this.f٦٩١٣x;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.f٦٩١٣x = null;
        }
        this.f٦٩١١w = z;
    }

    /* renamed from: A  reason: contains not printable characters */
    public final void m٤٦٦٤A(int i) {
        if (i == 0 && !this.f٦٨٤٧F0) {
            if (this.f٦٩١٣x == null || !this.f٦٩١١w || TextUtils.isEmpty(this.f٦٩٠٩v)) {
                return;
            }
            this.f٦٩١٣x.setText(this.f٦٩٠٩v);
            AbstractCv.m٦٥٠٤a(this.f٦٨٧٥e, this.f٦٨٣٦A);
            this.f٦٩١٣x.setVisibility(0);
            this.f٦٩١٣x.bringToFront();
            announceForAccessibility(this.f٦٩٠٩v);
            return;
        }
        m٤٦٧٧i();
    }

    /* renamed from: B  reason: contains not printable characters */
    public final void m٤٦٦٥B(boolean z, boolean z2) {
        int defaultColor = this.f٦٩١٨z0.getDefaultColor();
        int colorForState = this.f٦٩١٨z0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f٦٩١٨z0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f٦٨٦٨U = colorForState2;
        } else if (z2) {
            this.f٦٨٦٨U = colorForState;
        } else {
            this.f٦٨٦٨U = defaultColor;
        }
    }

    /* renamed from: C  reason: contains not printable characters */
    public final void m٤٦٦٦C() {
        int i;
        if (this.f٦٨٨٣i == null) {
            return;
        }
        if (m٤٦٧٨j() || m٤٦٧٩k()) {
            i = 0;
        } else {
            EditText editText = this.f٦٨٨٣i;
            WeakHashMap weakHashMap = AbstractCv0.f٧٢٧٥a;
            i = AbstractCf0.m٤٩٨٣e(editText);
        }
        TextView textView = this.f٦٨٤٦F;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.f٦٨٨٣i.getPaddingTop();
        int paddingBottom = this.f٦٨٨٣i.getPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractCv0.f٧٢٧٥a;
        AbstractCf0.m٤٩٨٩k(textView, dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    /* renamed from: D  reason: contains not printable characters */
    public final void m٤٦٦٧D() {
        int visibility = this.f٦٨٤٦F.getVisibility();
        int i = (this.f٦٨٤٤E == null || this.f٦٨٤٧F0) ? 8 : 0;
        if (visibility != i) {
            getEndIconDelegate().mo٦٣٢٤c(i == 0);
        }
        m٤٦٨٩w();
        this.f٦٨٤٦F.setVisibility(i);
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
        if (this.f٦٨٥٤J == null || this.f٦٨٦٣P == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f٦٨٨٣i) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f٦٨٨٣i) != null && editText.isHovered())) {
            z = true;
        }
        if (isEnabled()) {
            if (this.f٦٨٩٥o.m٦٣٢٩e()) {
                if (this.f٦٩١٨z0 == null) {
                    i = this.f٦٨٩٥o.m٦٣٣١g();
                }
                m٤٦٦٥B(z2, z);
            } else if (!this.f٦٩٠١r || (textView = this.f٦٩٠٣s) == null) {
                i = z2 ? this.f٦٩١٦y0 : z ? this.f٦٩١٤x0 : this.f٦٩١٢w0;
            } else {
                if (this.f٦٩١٨z0 == null) {
                    i = textView.getCurrentTextColor();
                }
                m٤٦٦٥B(z2, z);
            }
            m٤٦٩٠x();
            p٠١٠c.AbstractCb.m٤٣٦٢n(this, this.f٦٩٠٢r0, this.f٦٩٠٤s0);
            Cw cw = this.f٦٨٧٧f;
            p٠١٠c.AbstractCb.m٤٣٦٢n(cw.f٨٧٤١e, cw.f٨٧٤٤h, cw.f٨٧٤٥i);
            m٤٦٨٢o();
            endIconDelegate = getEndIconDelegate();
            Objects.requireNonNull(endIconDelegate);
            if (endIconDelegate instanceof Cn) {
                if (!this.f٦٨٩٥o.m٦٣٢٩e() || getEndIconDrawable() == null) {
                    p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٨٨٤i0, this.f٦٨٨٨k0, this.f٦٨٩٠l0);
                } else {
                    Drawable mutate = getEndIconDrawable().mutate();
                    p٠٨٨y.AbstractCb.m٦٥٩٠g(mutate, this.f٦٨٩٥o.m٦٣٣١g());
                    this.f٦٨٨٤i0.setImageDrawable(mutate);
                }
            }
            if (this.f٦٨٦٣P == 2) {
                int i2 = this.f٦٨٦٥R;
                int i3 = (z2 && isEnabled()) ? this.f٦٨٦٧T : this.f٦٨٦٦S;
                this.f٦٨٦٥R = i3;
                if (i3 != i2 && m٤٦٧٣e() && !this.f٦٨٤٧F0) {
                    if (m٤٦٧٣e()) {
                        ((Ci) this.f٦٨٥٤J).m٦٣٠٨x(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    m٤٦٨١m();
                }
            }
            if (this.f٦٨٦٣P == 1) {
                this.f٦٨٦٩V = !isEnabled() ? this.f٦٨٣٩B0 : (!z || z2) ? z2 ? this.f٦٨٤١C0 : this.f٦٨٣٧A0 : this.f٦٨٤٣D0;
            }
            m٤٦٧١c();
        }
        i = this.f٦٨٤٥E0;
        this.f٦٨٦٨U = i;
        m٤٦٩٠x();
        p٠١٠c.AbstractCb.m٤٣٦٢n(this, this.f٦٩٠٢r0, this.f٦٩٠٤s0);
        Cw cw2 = this.f٦٨٧٧f;
        p٠١٠c.AbstractCb.m٤٣٦٢n(cw2.f٨٧٤١e, cw2.f٨٧٤٤h, cw2.f٨٧٤٥i);
        m٤٦٨٢o();
        endIconDelegate = getEndIconDelegate();
        Objects.requireNonNull(endIconDelegate);
        if (endIconDelegate instanceof Cn) {
        }
        if (this.f٦٨٦٣P == 2) {
        }
        if (this.f٦٨٦٣P == 1) {
        }
        m٤٦٧١c();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m٤٦٦٩a(InterfaceCf interfaceCf) {
        this.f٦٨٧٨f0.add(interfaceCf);
        if (this.f٦٨٨٣i != null) {
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
        this.f٦٨٧٥e.addView(view, layoutParams2);
        this.f٦٨٧٥e.setLayoutParams(layoutParams);
        m٤٦٩١y();
        setEditText((EditText) view);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m٤٦٧٠b(float f) {
        if (this.f٦٨٤٩G0.f٨٠٤٥c == f) {
            return;
        }
        if (this.f٦٨٥٥J0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f٦٨٥٥J0 = valueAnimator;
            valueAnimator.setInterpolator(p٠٠٢a1.AbstractCa.f٤٥١٥b);
            this.f٦٨٥٥J0.setDuration(167L);
            this.f٦٨٥٥J0.addUpdateListener(new Cd());
        }
        this.f٦٨٥٥J0.setFloatValues(this.f٦٨٤٩G0.f٨٠٤٥c, f);
        this.f٦٨٥٥J0.start();
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
        p٠٧٢s1.Ch ch2 = this.f٦٨٥٤J;
        if (ch2 == null) {
            return;
        }
        Ck ck = ch2.f٨٥٤٠e.f٨٥١٦a;
        Ck ck2 = this.f٦٨٦٠M;
        boolean z2 = false;
        if (ck != ck2) {
            ch2.setShapeAppearanceModel(ck2);
            if (this.f٦٨٨٠g0 == 3 && this.f٦٨٦٣P == 2) {
                Cn cn = (Cn) this.f٦٨٨٢h0.get(3);
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.f٦٨٨٣i;
                Objects.requireNonNull(cn);
                if (!(autoCompleteTextView.getKeyListener() != null) && cn.f٨٧٠٢a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
                    cn.m٦٣١٨i(autoCompleteTextView);
                }
            }
        }
        if (this.f٦٨٦٣P == 2) {
            if (this.f٦٨٦٥R > -1 && this.f٦٨٦٨U != 0) {
                z = true;
                if (z) {
                    this.f٦٨٥٤J.m٦٢٣٤r(this.f٦٨٦٥R, this.f٦٨٦٨U);
                }
                int i = this.f٦٨٦٩V;
                if (this.f٦٨٦٣P == 1) {
                    i = p٠٨٥x.AbstractCa.m٦٥٣١b(this.f٦٨٦٩V, p٠١٠c.AbstractCb.m٤٣٥٦h(getContext(), R.attr.colorSurface, 0));
                }
                this.f٦٨٦٩V = i;
                this.f٦٨٥٤J.m٦٢٣٢p(ColorStateList.valueOf(i));
                if (this.f٦٨٨٠g0 == 3) {
                    this.f٦٨٨٣i.getBackground().invalidateSelf();
                }
                ch = this.f٦٨٥٦K;
                if (ch != null && this.f٦٨٥٨L != null) {
                    if (this.f٦٨٦٥R > -1 && this.f٦٨٦٨U != 0) {
                        z2 = true;
                    }
                    if (z2) {
                        ch.m٦٢٣٢p(ColorStateList.valueOf(this.f٦٨٨٣i.isFocused() ? this.f٦٩١٢w0 : this.f٦٨٦٨U));
                        this.f٦٨٥٨L.m٦٢٣٢p(ColorStateList.valueOf(this.f٦٨٦٨U));
                    }
                    invalidate();
                }
                invalidate();
            }
        }
        z = false;
        if (z) {
        }
        int i2 = this.f٦٨٦٩V;
        if (this.f٦٨٦٣P == 1) {
        }
        this.f٦٨٦٩V = i2;
        this.f٦٨٥٤J.m٦٢٣٢p(ColorStateList.valueOf(i2));
        if (this.f٦٨٨٠g0 == 3) {
        }
        ch = this.f٦٨٥٦K;
        if (ch != null) {
            if (this.f٦٨٦٥R > -1) {
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
        if (this.f٦٨٤٨G) {
            int i = this.f٦٨٦٣P;
            if (i == 0) {
                f = this.f٦٨٤٩G0.m٥٨٩٠e();
            } else if (i != 2) {
                return 0;
            } else {
                f = this.f٦٨٤٩G0.m٥٨٩٠e() / 2.0f;
            }
            return (int) f;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f٦٨٨٣i;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f٦٨٨٥j != null) {
            boolean z = this.f٦٨٥٢I;
            this.f٦٨٥٢I = false;
            CharSequence hint = editText.getHint();
            this.f٦٨٨٣i.setHint(this.f٦٨٨٥j);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f٦٨٨٣i.setHint(hint);
                this.f٦٨٥٢I = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.f٦٨٧٥e.getChildCount());
        for (int i2 = 0; i2 < this.f٦٨٧٥e.getChildCount(); i2++) {
            View childAt = this.f٦٨٧٥e.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f٦٨٨٣i) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f٦٨٥٩L0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f٦٨٥٩L0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        p٠٧٢s1.Ch ch;
        super.draw(canvas);
        if (this.f٦٨٤٨G) {
            Cc cc = this.f٦٨٤٩G0;
            Objects.requireNonNull(cc);
            int save = canvas.save();
            if (cc.f٨٠١٧C != null && cc.f٨٠٤٣b) {
                cc.f٨٠٢٨N.setTextSize(cc.f٨٠٢١G);
                float f = cc.f٨٠٦١r;
                float f2 = cc.f٨٠٦٢s;
                float f3 = cc.f٨٠٢٠F;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                if (cc.m٥٩٠٢s()) {
                    float lineStart = cc.f٨٠٦١r - cc.f٨٠٣٩Y.getLineStart(0);
                    int alpha = cc.f٨٠٢٨N.getAlpha();
                    canvas.translate(lineStart, f2);
                    float f4 = alpha;
                    cc.f٨٠٢٨N.setAlpha((int) (cc.f٨٠٤٤b0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        TextPaint textPaint = cc.f٨٠٢٨N;
                        float f5 = cc.f٨٠٢٢H;
                        float f6 = cc.f٨٠٢٣I;
                        float f7 = cc.f٨٠٢٤J;
                        int i2 = cc.f٨٠٢٥K;
                        textPaint.setShadowLayer(f5, f6, f7, p٠٨٥x.AbstractCa.m٦٥٣٤e(i2, (Color.alpha(i2) * textPaint.getAlpha()) / 255));
                    }
                    cc.f٨٠٣٩Y.draw(canvas);
                    cc.f٨٠٢٨N.setAlpha((int) (cc.f٨٠٤٢a0 * f4));
                    if (i >= 31) {
                        TextPaint textPaint2 = cc.f٨٠٢٨N;
                        float f8 = cc.f٨٠٢٢H;
                        float f9 = cc.f٨٠٢٣I;
                        float f10 = cc.f٨٠٢٤J;
                        int i3 = cc.f٨٠٢٥K;
                        textPaint2.setShadowLayer(f8, f9, f10, p٠٨٥x.AbstractCa.m٦٥٣٤e(i3, (Color.alpha(i3) * textPaint2.getAlpha()) / 255));
                    }
                    int lineBaseline = cc.f٨٠٣٩Y.getLineBaseline(0);
                    CharSequence charSequence = cc.f٨٠٤٦c0;
                    float f11 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, cc.f٨٠٢٨N);
                    if (i >= 31) {
                        cc.f٨٠٢٨N.setShadowLayer(cc.f٨٠٢٢H, cc.f٨٠٢٣I, cc.f٨٠٢٤J, cc.f٨٠٢٥K);
                    }
                    String trim = cc.f٨٠٤٦c0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    cc.f٨٠٢٨N.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(cc.f٨٠٣٩Y.getLineEnd(0), str.length()), 0.0f, f11, (Paint) cc.f٨٠٢٨N);
                } else {
                    canvas.translate(f, f2);
                    cc.f٨٠٣٩Y.draw(canvas);
                }
                canvas.restoreToCount(save);
            }
        }
        if (this.f٦٨٥٨L == null || (ch = this.f٦٨٥٦K) == null) {
            return;
        }
        ch.draw(canvas);
        if (this.f٦٨٨٣i.isFocused()) {
            Rect bounds = this.f٦٨٥٨L.getBounds();
            Rect bounds2 = this.f٦٨٥٦K.getBounds();
            float f12 = this.f٦٨٤٩G0.f٨٠٤٥c;
            int centerX = bounds2.centerX();
            int i4 = bounds2.left;
            TimeInterpolator timeInterpolator = p٠٠٢a1.AbstractCa.f٤٥١٤a;
            bounds.left = Math.round((i4 - centerX) * f12) + centerX;
            bounds.right = Math.round(f12 * (bounds2.right - centerX)) + centerX;
            this.f٦٨٥٨L.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        if (this.f٦٨٥٧K0) {
            return;
        }
        boolean z3 = true;
        this.f٦٨٥٧K0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Cc cc = this.f٦٨٤٩G0;
        if (cc != null) {
            cc.f٨٠٢٦L = drawableState;
            ColorStateList colorStateList2 = cc.f٨٠٥٦m;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = cc.f٨٠٥٥l) != null && colorStateList.isStateful())) {
                cc.m٥٨٩٥k(false);
                z2 = true;
            } else {
                z2 = false;
            }
            z = z2 | false;
        } else {
            z = false;
        }
        if (this.f٦٨٨٣i != null) {
            WeakHashMap weakHashMap = AbstractCv0.f٧٢٧٥a;
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
        this.f٦٨٥٧K0 = false;
    }

    /* renamed from: e  reason: contains not printable characters */
    public final boolean m٤٦٧٣e() {
        return this.f٦٨٤٨G && !TextUtils.isEmpty(this.f٦٨٥٠H) && (this.f٦٨٥٤J instanceof Ci);
    }

    /* renamed from: f  reason: contains not printable characters */
    public final int m٤٦٧٤f(int i, boolean z) {
        int compoundPaddingLeft = this.f٦٨٨٣i.getCompoundPaddingLeft() + i;
        return (getPrefixText() == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    /* renamed from: g  reason: contains not printable characters */
    public final int m٤٦٧٥g(int i, boolean z) {
        int compoundPaddingRight = i - this.f٦٨٨٣i.getCompoundPaddingRight();
        return (getPrefixText() == null || !z) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f٦٨٨٣i;
        if (editText != null) {
            return m٤٦٧٢d() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public p٠٧٢s1.Ch getBoxBackground() {
        int i = this.f٦٨٦٣P;
        if (i == 1 || i == 2) {
            return this.f٦٨٥٤J;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f٦٨٦٩V;
    }

    public int getBoxBackgroundMode() {
        return this.f٦٨٦٣P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f٦٨٦٤Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        InterfaceCc interfaceCc;
        if (AbstractCq.m٥٩١٣a(this)) {
            interfaceCc = this.f٦٨٦٠M.f٨٥٧٠h;
        } else {
            interfaceCc = this.f٦٨٦٠M.f٨٥٦٩g;
        }
        return interfaceCc.mo٦٢٤٠a(this.f٦٨٧٢b0);
    }

    public float getBoxCornerRadiusBottomStart() {
        InterfaceCc interfaceCc;
        if (AbstractCq.m٥٩١٣a(this)) {
            interfaceCc = this.f٦٨٦٠M.f٨٥٦٩g;
        } else {
            interfaceCc = this.f٦٨٦٠M.f٨٥٧٠h;
        }
        return interfaceCc.mo٦٢٤٠a(this.f٦٨٧٢b0);
    }

    public float getBoxCornerRadiusTopEnd() {
        InterfaceCc interfaceCc;
        if (AbstractCq.m٥٩١٣a(this)) {
            interfaceCc = this.f٦٨٦٠M.f٨٥٦٧e;
        } else {
            interfaceCc = this.f٦٨٦٠M.f٨٥٦٨f;
        }
        return interfaceCc.mo٦٢٤٠a(this.f٦٨٧٢b0);
    }

    public float getBoxCornerRadiusTopStart() {
        InterfaceCc interfaceCc;
        if (AbstractCq.m٥٩١٣a(this)) {
            interfaceCc = this.f٦٨٦٠M.f٨٥٦٨f;
        } else {
            interfaceCc = this.f٦٨٦٠M.f٨٥٦٧e;
        }
        return interfaceCc.mo٦٢٤٠a(this.f٦٨٧٢b0);
    }

    public int getBoxStrokeColor() {
        return this.f٦٩١٦y0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f٦٩١٨z0;
    }

    public int getBoxStrokeWidth() {
        return this.f٦٨٦٦S;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f٦٨٦٧T;
    }

    public int getCounterMaxLength() {
        return this.f٦٨٩٩q;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f٦٨٩٧p && this.f٦٩٠١r && (textView = this.f٦٩٠٣s) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f٦٨٤٠C;
    }

    public ColorStateList getCounterTextColor() {
        return this.f٦٨٤٠C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f٦٩٠٨u0;
    }

    public EditText getEditText() {
        return this.f٦٨٨٣i;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f٦٨٨٤i0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f٦٨٨٤i0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f٦٨٨٠g0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f٦٨٨٤i0;
    }

    public CharSequence getError() {
        Cr cr = this.f٦٨٩٥o;
        if (cr.f٨٧٢٢k) {
            return cr.f٨٧٢١j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f٦٨٩٥o.f٨٧٢٤m;
    }

    public int getErrorCurrentTextColors() {
        return this.f٦٨٩٥o.m٦٣٣١g();
    }

    public Drawable getErrorIconDrawable() {
        return this.f٦٩٠٢r0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f٦٨٩٥o.m٦٣٣١g();
    }

    public CharSequence getHelperText() {
        Cr cr = this.f٦٨٩٥o;
        if (cr.f٨٧٢٨q) {
            return cr.f٨٧٢٧p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f٦٨٩٥o.f٨٧٢٩r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f٦٨٤٨G) {
            return this.f٦٨٥٠H;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f٦٨٤٩G0.m٥٨٩٠e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f٦٨٤٩G0.m٥٨٩١f();
    }

    public ColorStateList getHintTextColor() {
        return this.f٦٩١٠v0;
    }

    public int getMaxEms() {
        return this.f٦٨٨٩l;
    }

    public int getMaxWidth() {
        return this.f٦٨٩٣n;
    }

    public int getMinEms() {
        return this.f٦٨٨٧k;
    }

    public int getMinWidth() {
        return this.f٦٨٩١m;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f٦٨٨٤i0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f٦٨٨٤i0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f٦٩١١w) {
            return this.f٦٩٠٩v;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f٦٩١٧z;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f٦٩١٥y;
    }

    public CharSequence getPrefixText() {
        return this.f٦٨٧٧f.f٨٧٤٣g;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f٦٨٧٧f.f٨٧٤٢f.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f٦٨٧٧f.f٨٧٤٢f;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f٦٨٧٧f.f٨٧٤٤h.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f٦٨٧٧f.f٨٧٤٤h.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f٦٨٤٤E;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f٦٨٤٦F.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f٦٨٤٦F;
    }

    public Typeface getTypeface() {
        return this.f٦٨٧٣c0;
    }

    /* renamed from: h  reason: contains not printable characters */
    public final boolean m٤٦٧٦h() {
        return this.f٦٨٨٠g0 != 0;
    }

    /* renamed from: i  reason: contains not printable characters */
    public final void m٤٦٧٧i() {
        TextView textView = this.f٦٩١٣x;
        if (textView == null || !this.f٦٩١١w) {
            return;
        }
        textView.setText((CharSequence) null);
        AbstractCv.m٦٥٠٤a(this.f٦٨٧٥e, this.f٦٨٣٨B);
        this.f٦٩١٣x.setVisibility(4);
    }

    /* renamed from: j  reason: contains not printable characters */
    public boolean m٤٦٧٨j() {
        return this.f٦٨٨١h.getVisibility() == 0 && this.f٦٨٨٤i0.getVisibility() == 0;
    }

    /* renamed from: k  reason: contains not printable characters */
    public final boolean m٤٦٧٩k() {
        return this.f٦٩٠٢r0.getVisibility() == 0;
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
        int i5 = this.f٦٨٦٣P;
        if (i5 == 0) {
            this.f٦٨٥٤J = null;
        } else if (i5 == 1) {
            this.f٦٨٥٤J = new p٠٧٢s1.Ch(this.f٦٨٦٠M);
            this.f٦٨٥٦K = new p٠٧٢s1.Ch();
            this.f٦٨٥٨L = new p٠٧٢s1.Ch();
            editText = this.f٦٨٨٣i;
            if (editText == null && this.f٦٨٥٤J != null && editText.getBackground() == null && this.f٦٨٦٣P != 0) {
                EditText editText3 = this.f٦٨٨٣i;
                p٠٧٢s1.Ch ch = this.f٦٨٥٤J;
                WeakHashMap weakHashMap = AbstractCv0.f٧٢٧٥a;
                AbstractCe0.m٤٩٦٥q(editText3, ch);
            }
            m٤٦٦٨E();
            if (this.f٦٨٦٣P == 1) {
                if (AbstractCc.m٤٣٩٠p(getContext())) {
                    resources2 = getResources();
                    i4 = R.dimen.material_font_2_0_box_collapsed_padding_top;
                } else if (AbstractCc.m٤٣٨٩o(getContext())) {
                    resources2 = getResources();
                    i4 = R.dimen.material_font_1_3_box_collapsed_padding_top;
                }
                this.f٦٨٦٤Q = resources2.getDimensionPixelSize(i4);
            }
            if (this.f٦٨٨٣i != null && this.f٦٨٦٣P == 1) {
                if (!AbstractCc.m٤٣٩٠p(getContext())) {
                    editText2 = this.f٦٨٨٣i;
                    WeakHashMap weakHashMap2 = AbstractCv0.f٧٢٧٥a;
                    i = AbstractCf0.m٤٩٨٤f(editText2);
                    dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top);
                    i2 = AbstractCf0.m٤٩٨٣e(this.f٦٨٨٣i);
                    resources = getResources();
                    i3 = R.dimen.material_filled_edittext_font_2_0_padding_bottom;
                } else if (AbstractCc.m٤٣٨٩o(getContext())) {
                    editText2 = this.f٦٨٨٣i;
                    WeakHashMap weakHashMap3 = AbstractCv0.f٧٢٧٥a;
                    i = AbstractCf0.m٤٩٨٤f(editText2);
                    dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top);
                    i2 = AbstractCf0.m٤٩٨٣e(this.f٦٨٨٣i);
                    resources = getResources();
                    i3 = R.dimen.material_filled_edittext_font_1_3_padding_bottom;
                }
                AbstractCf0.m٤٩٨٩k(editText2, i, dimensionPixelSize, i2, resources.getDimensionPixelSize(i3));
            }
            if (this.f٦٨٦٣P == 0) {
                m٤٦٩١y();
                return;
            }
            return;
        } else if (i5 != 2) {
            throw new IllegalArgumentException(this.f٦٨٦٣P + " is illegal; only @BoxBackgroundMode constants are supported.");
        } else {
            this.f٦٨٥٤J = (!this.f٦٨٤٨G || (this.f٦٨٥٤J instanceof Ci)) ? new p٠٧٢s1.Ch(this.f٦٨٦٠M) : new Ci(this.f٦٨٦٠M);
        }
        this.f٦٨٥٦K = null;
        this.f٦٨٥٨L = null;
        editText = this.f٦٨٨٣i;
        if (editText == null && this.f٦٨٥٤J != null && editText.getBackground() == null && this.f٦٨٦٣P != 0) {
        }
        m٤٦٦٨E();
        if (this.f٦٨٦٣P == 1) {
        }
        if (this.f٦٨٨٣i != null) {
            if (!AbstractCc.m٤٣٩٠p(getContext())) {
            }
            AbstractCf0.m٤٩٨٩k(editText2, i, dimensionPixelSize, i2, resources.getDimensionPixelSize(i3));
        }
        if (this.f٦٨٦٣P == 0) {
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    public final void m٤٦٨١m() {
        float f;
        float f2;
        float f3;
        float f4;
        if (m٤٦٧٣e()) {
            RectF rectF = this.f٦٨٧٢b0;
            Cc cc = this.f٦٨٤٩G0;
            int width = this.f٦٨٨٣i.getWidth();
            int gravity = this.f٦٨٨٣i.getGravity();
            boolean z = cc.m٥٨٨٧b(cc.f٨٠١٦B);
            cc.f٨٠١٨D = z;
            if (gravity == 17 || (gravity & 7) == 1) {
                f = width / 2.0f;
                f2 = cc.f٨٠٤٠Z / 2.0f;
            } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? z : !z) {
                f3 = cc.f٨٠٤٩f.left;
                rectF.left = f3;
                Rect rect = cc.f٨٠٤٩f;
                float f5 = rect.top;
                rectF.top = f5;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (cc.f٨٠٤٠Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (z) {
                        f4 = cc.f٨٠٤٠Z + f3;
                    }
                    f4 = rect.right;
                } else {
                    if (!z) {
                        f4 = cc.f٨٠٤٠Z + f3;
                    }
                    f4 = rect.right;
                }
                rectF.right = f4;
                rectF.bottom = cc.m٥٨٩٠e() + f5;
                float f6 = rectF.left;
                float f7 = this.f٦٨٦٢O;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f٦٨٦٥R);
                Ci ci = (Ci) this.f٦٨٥٤J;
                Objects.requireNonNull(ci);
                ci.m٦٣٠٨x(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                f = cc.f٨٠٤٩f.right;
                f2 = cc.f٨٠٤٠Z;
            }
            f3 = f - f2;
            rectF.left = f3;
            Rect rect2 = cc.f٨٠٤٩f;
            float f52 = rect2.top;
            rectF.top = f52;
            if (gravity != 17) {
            }
            f4 = (width / 2.0f) + (cc.f٨٠٤٠Z / 2.0f);
            rectF.right = f4;
            rectF.bottom = cc.m٥٨٩٠e() + f52;
            float f62 = rectF.left;
            float f72 = this.f٦٨٦٢O;
            rectF.left = f62 - f72;
            rectF.right += f72;
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f٦٨٦٥R);
            Ci ci2 = (Ci) this.f٦٨٥٤J;
            Objects.requireNonNull(ci2);
            ci2.m٦٣٠٨x(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    /* renamed from: o  reason: contains not printable characters */
    public void m٤٦٨٢o() {
        p٠١٠c.AbstractCb.m٤٣٦٢n(this, this.f٦٨٨٤i0, this.f٦٨٨٨k0);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f٦٨٤٩G0.m٥٨٩٣i(configuration);
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
        EditText editText = this.f٦٨٨٣i;
        if (editText == null) {
            return;
        }
        Rect rect = this.f٦٨٧٠W;
        AbstractCd.m٥٩٠٣a(this, editText, rect);
        p٠٧٢s1.Ch ch = this.f٦٨٥٦K;
        if (ch != null) {
            int i11 = rect.bottom;
            ch.setBounds(rect.left, i11 - this.f٦٨٦٦S, rect.right, i11);
        }
        p٠٧٢s1.Ch ch2 = this.f٦٨٥٨L;
        if (ch2 != null) {
            int i12 = rect.bottom;
            ch2.setBounds(rect.left, i12 - this.f٦٨٦٧T, rect.right, i12);
        }
        if (!this.f٦٨٤٨G) {
            return;
        }
        Cc cc = this.f٦٨٤٩G0;
        float textSize = this.f٦٨٨٣i.getTextSize();
        if (cc.f٨٠٥٣j != textSize) {
            cc.f٨٠٥٣j = textSize;
            cc.m٥٨٩٥k(false);
        }
        int gravity = this.f٦٨٨٣i.getGravity();
        this.f٦٨٤٩G0.m٥٨٩٧n((gravity & (-113)) | 48);
        Cc cc2 = this.f٦٨٤٩G0;
        if (cc2.f٨٠٥١h != gravity) {
            cc2.f٨٠٥١h = gravity;
            cc2.m٥٨٩٥k(false);
        }
        Cc cc3 = this.f٦٨٤٩G0;
        if (this.f٦٨٨٣i != null) {
            Rect rect2 = this.f٦٨٧١a0;
            boolean z2 = AbstractCq.m٥٩١٣a(this);
            rect2.bottom = rect.bottom;
            int i13 = this.f٦٨٦٣P;
            if (i13 == 1) {
                rect2.left = m٤٦٧٤f(rect.left, z2);
                i5 = rect.top + this.f٦٨٦٤Q;
            } else if (i13 == 2) {
                rect2.left = this.f٦٨٨٣i.getPaddingLeft() + rect.left;
                rect2.top = rect.top - m٤٦٧٢d();
                i6 = rect.right - this.f٦٨٨٣i.getPaddingRight();
                rect2.right = i6;
                Objects.requireNonNull(cc3);
                i7 = rect2.left;
                i8 = rect2.top;
                i9 = rect2.right;
                i10 = rect2.bottom;
                if (!Cc.m٥٨٨٦l(cc3.f٨٠٤٩f, i7, i8, i9, i10)) {
                    cc3.f٨٠٤٩f.set(i7, i8, i9, i10);
                    cc3.f٨٠٢٧M = true;
                    cc3.m٥٨٩٤j();
                }
                Cc cc4 = this.f٦٨٤٩G0;
                if (this.f٦٨٨٣i == null) {
                    Rect rect3 = this.f٦٨٧١a0;
                    TextPaint textPaint = cc4.f٨٠٢٩O;
                    textPaint.setTextSize(cc4.f٨٠٥٣j);
                    textPaint.setTypeface(cc4.f٨٠٦٦w);
                    textPaint.setLetterSpacing(cc4.f٨٠٣٧W);
                    float f = -cc4.f٨٠٢٩O.ascent();
                    rect3.left = this.f٦٨٨٣i.getCompoundPaddingLeft() + rect.left;
                    rect3.top = this.f٦٨٦٣P == 1 && this.f٦٨٨٣i.getMinLines() <= 1 ? (int) (rect.centerY() - (f / 2.0f)) : rect.top + this.f٦٨٨٣i.getCompoundPaddingTop();
                    rect3.right = rect.right - this.f٦٨٨٣i.getCompoundPaddingRight();
                    int compoundPaddingBottom = this.f٦٨٦٣P == 1 && this.f٦٨٨٣i.getMinLines() <= 1 ? (int) (rect3.top + f) : rect.bottom - this.f٦٨٨٣i.getCompoundPaddingBottom();
                    rect3.bottom = compoundPaddingBottom;
                    int i14 = rect3.left;
                    int i15 = rect3.top;
                    int i16 = rect3.right;
                    if (!Cc.m٥٨٨٦l(cc4.f٨٠٤٨e, i14, i15, i16, compoundPaddingBottom)) {
                        cc4.f٨٠٤٨e.set(i14, i15, i16, compoundPaddingBottom);
                        cc4.f٨٠٢٧M = true;
                        cc4.m٥٨٩٤j();
                    }
                    this.f٦٨٤٩G0.m٥٨٩٥k(false);
                    if (!m٤٦٧٣e() || this.f٦٨٤٧F0) {
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
            if (!Cc.m٥٨٨٦l(cc3.f٨٠٤٩f, i7, i8, i9, i10)) {
            }
            Cc cc42 = this.f٦٨٤٩G0;
            if (this.f٦٨٨٣i == null) {
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
        if (this.f٦٨٨٣i != null && this.f٦٨٨٣i.getMeasuredHeight() < (max = Math.max(this.f٦٨٧٩g.getMeasuredHeight(), this.f٦٨٧٧f.getMeasuredHeight()))) {
            this.f٦٨٨٣i.setMinimumHeight(max);
            z = true;
        }
        boolean z2 = m٤٦٨٧u();
        if (z || z2) {
            this.f٦٨٨٣i.post(new RunnableCc());
        }
        if (this.f٦٩١٣x != null && (editText = this.f٦٨٨٣i) != null) {
            this.f٦٩١٣x.setGravity(editText.getGravity());
            this.f٦٩١٣x.setPadding(this.f٦٨٨٣i.getCompoundPaddingLeft(), this.f٦٨٨٣i.getCompoundPaddingTop(), this.f٦٨٨٣i.getCompoundPaddingRight(), this.f٦٨٨٣i.getCompoundPaddingBottom());
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
        super.onRestoreInstanceState(ch.f٧٦٥١e);
        setError(ch.f٦٩٢٤g);
        if (ch.f٦٩٢٥h) {
            this.f٦٨٨٤i0.post(new RunnableCb());
        }
        setHint(ch.f٦٩٢٦i);
        setHelperText(ch.f٦٩٢٧j);
        setPlaceholderText(ch.f٦٩٢٨k);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = false;
        boolean z2 = i == 1;
        boolean z3 = this.f٦٨٦١N;
        if (z2 != z3) {
            if (z2 && !z3) {
                z = true;
            }
            float f = this.f٦٨٦٠M.f٨٥٦٧e.mo٦٢٤٠a(this.f٦٨٧٢b0);
            float f2 = this.f٦٨٦٠M.f٨٥٦٨f.mo٦٢٤٠a(this.f٦٨٧٢b0);
            float f3 = this.f٦٨٦٠M.f٨٥٧٠h.mo٦٢٤٠a(this.f٦٨٧٢b0);
            float f4 = this.f٦٨٦٠M.f٨٥٦٩g.mo٦٢٤٠a(this.f٦٨٧٢b0);
            float f5 = z ? f : f2;
            if (z) {
                f = f2;
            }
            float f6 = z ? f3 : f4;
            if (z) {
                f3 = f4;
            }
            boolean z4 = AbstractCq.m٥٩١٣a(this);
            this.f٦٨٦١N = z4;
            float f7 = z4 ? f : f5;
            if (!z4) {
                f5 = f;
            }
            float f8 = z4 ? f3 : f6;
            if (!z4) {
                f6 = f3;
            }
            p٠٧٢s1.Ch ch = this.f٦٨٥٤J;
            if (ch != null && ch.m٦٢٢٨l() == f7) {
                p٠٧٢s1.Ch ch2 = this.f٦٨٥٤J;
                if (ch2.f٨٥٤٠e.f٨٥١٦a.f٨٥٦٨f.mo٦٢٤٠a(ch2.m٦٢٢٤h()) == f5) {
                    p٠٧٢s1.Ch ch3 = this.f٦٨٥٤J;
                    if (ch3.f٨٥٤٠e.f٨٥١٦a.f٨٥٧٠h.mo٦٢٤٠a(ch3.m٦٢٢٤h()) == f8) {
                        p٠٧٢s1.Ch ch4 = this.f٦٨٥٤J;
                        if (ch4.f٨٥٤٠e.f٨٥١٦a.f٨٥٦٩g.mo٦٢٤٠a(ch4.m٦٢٢٤h()) == f6) {
                            return;
                        }
                    }
                }
            }
            Ck ck = this.f٦٨٦٠M;
            Objects.requireNonNull(ck);
            Ck.Ca ca = new Ck.Ca(ck);
            ca.m٦٢٥٢f(f7);
            ca.m٦٢٥٣g(f5);
            ca.m٦٢٥٠d(f8);
            ca.m٦٢٥١e(f6);
            this.f٦٨٦٠M = ca.m٦٢٤٨a();
            m٤٦٧١c();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Ch ch = new Ch(super.onSaveInstanceState());
        if (this.f٦٨٩٥o.m٦٣٢٩e()) {
            ch.f٦٩٢٤g = getError();
        }
        ch.f٦٩٢٥h = m٤٦٧٦h() && this.f٦٨٨٤i0.isChecked();
        ch.f٦٩٢٦i = getHint();
        ch.f٦٩٢٧j = getHelperText();
        ch.f٦٩٢٨k = getPlaceholderText();
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
            Object obj = p٠٧٦u.AbstractCb.f٨٦٤١a;
            textView.setTextColor(p٠٧٩v.AbstractCc.m٦٣٥٥a(context, R.color.design_error));
        }
    }

    /* renamed from: r  reason: contains not printable characters */
    public final void m٤٦٨٤r() {
        if (this.f٦٩٠٣s != null) {
            EditText editText = this.f٦٨٨٣i;
            m٤٦٨٥s(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: s  reason: contains not printable characters */
    public void m٤٦٨٥s(int i) {
        boolean z = this.f٦٩٠١r;
        int i2 = this.f٦٨٩٩q;
        if (i2 == -1) {
            this.f٦٩٠٣s.setText(String.valueOf(i));
            this.f٦٩٠٣s.setContentDescription(null);
            this.f٦٩٠١r = false;
        } else {
            this.f٦٩٠١r = i > i2;
            Context context = getContext();
            this.f٦٩٠٣s.setContentDescription(context.getString(this.f٦٩٠١r ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.f٦٨٩٩q)));
            if (z != this.f٦٩٠١r) {
                m٤٦٨٦t();
            }
            Cb cb = Cb.m٤٤٠٦c();
            TextView textView = this.f٦٩٠٣s;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f٦٨٩٩q));
            textView.setText(string != null ? cb.m٤٤٠٧d(string, cb.f٦٤٣٩c, true).toString() : null);
        }
        if (this.f٦٨٨٣i == null || z == this.f٦٩٠١r) {
            return;
        }
        m٤٦٩٢z(false, false);
        m٤٦٦٨E();
        m٤٦٨٨v();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f٦٨٦٩V != i) {
            this.f٦٨٦٩V = i;
            this.f٦٨٣٧A0 = i;
            this.f٦٨٤١C0 = i;
            this.f٦٨٤٣D0 = i;
            m٤٦٧١c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        Context context = getContext();
        Object obj = p٠٧٦u.AbstractCb.f٨٦٤١a;
        setBoxBackgroundColor(p٠٧٩v.AbstractCc.m٦٣٥٥a(context, i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f٦٨٣٧A0 = defaultColor;
        this.f٦٨٦٩V = defaultColor;
        this.f٦٨٣٩B0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f٦٨٤١C0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f٦٨٤٣D0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m٤٦٧١c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f٦٨٦٣P) {
            return;
        }
        this.f٦٨٦٣P = i;
        if (this.f٦٨٨٣i != null) {
            m٤٦٨٠l();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f٦٨٦٤Q = i;
    }

    public void setBoxStrokeColor(int i) {
        if (this.f٦٩١٦y0 != i) {
            this.f٦٩١٦y0 = i;
            m٤٦٦٨E();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f٦٩١٦y0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            m٤٦٦٨E();
        }
        this.f٦٩١٢w0 = colorStateList.getDefaultColor();
        this.f٦٨٤٥E0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f٦٩١٤x0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f٦٩١٦y0 = defaultColor;
        m٤٦٦٨E();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f٦٩١٨z0 != colorStateList) {
            this.f٦٩١٨z0 = colorStateList;
            m٤٦٦٨E();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f٦٨٦٦S = i;
        m٤٦٦٨E();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f٦٨٦٧T = i;
        m٤٦٦٨E();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f٦٨٩٧p != z) {
            if (z) {
                Cy0 cy0 = new Cy0(getContext());
                this.f٦٩٠٣s = cy0;
                cy0.setId(R.id.textinput_counter);
                Typeface typeface = this.f٦٨٧٣c0;
                if (typeface != null) {
                    this.f٦٩٠٣s.setTypeface(typeface);
                }
                this.f٦٩٠٣s.setMaxLines(1);
                this.f٦٨٩٥o.m٦٣٢٥a(this.f٦٩٠٣s, 2);
                p٠١٨e0.AbstractCm.m٥٠٦٦h((ViewGroup.MarginLayoutParams) this.f٦٩٠٣s.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                m٤٦٨٦t();
                m٤٦٨٤r();
            } else {
                this.f٦٨٩٥o.m٦٣٣٤j(this.f٦٩٠٣s, 2);
                this.f٦٩٠٣s = null;
            }
            this.f٦٨٩٧p = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f٦٨٩٩q != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f٦٨٩٩q = i;
            if (this.f٦٨٩٧p) {
                m٤٦٨٤r();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f٦٩٠٥t != i) {
            this.f٦٩٠٥t = i;
            m٤٦٨٦t();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f٦٨٤٢D != colorStateList) {
            this.f٦٨٤٢D = colorStateList;
            m٤٦٨٦t();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f٦٩٠٧u != i) {
            this.f٦٩٠٧u = i;
            m٤٦٨٦t();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f٦٨٤٠C != colorStateList) {
            this.f٦٨٤٠C = colorStateList;
            m٤٦٨٦t();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f٦٩٠٨u0 = colorStateList;
        this.f٦٩١٠v0 = colorStateList;
        if (this.f٦٨٨٣i != null) {
            m٤٦٩٢z(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m٤٦٦٢n(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f٦٨٨٤i0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f٦٨٨٤i0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f٦٨٨٤i0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? p٠١٧e.AbstractCa.m٤٩٠٧b(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f٦٨٨٤i0.setImageDrawable(drawable);
        if (drawable != null) {
            p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٨٨٤i0, this.f٦٨٨٨k0, this.f٦٨٩٠l0);
            m٤٦٨٢o();
        }
    }

    public void setEndIconMode(int i) {
        int i2 = this.f٦٨٨٠g0;
        if (i2 == i) {
            return;
        }
        this.f٦٨٨٠g0 = i;
        Iterator it = this.f٦٨٨٦j0.iterator();
        while (true) {
            if (it.hasNext()) {
                p٠٧٨u1.Cd cd = (p٠٧٨u1.Cd) ((InterfaceCg) it.next());
                switch (cd.f٨٦٦٧a) {
                    case HookMode.AUTO /* 0 */:
                        EditText editText = getEditText();
                        if (editText != null && i2 == 2) {
                            editText.post(new RunnableCf(cd, editText));
                            if (editText.getOnFocusChangeListener() == ((Cg) cd.f٨٦٦٨b).f٨٦٧٤f) {
                                editText.setOnFocusChangeListener(null);
                            }
                            View.OnFocusChangeListener onFocusChangeListener = ((Cg) cd.f٨٦٦٨b).f٨٧٠٤c.getOnFocusChangeListener();
                            Cg cg = (Cg) cd.f٨٦٦٨b;
                            if (onFocusChangeListener != cg.f٨٦٧٤f) {
                                break;
                            } else {
                                cg.f٨٧٠٤c.setOnFocusChangeListener(null);
                                break;
                            }
                        }
                        break;
                    case 1:
                        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) getEditText();
                        if (autoCompleteTextView != null && i2 == 3) {
                            autoCompleteTextView.post(new RunnableCf(cd, autoCompleteTextView));
                            if (autoCompleteTextView.getOnFocusChangeListener() == ((Cn) cd.f٨٦٦٨b).f٨٦٨٨f) {
                                autoCompleteTextView.setOnFocusChangeListener(null);
                            }
                            autoCompleteTextView.setOnTouchListener(null);
                            autoCompleteTextView.setOnDismissListener(null);
                        }
                        if (i2 != 3) {
                            break;
                        } else {
                            removeOnAttachStateChangeListener(((Cn) cd.f٨٦٦٨b).f٨٦٩٢j);
                            Cn cn = (Cn) cd.f٨٦٦٨b;
                            AccessibilityManager accessibilityManager = cn.f٨٦٩٩q;
                            if (accessibilityManager == null) {
                                break;
                            } else {
                                p٠٢٢f0.AbstractCc.m٥٢٤٥b(accessibilityManager, cn.f٨٦٩٣k);
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
                if (getEndIconDelegate().mo٦٣٢٣b(this.f٦٨٦٣P)) {
                    getEndIconDelegate().mo٦٣٤١a();
                    p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٨٨٤i0, this.f٦٨٨٨k0, this.f٦٨٩٠l0);
                    return;
                }
                StringBuilder sb = AbstractCa.m٢٨٧٢a("The current box background mode ");
                sb.append(this.f٦٨٦٣P);
                sb.append(" is not supported by the end icon mode ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f٦٨٨٤i0;
        View.OnLongClickListener onLongClickListener = this.f٦٨٩٨p0;
        checkableImageButton.setOnClickListener(onClickListener);
        m٤٦٦٣p(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f٦٨٩٨p0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f٦٨٨٤i0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m٤٦٦٣p(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f٦٨٨٨k0 != colorStateList) {
            this.f٦٨٨٨k0 = colorStateList;
            p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٨٨٤i0, colorStateList, this.f٦٨٩٠l0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f٦٨٩٠l0 != mode) {
            this.f٦٨٩٠l0 = mode;
            p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٨٨٤i0, this.f٦٨٨٨k0, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        if (m٤٦٧٨j() != z) {
            this.f٦٨٨٤i0.setVisibility(z ? 0 : 8);
            m٤٦٨٩w();
            m٤٦٦٦C();
            m٤٦٨٧u();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f٦٨٩٥o.f٨٧٢٢k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Cr cr = this.f٦٨٩٥o;
            cr.m٦٣٢٧c();
            cr.f٨٧٢١j = charSequence;
            cr.f٨٧٢٣l.setText(charSequence);
            int i = cr.f٨٧١٩h;
            if (i != 1) {
                cr.f٨٧٢٠i = 1;
            }
            cr.m٦٣٣٦l(i, cr.f٨٧٢٠i, cr.m٦٣٣٥k(cr.f٨٧٢٣l, charSequence));
            return;
        }
        this.f٦٨٩٥o.m٦٣٣٣i();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        Cr cr = this.f٦٨٩٥o;
        cr.f٨٧٢٤m = charSequence;
        TextView textView = cr.f٨٧٢٣l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        Cr cr = this.f٦٨٩٥o;
        if (cr.f٨٧٢٢k == z) {
            return;
        }
        cr.m٦٣٢٧c();
        if (z) {
            Cy0 cy0 = new Cy0(cr.f٨٧١٢a);
            cr.f٨٧٢٣l = cy0;
            cy0.setId(R.id.textinput_error);
            cr.f٨٧٢٣l.setTextAlignment(5);
            Typeface typeface = cr.f٨٧٣٢u;
            if (typeface != null) {
                cr.f٨٧٢٣l.setTypeface(typeface);
            }
            int i = cr.f٨٧٢٥n;
            cr.f٨٧٢٥n = i;
            TextView textView = cr.f٨٧٢٣l;
            if (textView != null) {
                cr.f٨٧١٣b.m٤٦٨٣q(textView, i);
            }
            ColorStateList colorStateList = cr.f٨٧٢٦o;
            cr.f٨٧٢٦o = colorStateList;
            TextView textView2 = cr.f٨٧٢٣l;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            CharSequence charSequence = cr.f٨٧٢٤m;
            cr.f٨٧٢٤m = charSequence;
            TextView textView3 = cr.f٨٧٢٣l;
            if (textView3 != null) {
                textView3.setContentDescription(charSequence);
            }
            cr.f٨٧٢٣l.setVisibility(4);
            AbstractCh0.m٥٠٠٩f(cr.f٨٧٢٣l, 1);
            cr.m٦٣٢٥a(cr.f٨٧٢٣l, 0);
        } else {
            cr.m٦٣٣٣i();
            cr.m٦٣٣٤j(cr.f٨٧٢٣l, 0);
            cr.f٨٧٢٣l = null;
            cr.f٨٧١٣b.m٤٦٨٨v();
            cr.f٨٧١٣b.m٤٦٦٨E();
        }
        cr.f٨٧٢٢k = z;
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? p٠١٧e.AbstractCa.m٤٩٠٧b(getContext(), i) : null);
        p٠١٠c.AbstractCb.m٤٣٦٢n(this, this.f٦٩٠٢r0, this.f٦٩٠٤s0);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f٦٩٠٢r0.setImageDrawable(drawable);
        m٤٦٩٠x();
        p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٩٠٢r0, this.f٦٩٠٤s0, this.f٦٩٠٦t0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f٦٩٠٢r0;
        View.OnLongClickListener onLongClickListener = this.f٦٩٠٠q0;
        checkableImageButton.setOnClickListener(onClickListener);
        m٤٦٦٣p(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f٦٩٠٠q0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f٦٩٠٢r0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m٤٦٦٣p(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.f٦٩٠٤s0 != colorStateList) {
            this.f٦٩٠٤s0 = colorStateList;
            p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٩٠٢r0, colorStateList, this.f٦٩٠٦t0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.f٦٩٠٦t0 != mode) {
            this.f٦٩٠٦t0 = mode;
            p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٩٠٢r0, this.f٦٩٠٤s0, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        Cr cr = this.f٦٨٩٥o;
        cr.f٨٧٢٥n = i;
        TextView textView = cr.f٨٧٢٣l;
        if (textView != null) {
            cr.f٨٧١٣b.m٤٦٨٣q(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        Cr cr = this.f٦٨٩٥o;
        cr.f٨٧٢٦o = colorStateList;
        TextView textView = cr.f٨٧٢٣l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f٦٨٥١H0 != z) {
            this.f٦٨٥١H0 = z;
            m٤٦٩٢z(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.f٦٨٩٥o.f٨٧٢٨q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.f٦٨٩٥o.f٨٧٢٨q) {
            setHelperTextEnabled(true);
        }
        Cr cr = this.f٦٨٩٥o;
        cr.m٦٣٢٧c();
        cr.f٨٧٢٧p = charSequence;
        cr.f٨٧٢٩r.setText(charSequence);
        int i = cr.f٨٧١٩h;
        if (i != 2) {
            cr.f٨٧٢٠i = 2;
        }
        cr.m٦٣٣٦l(i, cr.f٨٧٢٠i, cr.m٦٣٣٥k(cr.f٨٧٢٩r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        Cr cr = this.f٦٨٩٥o;
        cr.f٨٧٣١t = colorStateList;
        TextView textView = cr.f٨٧٢٩r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        Cr cr = this.f٦٨٩٥o;
        if (cr.f٨٧٢٨q == z) {
            return;
        }
        cr.m٦٣٢٧c();
        if (z) {
            Cy0 cy0 = new Cy0(cr.f٨٧١٢a);
            cr.f٨٧٢٩r = cy0;
            cy0.setId(R.id.textinput_helper_text);
            cr.f٨٧٢٩r.setTextAlignment(5);
            Typeface typeface = cr.f٨٧٣٢u;
            if (typeface != null) {
                cr.f٨٧٢٩r.setTypeface(typeface);
            }
            cr.f٨٧٢٩r.setVisibility(4);
            AbstractCh0.m٥٠٠٩f(cr.f٨٧٢٩r, 1);
            int i = cr.f٨٧٣٠s;
            cr.f٨٧٣٠s = i;
            TextView textView = cr.f٨٧٢٩r;
            if (textView != null) {
                textView.setTextAppearance(i);
            }
            ColorStateList colorStateList = cr.f٨٧٣١t;
            cr.f٨٧٣١t = colorStateList;
            TextView textView2 = cr.f٨٧٢٩r;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            cr.m٦٣٢٥a(cr.f٨٧٢٩r, 1);
            cr.f٨٧٢٩r.setAccessibilityDelegate(new Cq(cr));
        } else {
            cr.m٦٣٢٧c();
            int i2 = cr.f٨٧١٩h;
            if (i2 == 2) {
                cr.f٨٧٢٠i = 0;
            }
            cr.m٦٣٣٦l(i2, cr.f٨٧٢٠i, cr.m٦٣٣٥k(cr.f٨٧٢٩r, ""));
            cr.m٦٣٣٤j(cr.f٨٧٢٩r, 1);
            cr.f٨٧٢٩r = null;
            cr.f٨٧١٣b.m٤٦٨٨v();
            cr.f٨٧١٣b.m٤٦٦٨E();
        }
        cr.f٨٧٢٨q = z;
    }

    public void setHelperTextTextAppearance(int i) {
        Cr cr = this.f٦٨٩٥o;
        cr.f٨٧٣٠s = i;
        TextView textView = cr.f٨٧٢٩r;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f٦٨٤٨G) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(FileUtils.FileMode.MODE_ISUID);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f٦٨٥٣I0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f٦٨٤٨G) {
            this.f٦٨٤٨G = z;
            if (z) {
                CharSequence hint = this.f٦٨٨٣i.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f٦٨٥٠H)) {
                        setHint(hint);
                    }
                    this.f٦٨٨٣i.setHint((CharSequence) null);
                }
                this.f٦٨٥٢I = true;
            } else {
                this.f٦٨٥٢I = false;
                if (!TextUtils.isEmpty(this.f٦٨٥٠H) && TextUtils.isEmpty(this.f٦٨٨٣i.getHint())) {
                    this.f٦٨٨٣i.setHint(this.f٦٨٥٠H);
                }
                setHintInternal(null);
            }
            if (this.f٦٨٨٣i != null) {
                m٤٦٩١y();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        Cc cc = this.f٦٨٤٩G0;
        p٠٦٣p1.Cd cd = new p٠٦٣p1.Cd(cc.f٨٠٤١a.getContext(), i);
        ColorStateList colorStateList = cd.f٨٢٥٨j;
        if (colorStateList != null) {
            cc.f٨٠٥٦m = colorStateList;
        }
        float f = cd.f٨٢٥٩k;
        if (f != 0.0f) {
            cc.f٨٠٥٤k = f;
        }
        ColorStateList colorStateList2 = cd.f٨٢٤٩a;
        if (colorStateList2 != null) {
            cc.f٨٠٣٥U = colorStateList2;
        }
        cc.f٨٠٣٣S = cd.f٨٢٥٣e;
        cc.f٨٠٣٤T = cd.f٨٢٥٤f;
        cc.f٨٠٣٢R = cd.f٨٢٥٥g;
        cc.f٨٠٣٦V = cd.f٨٢٥٧i;
        p٠٦٣p1.Ca ca = cc.f٨٠١٥A;
        if (ca != null) {
            ca.f٨٢٤٢c = true;
        }
        Cb0 cb0 = new Cb0(cc);
        cd.m٦٠٤٣a();
        cc.f٨٠١٥A = new p٠٦٣p1.Ca(cb0, cd.f٨٢٦٢n);
        cd.m٦٠٤٥c(cc.f٨٠٤١a.getContext(), cc.f٨٠١٥A);
        cc.m٥٨٩٥k(false);
        this.f٦٩١٠v0 = this.f٦٨٤٩G0.f٨٠٥٦m;
        if (this.f٦٨٨٣i != null) {
            m٤٦٩٢z(false, false);
            m٤٦٩١y();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f٦٩١٠v0 != colorStateList) {
            if (this.f٦٩٠٨u0 == null) {
                Cc cc = this.f٦٨٤٩G0;
                if (cc.f٨٠٥٦m != colorStateList) {
                    cc.f٨٠٥٦m = colorStateList;
                    cc.m٥٨٩٥k(false);
                }
            }
            this.f٦٩١٠v0 = colorStateList;
            if (this.f٦٨٨٣i != null) {
                m٤٦٩٢z(false, false);
            }
        }
    }

    public void setMaxEms(int i) {
        this.f٦٨٨٩l = i;
        EditText editText = this.f٦٨٨٣i;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f٦٨٩٣n = i;
        EditText editText = this.f٦٨٨٣i;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f٦٨٨٧k = i;
        EditText editText = this.f٦٨٨٣i;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f٦٨٩١m = i;
        EditText editText = this.f٦٨٨٣i;
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
        this.f٦٨٨٤i0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? p٠١٧e.AbstractCa.m٤٩٠٧b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f٦٨٨٤i0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f٦٨٨٠g0 != 1) {
            setEndIconMode(1);
        } else if (z) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f٦٨٨٨k0 = colorStateList;
        p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٨٨٤i0, colorStateList, this.f٦٨٩٠l0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f٦٨٩٠l0 = mode;
        p٠١٠c.AbstractCb.m٤٣٥٠b(this, this.f٦٨٨٤i0, this.f٦٨٨٨k0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f٦٩١٣x == null) {
            Cy0 cy0 = new Cy0(getContext());
            this.f٦٩١٣x = cy0;
            cy0.setId(R.id.textinput_placeholder);
            AbstractCe0.m٤٩٦٧s(this.f٦٩١٣x, 2);
            Cm cm = new Cm();
            cm.f٨٨٧٦g = 87L;
            TimeInterpolator timeInterpolator = p٠٠٢a1.AbstractCa.f٤٥١٤a;
            cm.f٨٨٧٧h = timeInterpolator;
            this.f٦٨٣٦A = cm;
            cm.f٨٨٧٥f = 67L;
            Cm cm2 = new Cm();
            cm2.f٨٨٧٦g = 87L;
            cm2.f٨٨٧٧h = timeInterpolator;
            this.f٦٨٣٨B = cm2;
            setPlaceholderTextAppearance(this.f٦٩١٧z);
            setPlaceholderTextColor(this.f٦٩١٥y);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f٦٩١١w) {
                setPlaceholderTextEnabled(true);
            }
            this.f٦٩٠٩v = charSequence;
        }
        EditText editText = this.f٦٨٨٣i;
        m٤٦٦٤A(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f٦٩١٧z = i;
        TextView textView = this.f٦٩١٣x;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f٦٩١٥y != colorStateList) {
            this.f٦٩١٥y = colorStateList;
            TextView textView = this.f٦٩١٣x;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f٦٨٧٧f.m٦٣٤٢a(charSequence);
    }

    public void setPrefixTextAppearance(int i) {
        this.f٦٨٧٧f.f٨٧٤٢f.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f٦٨٧٧f.f٨٧٤٢f.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f٦٨٧٧f.f٨٧٤٤h.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        Cw cw = this.f٦٨٧٧f;
        if (cw.f٨٧٤٤h.getContentDescription() != charSequence) {
            cw.f٨٧٤٤h.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? p٠١٧e.AbstractCa.m٤٩٠٧b(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f٦٨٧٧f.m٦٣٤٤c(drawable);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        Cw cw = this.f٦٨٧٧f;
        CheckableImageButton checkableImageButton = cw.f٨٧٤٤h;
        View.OnLongClickListener onLongClickListener = cw.f٨٧٤٧k;
        checkableImageButton.setOnClickListener(onClickListener);
        p٠١٠c.AbstractCb.m٤٣٦٧s(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        Cw cw = this.f٦٨٧٧f;
        cw.f٨٧٤٧k = onLongClickListener;
        CheckableImageButton checkableImageButton = cw.f٨٧٤٤h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p٠١٠c.AbstractCb.m٤٣٦٧s(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        Cw cw = this.f٦٨٧٧f;
        if (cw.f٨٧٤٥i != colorStateList) {
            cw.f٨٧٤٥i = colorStateList;
            p٠١٠c.AbstractCb.m٤٣٥٠b(cw.f٨٧٤١e, cw.f٨٧٤٤h, colorStateList, cw.f٨٧٤٦j);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        Cw cw = this.f٦٨٧٧f;
        if (cw.f٨٧٤٦j != mode) {
            cw.f٨٧٤٦j = mode;
            p٠١٠c.AbstractCb.m٤٣٥٠b(cw.f٨٧٤١e, cw.f٨٧٤٤h, cw.f٨٧٤٥i, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f٦٨٧٧f.m٦٣٤٧f(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f٦٨٤٤E = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f٦٨٤٦F.setText(charSequence);
        m٤٦٦٧D();
    }

    public void setSuffixTextAppearance(int i) {
        this.f٦٨٤٦F.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f٦٨٤٦F.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(Ce ce) {
        EditText editText = this.f٦٨٨٣i;
        if (editText != null) {
            AbstractCv0.m٥٢٠٢p(editText, ce);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f٦٨٧٣c0) {
            this.f٦٨٧٣c0 = typeface;
            this.f٦٨٤٩G0.m٥٩٠١r(typeface);
            Cr cr = this.f٦٨٩٥o;
            if (typeface != cr.f٨٧٣٢u) {
                cr.f٨٧٣٢u = typeface;
                TextView textView = cr.f٨٧٢٣l;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = cr.f٨٧٢٩r;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f٦٩٠٣s;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t  reason: contains not printable characters */
    public final void m٤٦٨٦t() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f٦٩٠٣s;
        if (textView != null) {
            m٤٦٨٣q(textView, this.f٦٩٠١r ? this.f٦٩٠٥t : this.f٦٩٠٧u);
            if (!this.f٦٩٠١r && (colorStateList2 = this.f٦٨٤٠C) != null) {
                this.f٦٩٠٣s.setTextColor(colorStateList2);
            }
            if (!this.f٦٩٠١r || (colorStateList = this.f٦٨٤٢D) == null) {
                return;
            }
            this.f٦٩٠٣s.setTextColor(colorStateList);
        }
    }

    /* renamed from: u  reason: contains not printable characters */
    public boolean m٤٦٨٧u() {
        boolean z;
        if (this.f٦٨٨٣i == null) {
            return false;
        }
        boolean z2 = true;
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f٦٨٧٧f.getMeasuredWidth() > 0) {
            int measuredWidth = this.f٦٨٧٧f.getMeasuredWidth() - this.f٦٨٨٣i.getPaddingLeft();
            if (this.f٦٨٧٤d0 == null || this.f٦٨٧٦e0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f٦٨٧٤d0 = colorDrawable;
                this.f٦٨٧٦e0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArr = p٠٣٠h0.AbstractCm.m٥٥٠٤a(this.f٦٨٨٣i);
            Drawable drawable = drawableArr[0];
            Drawable drawable2 = this.f٦٨٧٤d0;
            if (drawable != drawable2) {
                p٠٣٠h0.AbstractCm.m٥٥٠٨e(this.f٦٨٨٣i, drawable2, drawableArr[1], drawableArr[2], drawableArr[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.f٦٨٧٤d0 != null) {
                Drawable[] drawableArr2 = p٠٣٠h0.AbstractCm.m٥٥٠٤a(this.f٦٨٨٣i);
                p٠٣٠h0.AbstractCm.m٥٥٠٨e(this.f٦٨٨٣i, null, drawableArr2[1], drawableArr2[2], drawableArr2[3]);
                this.f٦٨٧٤d0 = null;
                z = true;
            }
            z = false;
        }
        if ((this.f٦٩٠٢r0.getVisibility() == 0 || ((m٤٦٧٦h() && m٤٦٧٨j()) || this.f٦٨٤٤E != null)) && this.f٦٨٧٩g.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.f٦٨٤٦F.getMeasuredWidth() - this.f٦٨٨٣i.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = p٠١٨e0.AbstractCm.m٥٠٦١c((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()) + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] drawableArr3 = p٠٣٠h0.AbstractCm.m٥٥٠٤a(this.f٦٨٨٣i);
            Drawable drawable3 = this.f٦٨٩٢m0;
            if (drawable3 == null || this.f٦٨٩٤n0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f٦٨٩٢m0 = colorDrawable2;
                    this.f٦٨٩٤n0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArr3[2];
                Drawable drawable5 = this.f٦٨٩٢m0;
                if (drawable4 != drawable5) {
                    this.f٦٨٩٦o0 = drawableArr3[2];
                    p٠٣٠h0.AbstractCm.m٥٥٠٨e(this.f٦٨٨٣i, drawableArr3[0], drawableArr3[1], drawable5, drawableArr3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.f٦٨٩٤n0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                p٠٣٠h0.AbstractCm.m٥٥٠٨e(this.f٦٨٨٣i, drawableArr3[0], drawableArr3[1], this.f٦٨٩٢m0, drawableArr3[3]);
            }
        } else if (this.f٦٨٩٢m0 == null) {
            return z;
        } else {
            Drawable[] drawableArr4 = p٠٣٠h0.AbstractCm.m٥٥٠٤a(this.f٦٨٨٣i);
            if (drawableArr4[2] == this.f٦٨٩٢m0) {
                p٠٣٠h0.AbstractCm.m٥٥٠٨e(this.f٦٨٨٣i, drawableArr4[0], drawableArr4[1], this.f٦٨٩٦o0, drawableArr4[3]);
            } else {
                z2 = z;
            }
            this.f٦٨٩٢m0 = null;
        }
        return z2;
    }

    /* renamed from: v  reason: contains not printable characters */
    public void m٤٦٨٨v() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f٦٨٨٣i;
        if (editText == null || this.f٦٨٦٣P != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractCj1.f٥٠٢٣a;
        Drawable mutate = background.mutate();
        if (this.f٦٨٩٥o.m٦٣٢٩e()) {
            currentTextColor = this.f٦٨٩٥o.m٦٣٣١g();
        } else if (!this.f٦٩٠١r || (textView = this.f٦٩٠٣s) == null) {
            mutate.clearColorFilter();
            this.f٦٨٨٣i.refreshDrawableState();
            return;
        } else {
            currentTextColor = textView.getCurrentTextColor();
        }
        mutate.setColorFilter(Cp.m٣١٧٢c(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: w  reason: contains not printable characters */
    public final void m٤٦٨٩w() {
        this.f٦٨٨١h.setVisibility((this.f٦٨٨٤i0.getVisibility() != 0 || m٤٦٧٩k()) ? 8 : 0);
        this.f٦٨٧٩g.setVisibility(m٤٦٧٨j() || m٤٦٧٩k() || !((this.f٦٨٤٤E == null || this.f٦٨٤٧F0) ? true : false) ? 0 : 8);
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
            Cr cr = this.f٦٨٩٥o;
            if (cr.f٨٧٢٢k && cr.m٦٣٢٩e()) {
                z = true;
                this.f٦٩٠٢r0.setVisibility(z ? 0 : 8);
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
        this.f٦٩٠٢r0.setVisibility(z ? 0 : 8);
        m٤٦٨٩w();
        m٤٦٦٦C();
        if (m٤٦٧٦h()) {
        }
    }

    /* renamed from: y  reason: contains not printable characters */
    public final void m٤٦٩١y() {
        if (this.f٦٨٦٣P != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f٦٨٧٥e.getLayoutParams();
            int i = m٤٦٧٢d();
            if (i != layoutParams.topMargin) {
                layoutParams.topMargin = i;
                this.f٦٨٧٥e.requestLayout();
            }
        }
    }

    /* renamed from: z  reason: contains not printable characters */
    public final void m٤٦٩٢z(boolean z, boolean z2) {
        ColorStateList colorStateList;
        Cc cc;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f٦٨٨٣i;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f٦٨٨٣i;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean z5 = this.f٦٨٩٥o.m٦٣٢٩e();
        ColorStateList colorStateList2 = this.f٦٩٠٨u0;
        if (colorStateList2 != null) {
            Cc cc2 = this.f٦٨٤٩G0;
            if (cc2.f٨٠٥٦m != colorStateList2) {
                cc2.f٨٠٥٦m = colorStateList2;
                cc2.m٥٨٩٥k(false);
            }
            Cc cc3 = this.f٦٨٤٩G0;
            ColorStateList colorStateList3 = this.f٦٩٠٨u0;
            if (cc3.f٨٠٥٥l != colorStateList3) {
                cc3.f٨٠٥٥l = colorStateList3;
                cc3.m٥٨٩٥k(false);
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f٦٩٠٨u0;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.f٦٨٤٥E0) : this.f٦٨٤٥E0;
            this.f٦٨٤٩G0.m٥٨٩٦m(ColorStateList.valueOf(colorForState));
            Cc cc4 = this.f٦٨٤٩G0;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (cc4.f٨٠٥٥l != valueOf) {
                cc4.f٨٠٥٥l = valueOf;
                cc4.m٥٨٩٥k(false);
            }
        } else if (z5) {
            Cc cc5 = this.f٦٨٤٩G0;
            TextView textView2 = this.f٦٨٩٥o.f٨٧٢٣l;
            cc5.m٥٨٩٦m(textView2 != null ? textView2.getTextColors() : null);
        } else {
            if (this.f٦٩٠١r && (textView = this.f٦٩٠٣s) != null) {
                cc = this.f٦٨٤٩G0;
                colorStateList = textView.getTextColors();
            } else if (z4 && (colorStateList = this.f٦٩١٠v0) != null) {
                cc = this.f٦٨٤٩G0;
            }
            cc.m٥٨٩٦m(colorStateList);
        }
        if (z3 || !this.f٦٨٥١H0 || (isEnabled() && z4)) {
            if (z2 || this.f٦٨٤٧F0) {
                ValueAnimator valueAnimator = this.f٦٨٥٥J0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f٦٨٥٥J0.cancel();
                }
                if (z && this.f٦٨٥٣I0) {
                    m٤٦٧٠b(1.0f);
                } else {
                    this.f٦٨٤٩G0.m٥٨٩٩p(1.0f);
                }
                this.f٦٨٤٧F0 = false;
                if (m٤٦٧٣e()) {
                    m٤٦٨١m();
                }
                EditText editText3 = this.f٦٨٨٣i;
                m٤٦٦٤A(editText3 == null ? 0 : editText3.getText().length());
                Cw cw = this.f٦٨٧٧f;
                cw.f٨٧٤٨l = false;
                cw.m٦٣٤٩h();
                m٤٦٦٧D();
            }
        } else if (z2 || !this.f٦٨٤٧F0) {
            ValueAnimator valueAnimator2 = this.f٦٨٥٥J0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f٦٨٥٥J0.cancel();
            }
            if (z && this.f٦٨٥٣I0) {
                m٤٦٧٠b(0.0f);
            } else {
                this.f٦٨٤٩G0.m٥٨٩٩p(0.0f);
            }
            if (m٤٦٧٣e() && (!((Ci) this.f٦٨٥٤J).f٨٦٨٠D.isEmpty()) && m٤٦٧٣e()) {
                ((Ci) this.f٦٨٥٤J).m٦٣٠٨x(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f٦٨٤٧F0 = true;
            m٤٦٧٧i();
            Cw cw2 = this.f٦٨٧٧f;
            cw2.f٨٧٤٨l = true;
            cw2.m٦٣٤٩h();
            m٤٦٦٧D();
        }
    }
}
