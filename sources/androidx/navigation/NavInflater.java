package androidx.navigation;

import Q5.I;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.NavArgument;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavOptions;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class NavInflater {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String APPLICATION_ID_PLACEHOLDER = "${applicationId}";
    private static final String TAG_ACTION = "action";
    private static final String TAG_ARGUMENT = "argument";
    private static final String TAG_DEEP_LINK = "deepLink";
    private static final String TAG_INCLUDE = "include";
    private final Context context;
    private final NavigatorProvider navigatorProvider;
    public static final Companion Companion = new Companion(null);
    private static final ThreadLocal<TypedValue> sTmpValue = new ThreadLocal<>();

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final NavType<?> checkNavType$navigation_runtime_release(TypedValue value, NavType<?> navType, NavType<?> expectedNavType, String str, String foundType) throws XmlPullParserException {
            AbstractC3292y.i(value, "value");
            AbstractC3292y.i(expectedNavType, "expectedNavType");
            AbstractC3292y.i(foundType, "foundType");
            if (navType != null && navType != expectedNavType) {
                throw new XmlPullParserException("Type is " + str + " but found " + foundType + ": " + value.data);
            }
            if (navType == null) {
                return expectedNavType;
            }
            return navType;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public NavInflater(Context context, NavigatorProvider navigatorProvider) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(navigatorProvider, "navigatorProvider");
        this.context = context;
        this.navigatorProvider = navigatorProvider;
    }

    private final void inflateAction(Resources resources, NavDestination navDestination, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i8) throws IOException, XmlPullParserException {
        int depth;
        Context context = this.context;
        int[] NavAction = androidx.navigation.common.R.styleable.NavAction;
        AbstractC3292y.h(NavAction, "NavAction");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NavAction, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_android_id, 0);
        NavAction navAction = new NavAction(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_destination, 0), null, null, 6, null);
        NavOptions.Builder builder = new NavOptions.Builder();
        builder.setLaunchSingleTop(obtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_launchSingleTop, false));
        builder.setRestoreState(obtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_restoreState, false));
        builder.setPopUpTo(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popUpTo, -1), obtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_popUpToInclusive, false), obtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_popUpToSaveState, false));
        builder.setEnterAnim(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_enterAnim, -1));
        builder.setExitAnim(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_exitAnim, -1));
        builder.setPopEnterAnim(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popEnterAnim, -1));
        builder.setPopExitAnim(obtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popExitAnim, -1));
        navAction.setNavOptions(builder.build());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && AbstractC3292y.d(TAG_ARGUMENT, xmlResourceParser.getName())) {
                inflateArgumentForBundle(resources, bundle, attributeSet, i8);
            }
        }
        if (!bundle.isEmpty()) {
            navAction.setDefaultArguments(bundle);
        }
        navDestination.putAction(resourceId, navAction);
        obtainStyledAttributes.recycle();
    }

    private final NavArgument inflateArgument(TypedArray typedArray, Resources resources, int i8) throws XmlPullParserException {
        NavType<Object> navType;
        NavArgument.Builder builder = new NavArgument.Builder();
        boolean z8 = false;
        int i9 = 0;
        builder.setIsNullable(typedArray.getBoolean(androidx.navigation.common.R.styleable.NavArgument_nullable, false));
        ThreadLocal<TypedValue> threadLocal = sTmpValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(androidx.navigation.common.R.styleable.NavArgument_argType);
        Object obj = null;
        if (string != null) {
            navType = b.a(NavType.Companion, string, resources.getResourcePackageName(i8));
        } else {
            navType = null;
        }
        int i10 = androidx.navigation.common.R.styleable.NavArgument_android_defaultValue;
        if (typedArray.getValue(i10, typedValue)) {
            NavType<Object> navType2 = NavType.ReferenceType;
            if (navType == navType2) {
                int i11 = typedValue.resourceId;
                if (i11 != 0) {
                    i9 = i11;
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + navType.getName() + ". Must be a reference to a resource.");
                }
                obj = Integer.valueOf(i9);
            } else {
                int i12 = typedValue.resourceId;
                if (i12 != 0) {
                    if (navType == null) {
                        navType = navType2;
                        obj = Integer.valueOf(i12);
                    } else {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + navType.getName() + ". You must use a \"" + navType2.getName() + "\" type to reference other resources.");
                    }
                } else if (navType == NavType.StringType) {
                    obj = typedArray.getString(i10);
                } else {
                    int i13 = typedValue.type;
                    if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 != 5) {
                                if (i13 != 18) {
                                    if (i13 >= 16 && i13 <= 31) {
                                        NavType<Object> navType3 = NavType.FloatType;
                                        if (navType == navType3) {
                                            navType = Companion.checkNavType$navigation_runtime_release(typedValue, navType, navType3, string, TypedValues.Custom.S_FLOAT);
                                            obj = Float.valueOf(typedValue.data);
                                        } else {
                                            navType = Companion.checkNavType$navigation_runtime_release(typedValue, navType, NavType.IntType, string, TypedValues.Custom.S_INT);
                                            obj = Integer.valueOf(typedValue.data);
                                        }
                                    } else {
                                        throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                                    }
                                } else {
                                    navType = Companion.checkNavType$navigation_runtime_release(typedValue, navType, NavType.BoolType, string, TypedValues.Custom.S_BOOLEAN);
                                    if (typedValue.data != 0) {
                                        z8 = true;
                                    }
                                    obj = Boolean.valueOf(z8);
                                }
                            } else {
                                navType = Companion.checkNavType$navigation_runtime_release(typedValue, navType, NavType.IntType, string, TypedValues.Custom.S_DIMENSION);
                                obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                            }
                        } else {
                            navType = Companion.checkNavType$navigation_runtime_release(typedValue, navType, NavType.FloatType, string, TypedValues.Custom.S_FLOAT);
                            obj = Float.valueOf(typedValue.getFloat());
                        }
                    } else {
                        String obj2 = typedValue.string.toString();
                        if (navType == null) {
                            navType = NavType.Companion.inferFromValue(obj2);
                        }
                        obj = navType.parseValue(obj2);
                    }
                }
            }
        }
        if (obj != null) {
            builder.setDefaultValue(obj);
        }
        if (navType != null) {
            builder.setType(navType);
        }
        return builder.build();
    }

    private final void inflateArgumentForBundle(Resources resources, Bundle bundle, AttributeSet attributeSet, int i8) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavArgument);
        AbstractC3292y.h(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if (string != null) {
            AbstractC3292y.h(string, "array.getString(R.stylea…uments must have a name\")");
            NavArgument inflateArgument = inflateArgument(obtainAttributes, resources, i8);
            if (inflateArgument.isDefaultValuePresent()) {
                inflateArgument.putDefaultValue(string, bundle);
            }
            I i9 = I.f8786a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private final void inflateArgumentForDestination(Resources resources, NavDestination navDestination, AttributeSet attributeSet, int i8) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavArgument);
        AbstractC3292y.h(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if (string != null) {
            AbstractC3292y.h(string, "array.getString(R.stylea…uments must have a name\")");
            navDestination.addArgument(string, inflateArgument(obtainAttributes, resources, i8));
            I i9 = I.f8786a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private final void inflateDeepLink(Resources resources, NavDestination navDestination, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavDeepLink);
        AbstractC3292y.h(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_uri);
        String string2 = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_action);
        String string3 = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_mimeType);
        if ((string != null && string.length() != 0) || ((string2 != null && string2.length() != 0) || (string3 != null && string3.length() != 0))) {
            NavDeepLink.Builder builder = new NavDeepLink.Builder();
            if (string != null) {
                String packageName = this.context.getPackageName();
                AbstractC3292y.h(packageName, "context.packageName");
                builder.setUriPattern(n.z(string, APPLICATION_ID_PLACEHOLDER, packageName, false, 4, null));
            }
            if (string2 != null && string2.length() != 0) {
                String packageName2 = this.context.getPackageName();
                AbstractC3292y.h(packageName2, "context.packageName");
                builder.setAction(n.z(string2, APPLICATION_ID_PLACEHOLDER, packageName2, false, 4, null));
            }
            if (string3 != null) {
                String packageName3 = this.context.getPackageName();
                AbstractC3292y.h(packageName3, "context.packageName");
                builder.setMimeType(n.z(string3, APPLICATION_ID_PLACEHOLDER, packageName3, false, 4, null));
            }
            navDestination.addDeepLink(builder.build());
            I i8 = I.f8786a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
    }

    @SuppressLint({"ResourceType"})
    public final NavGraph inflate(@NavigationRes int i8) {
        int next;
        Resources res = this.context.getResources();
        XmlResourceParser xml = res.getXml(i8);
        AbstractC3292y.h(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e8) {
                    throw new RuntimeException("Exception inflating " + res.getResourceName(i8) + " line " + xml.getLineNumber(), e8);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            AbstractC3292y.h(res, "res");
            AbstractC3292y.h(attrs, "attrs");
            NavDestination inflate = inflate(res, xml, attrs, i8);
            if (inflate instanceof NavGraph) {
                return (NavGraph) inflate;
            }
            throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
        }
        throw new XmlPullParserException("No start tag found");
    }

    private final NavDestination inflate(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i8) throws XmlPullParserException, IOException {
        int depth;
        NavigatorProvider navigatorProvider = this.navigatorProvider;
        String name = xmlResourceParser.getName();
        AbstractC3292y.h(name, "parser.name");
        NavDestination createDestination = navigatorProvider.getNavigator(name).createDestination();
        createDestination.onInflate(this.context, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (AbstractC3292y.d(TAG_ARGUMENT, name2)) {
                    inflateArgumentForDestination(resources, createDestination, attributeSet, i8);
                } else if (AbstractC3292y.d(TAG_DEEP_LINK, name2)) {
                    inflateDeepLink(resources, createDestination, attributeSet);
                } else if (AbstractC3292y.d(TAG_ACTION, name2)) {
                    inflateAction(resources, createDestination, attributeSet, xmlResourceParser, i8);
                } else if (AbstractC3292y.d(TAG_INCLUDE, name2) && (createDestination instanceof NavGraph)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, R.styleable.NavInclude);
                    AbstractC3292y.h(obtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((NavGraph) createDestination).addDestination(inflate(obtainAttributes.getResourceId(R.styleable.NavInclude_graph, 0)));
                    I i9 = I.f8786a;
                    obtainAttributes.recycle();
                } else if (createDestination instanceof NavGraph) {
                    ((NavGraph) createDestination).addDestination(inflate(resources, xmlResourceParser, attributeSet, i8));
                }
            }
        }
        return createDestination;
    }
}
