package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

/* loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {
    private static float DEFAULT_ANGLE = 0.0f;
    private static int DEFAULT_RADIUS = 0;
    private static final String TAG = "CircularFlow";
    private float[] mAngles;
    ConstraintLayout mContainer;
    private int mCountAngle;
    private int mCountRadius;
    private int[] mRadius;
    private String mReferenceAngles;
    private Float mReferenceDefaultAngle;
    private Integer mReferenceDefaultRadius;
    private String mReferenceRadius;
    int mViewCenter;

    public CircularFlow(Context context) {
        super(context);
    }

    private void addAngle(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.myContext == null || (fArr = this.mAngles) == null) {
            return;
        }
        if (this.mCountAngle + 1 > fArr.length) {
            this.mAngles = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.mAngles[this.mCountAngle] = Integer.parseInt(str);
        this.mCountAngle++;
    }

    private void addRadius(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.myContext == null || (iArr = this.mRadius) == null) {
            return;
        }
        if (this.mCountRadius + 1 > iArr.length) {
            this.mRadius = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.mRadius[this.mCountRadius] = (int) (Integer.parseInt(str) * this.myContext.getResources().getDisplayMetrics().density);
        this.mCountRadius++;
    }

    private void anchorReferences() {
        this.mContainer = (ConstraintLayout) getParent();
        for (int i8 = 0; i8 < this.mCount; i8++) {
            View viewById = this.mContainer.getViewById(this.mIds[i8]);
            if (viewById != null) {
                int i9 = DEFAULT_RADIUS;
                float f8 = DEFAULT_ANGLE;
                int[] iArr = this.mRadius;
                if (iArr != null && i8 < iArr.length) {
                    i9 = iArr[i8];
                } else {
                    Integer num = this.mReferenceDefaultRadius;
                    if (num != null && num.intValue() != -1) {
                        this.mCountRadius++;
                        if (this.mRadius == null) {
                            this.mRadius = new int[1];
                        }
                        int[] radius = getRadius();
                        this.mRadius = radius;
                        radius[this.mCountRadius - 1] = i9;
                    } else {
                        Log.e(TAG, "Added radius to view with id: " + this.mMap.get(Integer.valueOf(viewById.getId())));
                    }
                }
                float[] fArr = this.mAngles;
                if (fArr != null && i8 < fArr.length) {
                    f8 = fArr[i8];
                } else {
                    Float f9 = this.mReferenceDefaultAngle;
                    if (f9 != null && f9.floatValue() != -1.0f) {
                        this.mCountAngle++;
                        if (this.mAngles == null) {
                            this.mAngles = new float[1];
                        }
                        float[] angles = getAngles();
                        this.mAngles = angles;
                        angles[this.mCountAngle - 1] = f8;
                    } else {
                        Log.e(TAG, "Added angle to view with id: " + this.mMap.get(Integer.valueOf(viewById.getId())));
                    }
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.circleAngle = f8;
                layoutParams.circleConstraint = this.mViewCenter;
                layoutParams.circleRadius = i9;
                viewById.setLayoutParams(layoutParams);
            }
        }
        applyLayoutFeatures();
    }

    private float[] removeAngle(float[] fArr, int i8) {
        if (fArr != null && i8 >= 0 && i8 < this.mCountAngle) {
            return removeElementFromArray(fArr, i8);
        }
        return fArr;
    }

    public static int[] removeElementFromArray(int[] iArr, int i8) {
        int[] iArr2 = new int[iArr.length - 1];
        int i9 = 0;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (i10 != i8) {
                iArr2[i9] = iArr[i10];
                i9++;
            }
        }
        return iArr2;
    }

    private int[] removeRadius(int[] iArr, int i8) {
        if (iArr != null && i8 >= 0 && i8 < this.mCountRadius) {
            return removeElementFromArray(iArr, i8);
        }
        return iArr;
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i8 = 0;
        this.mCountAngle = 0;
        while (true) {
            int indexOf = str.indexOf(44, i8);
            if (indexOf == -1) {
                addAngle(str.substring(i8).trim());
                return;
            } else {
                addAngle(str.substring(i8, indexOf).trim());
                i8 = indexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i8 = 0;
        this.mCountRadius = 0;
        while (true) {
            int indexOf = str.indexOf(44, i8);
            if (indexOf == -1) {
                addRadius(str.substring(i8).trim());
                return;
            } else {
                addRadius(str.substring(i8, indexOf).trim());
                i8 = indexOf + 1;
            }
        }
    }

    public void addViewToCircularFlow(View view, int i8, float f8) {
        if (containsId(view.getId())) {
            return;
        }
        addView(view);
        this.mCountAngle++;
        float[] angles = getAngles();
        this.mAngles = angles;
        angles[this.mCountAngle - 1] = f8;
        this.mCountRadius++;
        int[] radius = getRadius();
        this.mRadius = radius;
        radius[this.mCountRadius - 1] = (int) (i8 * this.myContext.getResources().getDisplayMetrics().density);
        anchorReferences();
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.mAngles, this.mCountAngle);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.mRadius, this.mCountRadius);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == R.styleable.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.mViewCenter = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_angles) {
                    String string = obtainStyledAttributes.getString(index);
                    this.mReferenceAngles = string;
                    setAngles(string);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.mReferenceRadius = string2;
                    setRadius(string2);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, DEFAULT_ANGLE));
                    this.mReferenceDefaultAngle = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, DEFAULT_RADIUS));
                    this.mReferenceDefaultRadius = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public boolean isUpdatable(View view) {
        if (!containsId(view.getId()) || indexFromId(view.getId()) == -1) {
            return false;
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.mReferenceAngles;
        if (str != null) {
            this.mAngles = new float[1];
            setAngles(str);
        }
        String str2 = this.mReferenceRadius;
        if (str2 != null) {
            this.mRadius = new int[1];
            setRadius(str2);
        }
        Float f8 = this.mReferenceDefaultAngle;
        if (f8 != null) {
            setDefaultAngle(f8.floatValue());
        }
        Integer num = this.mReferenceDefaultRadius;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        anchorReferences();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public int removeView(View view) {
        int removeView = super.removeView(view);
        if (removeView == -1) {
            return removeView;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.mContainer);
        constraintSet.clear(view.getId(), 8);
        constraintSet.applyTo(this.mContainer);
        float[] fArr = this.mAngles;
        if (removeView < fArr.length) {
            this.mAngles = removeAngle(fArr, removeView);
            this.mCountAngle--;
        }
        int[] iArr = this.mRadius;
        if (removeView < iArr.length) {
            this.mRadius = removeRadius(iArr, removeView);
            this.mCountRadius--;
        }
        anchorReferences();
        return removeView;
    }

    public void setDefaultAngle(float f8) {
        DEFAULT_ANGLE = f8;
    }

    public void setDefaultRadius(int i8) {
        DEFAULT_RADIUS = i8;
    }

    public void updateAngle(View view, float f8) {
        if (!isUpdatable(view)) {
            Log.e(TAG, "It was not possible to update angle to view with id: " + view.getId());
            return;
        }
        int indexFromId = indexFromId(view.getId());
        if (indexFromId > this.mAngles.length) {
            return;
        }
        float[] angles = getAngles();
        this.mAngles = angles;
        angles[indexFromId] = f8;
        anchorReferences();
    }

    public void updateRadius(View view, int i8) {
        if (!isUpdatable(view)) {
            Log.e(TAG, "It was not possible to update radius to view with id: " + view.getId());
            return;
        }
        int indexFromId = indexFromId(view.getId());
        if (indexFromId > this.mRadius.length) {
            return;
        }
        int[] radius = getRadius();
        this.mRadius = radius;
        radius[indexFromId] = (int) (i8 * this.myContext.getResources().getDisplayMetrics().density);
        anchorReferences();
    }

    public void updateReference(View view, int i8, float f8) {
        if (!isUpdatable(view)) {
            Log.e(TAG, "It was not possible to update radius and angle to view with id: " + view.getId());
            return;
        }
        int indexFromId = indexFromId(view.getId());
        if (getAngles().length > indexFromId) {
            float[] angles = getAngles();
            this.mAngles = angles;
            angles[indexFromId] = f8;
        }
        if (getRadius().length > indexFromId) {
            int[] radius = getRadius();
            this.mRadius = radius;
            radius[indexFromId] = (int) (i8 * this.myContext.getResources().getDisplayMetrics().density);
        }
        anchorReferences();
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }

    public static float[] removeElementFromArray(float[] fArr, int i8) {
        float[] fArr2 = new float[fArr.length - 1];
        int i9 = 0;
        for (int i10 = 0; i10 < fArr.length; i10++) {
            if (i10 != i8) {
                fArr2[i9] = fArr[i10];
                i9++;
            }
        }
        return fArr2;
    }
}
