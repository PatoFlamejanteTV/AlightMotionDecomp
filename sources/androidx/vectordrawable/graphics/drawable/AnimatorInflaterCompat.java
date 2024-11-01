package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.AnimatorRes;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public class AnimatorInflaterCompat {
    private static final boolean DBG_ANIMATOR_INFLATER = false;
    private static final int MAX_NUM_POINTS = 100;
    private static final String TAG = "AnimatorInflater";
    private static final int TOGETHER = 0;
    private static final int VALUE_TYPE_COLOR = 3;
    private static final int VALUE_TYPE_FLOAT = 0;
    private static final int VALUE_TYPE_INT = 1;
    private static final int VALUE_TYPE_PATH = 2;
    private static final int VALUE_TYPE_UNDEFINED = 4;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class PathDataEvaluator implements TypeEvaluator<PathParser.PathDataNode[]> {
        private PathParser.PathDataNode[] mNodeArray;

        PathDataEvaluator() {
        }

        PathDataEvaluator(PathParser.PathDataNode[] pathDataNodeArr) {
            this.mNodeArray = pathDataNodeArr;
        }

        @Override // android.animation.TypeEvaluator
        public PathParser.PathDataNode[] evaluate(float f8, PathParser.PathDataNode[] pathDataNodeArr, PathParser.PathDataNode[] pathDataNodeArr2) {
            if (PathParser.canMorph(pathDataNodeArr, pathDataNodeArr2)) {
                if (!PathParser.canMorph(this.mNodeArray, pathDataNodeArr)) {
                    this.mNodeArray = PathParser.deepCopyNodes(pathDataNodeArr);
                }
                for (int i8 = 0; i8 < pathDataNodeArr.length; i8++) {
                    this.mNodeArray[i8].interpolatePathDataNode(pathDataNodeArr[i8], pathDataNodeArr2[i8], f8);
                }
                return this.mNodeArray;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    private AnimatorInflaterCompat() {
    }

    private static Animator createAnimatorFromXml(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f8) throws XmlPullParserException, IOException {
        return createAnimatorFromXml(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f8);
    }

    private static Keyframe createNewKeyframe(Keyframe keyframe, float f8) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f8);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f8);
        }
        return Keyframe.ofObject(f8);
    }

    private static void distributeKeyframes(Keyframe[] keyframeArr, float f8, int i8, int i9) {
        float f9 = f8 / ((i9 - i8) + 2);
        while (i8 <= i9) {
            keyframeArr[i8].setFraction(keyframeArr[i8 - 1].getFraction() + f9);
            i8++;
        }
    }

    private static void dumpKeyframes(Object[] objArr, String str) {
        Object valueOf;
        if (objArr != null && objArr.length != 0) {
            Log.d(TAG, str);
            int length = objArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                Keyframe keyframe = (Keyframe) objArr[i8];
                StringBuilder sb = new StringBuilder();
                sb.append("Keyframe ");
                sb.append(i8);
                sb.append(": fraction ");
                Object obj = "null";
                if (keyframe.getFraction() < 0.0f) {
                    valueOf = "null";
                } else {
                    valueOf = Float.valueOf(keyframe.getFraction());
                }
                sb.append(valueOf);
                sb.append(", , value : ");
                if (keyframe.hasValue()) {
                    obj = keyframe.getValue();
                }
                sb.append(obj);
                Log.d(TAG, sb.toString());
            }
        }
    }

    private static PropertyValuesHolder getPVH(TypedArray typedArray, int i8, int i9, int i10, String str) {
        boolean z8;
        int i11;
        boolean z9;
        int i12;
        boolean z10;
        ArgbEvaluator argbEvaluator;
        int i13;
        int i14;
        int i15;
        float f8;
        PropertyValuesHolder ofFloat;
        float f9;
        float f10;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i9);
        if (peekValue != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i11 = peekValue.type;
        } else {
            i11 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i10);
        if (peekValue2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i12 = peekValue2.type;
        } else {
            i12 = 0;
        }
        if (i8 == 4) {
            if ((z8 && isColorType(i11)) || (z9 && isColorType(i12))) {
                i8 = 3;
            } else {
                i8 = 0;
            }
        }
        if (i8 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i8 == 2) {
            String string = typedArray.getString(i9);
            String string2 = typedArray.getString(i10);
            PathParser.PathDataNode[] createNodesFromPathData = PathParser.createNodesFromPathData(string);
            PathParser.PathDataNode[] createNodesFromPathData2 = PathParser.createNodesFromPathData(string2);
            if (createNodesFromPathData == null && createNodesFromPathData2 == null) {
                return null;
            }
            if (createNodesFromPathData != null) {
                PathDataEvaluator pathDataEvaluator = new PathDataEvaluator();
                if (createNodesFromPathData2 != null) {
                    if (PathParser.canMorph(createNodesFromPathData, createNodesFromPathData2)) {
                        ofObject = PropertyValuesHolder.ofObject(str, pathDataEvaluator, createNodesFromPathData, createNodesFromPathData2);
                    } else {
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, pathDataEvaluator, createNodesFromPathData);
                }
                return ofObject;
            }
            if (createNodesFromPathData2 == null) {
                return null;
            }
            return PropertyValuesHolder.ofObject(str, new PathDataEvaluator(), createNodesFromPathData2);
        }
        if (i8 == 3) {
            argbEvaluator = ArgbEvaluator.getInstance();
        } else {
            argbEvaluator = null;
        }
        if (z10) {
            if (z8) {
                if (i11 == 5) {
                    f9 = typedArray.getDimension(i9, 0.0f);
                } else {
                    f9 = typedArray.getFloat(i9, 0.0f);
                }
                if (z9) {
                    if (i12 == 5) {
                        f10 = typedArray.getDimension(i10, 0.0f);
                    } else {
                        f10 = typedArray.getFloat(i10, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f9, f10);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f9);
                }
            } else {
                if (i12 == 5) {
                    f8 = typedArray.getDimension(i10, 0.0f);
                } else {
                    f8 = typedArray.getFloat(i10, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f8);
            }
            propertyValuesHolder = ofFloat;
        } else if (z8) {
            if (i11 == 5) {
                i14 = (int) typedArray.getDimension(i9, 0.0f);
            } else if (isColorType(i11)) {
                i14 = typedArray.getColor(i9, 0);
            } else {
                i14 = typedArray.getInt(i9, 0);
            }
            if (z9) {
                if (i12 == 5) {
                    i15 = (int) typedArray.getDimension(i10, 0.0f);
                } else if (isColorType(i12)) {
                    i15 = typedArray.getColor(i10, 0);
                } else {
                    i15 = typedArray.getInt(i10, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14, i15);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14);
            }
        } else if (z9) {
            if (i12 == 5) {
                i13 = (int) typedArray.getDimension(i10, 0.0f);
            } else if (isColorType(i12)) {
                i13 = typedArray.getColor(i10, 0);
            } else {
                i13 = typedArray.getInt(i10, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i13);
        }
        if (propertyValuesHolder != null && argbEvaluator != null) {
            propertyValuesHolder.setEvaluator(argbEvaluator);
            return propertyValuesHolder;
        }
        return propertyValuesHolder;
    }

    private static int inferValueTypeFromValues(TypedArray typedArray, int i8, int i9) {
        boolean z8;
        int i10;
        int i11;
        TypedValue peekValue = typedArray.peekValue(i8);
        boolean z9 = true;
        if (peekValue != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i10 = peekValue.type;
        } else {
            i10 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i9);
        if (peekValue2 == null) {
            z9 = false;
        }
        if (z9) {
            i11 = peekValue2.type;
        } else {
            i11 = 0;
        }
        if ((!z8 || !isColorType(i10)) && (!z9 || !isColorType(i11))) {
            return 0;
        }
        return 3;
    }

    private static int inferValueTypeOfKeyframe(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_KEYFRAME);
        int i8 = 0;
        TypedValue peekNamedValue = TypedArrayUtils.peekNamedValue(obtainAttributes, xmlPullParser, "value", 0);
        if (peekNamedValue != null && isColorType(peekNamedValue.type)) {
            i8 = 3;
        }
        obtainAttributes.recycle();
        return i8;
    }

    private static boolean isColorType(int i8) {
        return i8 >= 28 && i8 <= 31;
    }

    public static Animator loadAnimator(Context context, @AnimatorRes int i8) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i8);
        }
        return loadAnimator(context, context.getResources(), context.getTheme(), i8);
    }

    private static Keyframe loadKeyframe(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i8, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean z8;
        Keyframe ofInt;
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_KEYFRAME);
        float namedFloat = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue peekNamedValue = TypedArrayUtils.peekNamedValue(obtainAttributes, xmlPullParser, "value", 0);
        if (peekNamedValue != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (i8 == 4) {
            if (z8 && isColorType(peekNamedValue.type)) {
                i8 = 3;
            } else {
                i8 = 0;
            }
        }
        if (z8) {
            if (i8 != 0) {
                if (i8 != 1 && i8 != 3) {
                    ofInt = null;
                } else {
                    ofInt = Keyframe.ofInt(namedFloat, TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "value", 0, 0));
                }
            } else {
                ofInt = Keyframe.ofFloat(namedFloat, TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "value", 0, 0.0f));
            }
        } else if (i8 == 0) {
            ofInt = Keyframe.ofFloat(namedFloat);
        } else {
            ofInt = Keyframe.ofInt(namedFloat);
        }
        int namedResourceId = TypedArrayUtils.getNamedResourceId(obtainAttributes, xmlPullParser, "interpolator", 1, 0);
        if (namedResourceId > 0) {
            ofInt.setInterpolator(AnimationUtilsCompat.loadInterpolator(context, namedResourceId));
        }
        obtainAttributes.recycle();
        return ofInt;
    }

    private static ObjectAnimator loadObjectAnimator(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f8, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        loadAnimator(context, resources, theme, attributeSet, objectAnimator, f8, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder loadPvh(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i8) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i8 == 4) {
                    i8 = inferValueTypeOfKeyframe(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe loadKeyframe = loadKeyframe(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i8, xmlPullParser);
                if (loadKeyframe != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(loadKeyframe);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), createNewKeyframe(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, createNewKeyframe(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i9 = 0; i9 < size; i9++) {
                Keyframe keyframe3 = keyframeArr[i9];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i9 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i10 = size - 1;
                        if (i9 == i10) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i11 = i9;
                            for (int i12 = i9 + 1; i12 < i10 && keyframeArr[i12].getFraction() < 0.0f; i12++) {
                                i11 = i12;
                            }
                            distributeKeyframes(keyframeArr, keyframeArr[i11 + 1].getFraction() - keyframeArr[i9 - 1].getFraction(), i9, i11);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i8 == 3) {
                propertyValuesHolder.setEvaluator(ArgbEvaluator.getInstance());
            }
        }
        return propertyValuesHolder;
    }

    private static PropertyValuesHolder[] loadValues(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i8;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_PROPERTY_VALUES_HOLDER);
                    String namedString = TypedArrayUtils.getNamedString(obtainAttributes, xmlPullParser, "propertyName", 3);
                    int namedInt = TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder loadPvh = loadPvh(context, resources, theme, xmlPullParser, namedString, namedInt);
                    if (loadPvh == null) {
                        loadPvh = getPVH(obtainAttributes, namedInt, 0, 1, namedString);
                    }
                    if (loadPvh != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(loadPvh);
                    }
                    obtainAttributes.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i8 = 0; i8 < size; i8++) {
                propertyValuesHolderArr[i8] = (PropertyValuesHolder) arrayList.get(i8);
            }
        }
        return propertyValuesHolderArr;
    }

    private static void parseAnimatorFromTypeArray(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f8, XmlPullParser xmlPullParser) {
        long namedInt = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, TypedValues.TransitionType.S_DURATION, 1, 300);
        long namedInt2 = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "startOffset", 2, 0);
        int namedInt3 = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "valueType", 7, 4);
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "valueFrom") && TypedArrayUtils.hasAttribute(xmlPullParser, "valueTo")) {
            if (namedInt3 == 4) {
                namedInt3 = inferValueTypeFromValues(typedArray, 5, 6);
            }
            PropertyValuesHolder pvh = getPVH(typedArray, namedInt3, 5, 6, "");
            if (pvh != null) {
                valueAnimator.setValues(pvh);
            }
        }
        valueAnimator.setDuration(namedInt);
        valueAnimator.setStartDelay(namedInt2);
        valueAnimator.setRepeatCount(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            setupObjectAnimator(valueAnimator, typedArray2, namedInt3, f8, xmlPullParser);
        }
    }

    private static void setupObjectAnimator(ValueAnimator valueAnimator, TypedArray typedArray, int i8, float f8, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String namedString = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "pathData", 1);
        if (namedString != null) {
            String namedString2 = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyXName", 2);
            String namedString3 = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyYName", 3);
            if (i8 != 2) {
            }
            if (namedString2 == null && namedString3 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            setupPathMotion(PathParser.createPathFromPathData(namedString), objectAnimator, f8 * 0.5f, namedString2, namedString3);
            return;
        }
        objectAnimator.setPropertyName(TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyName", 0));
    }

    private static void setupPathMotion(Path path, ObjectAnimator objectAnimator, float f8, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        int i8 = 1;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f9 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f10 = 0.0f;
        do {
            f10 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f10));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f10 / f8)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f11 = f10 / (min - 1);
        int i9 = 0;
        int i10 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i9 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f9 - ((Float) arrayList.get(i10)).floatValue(), fArr3, null);
            fArr[i9] = fArr3[0];
            fArr2[i9] = fArr3[1];
            f9 += f11;
            int i11 = i10 + 1;
            if (i11 < arrayList.size() && f9 > ((Float) arrayList.get(i11)).floatValue()) {
                pathMeasure2.nextContour();
                i10 = i11;
            }
            i8 = 1;
            i9++;
        }
        if (str != null) {
            propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str, fArr);
        } else {
            propertyValuesHolder2 = null;
        }
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (propertyValuesHolder2 == null) {
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[i8];
            propertyValuesHolderArr[0] = propertyValuesHolder;
            objectAnimator.setValues(propertyValuesHolderArr);
        } else if (propertyValuesHolder == null) {
            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[i8];
            propertyValuesHolderArr2[0] = propertyValuesHolder2;
            objectAnimator.setValues(propertyValuesHolderArr2);
        } else {
            PropertyValuesHolder[] propertyValuesHolderArr3 = new PropertyValuesHolder[2];
            propertyValuesHolderArr3[0] = propertyValuesHolder2;
            propertyValuesHolderArr3[i8] = propertyValuesHolder;
            objectAnimator.setValues(propertyValuesHolderArr3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator createAnimatorFromXml(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat.createAnimatorFromXml(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Animator loadAnimator(Context context, Resources resources, Resources.Theme theme, @AnimatorRes int i8) throws Resources.NotFoundException {
        return loadAnimator(context, resources, theme, i8, 1.0f);
    }

    public static Animator loadAnimator(Context context, Resources resources, Resources.Theme theme, @AnimatorRes int i8, float f8) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i8);
                    return createAnimatorFromXml(context, resources, theme, xmlResourceParser, f8);
                } catch (XmlPullParserException e8) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i8));
                    notFoundException.initCause(e8);
                    throw notFoundException;
                }
            } catch (IOException e9) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i8));
                notFoundException2.initCause(e9);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static ValueAnimator loadAnimator(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f8, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_ANIMATOR);
        TypedArray obtainAttributes2 = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_PROPERTY_ANIMATOR);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        parseAnimatorFromTypeArray(valueAnimator, obtainAttributes, obtainAttributes2, f8, xmlPullParser);
        int namedResourceId = TypedArrayUtils.getNamedResourceId(obtainAttributes, xmlPullParser, "interpolator", 0, 0);
        if (namedResourceId > 0) {
            valueAnimator.setInterpolator(AnimationUtilsCompat.loadInterpolator(context, namedResourceId));
        }
        obtainAttributes.recycle();
        if (obtainAttributes2 != null) {
            obtainAttributes2.recycle();
        }
        return valueAnimator;
    }
}
