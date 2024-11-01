package androidx.navigation;

import Q5.I;
import R5.AbstractC1435t;
import R5.C1427k;
import R5.Q;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavDeepLinkRequest;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k6.AbstractC3258j;
import k6.InterfaceC3255g;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Z;
import l6.n;

/* loaded from: classes3.dex */
public class NavDestination {
    public static final Companion Companion = new Companion(null);
    private static final Map<String, Class<?>> classes = new LinkedHashMap();
    private Map<String, NavArgument> _arguments;
    private final SparseArrayCompat<NavAction> actions;
    private final List<NavDeepLink> deepLinks;
    private int id;
    private String idName;
    private CharSequence label;
    private final String navigatorName;
    private NavGraph parent;
    private String route;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface ClassType {
        Class<?> value();
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getHierarchy$annotations(NavDestination navDestination) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final String createRoute(String str) {
            if (str != null) {
                return "android-app://androidx.navigation/" + str;
            }
            return "";
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final String getDisplayName(Context context, int i8) {
            String valueOf;
            AbstractC3292y.i(context, "context");
            if (i8 <= 16777215) {
                return String.valueOf(i8);
            }
            try {
                valueOf = context.getResources().getResourceName(i8);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i8);
            }
            AbstractC3292y.h(valueOf, "try {\n                co….toString()\n            }");
            return valueOf;
        }

        public final InterfaceC3255g getHierarchy(NavDestination navDestination) {
            AbstractC3292y.i(navDestination, "<this>");
            return AbstractC3258j.h(navDestination, NavDestination$Companion$hierarchy$1.INSTANCE);
        }

        protected final <C> Class<? extends C> parseClassFromName(Context context, String name, Class<? extends C> expectedClassType) {
            String str;
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(name, "name");
            AbstractC3292y.i(expectedClassType, "expectedClassType");
            if (name.charAt(0) == '.') {
                str = context.getPackageName() + name;
            } else {
                str = name;
            }
            Class<? extends C> cls = (Class) NavDestination.classes.get(str);
            if (cls == null) {
                try {
                    cls = (Class<? extends C>) Class.forName(str, true, context.getClassLoader());
                    NavDestination.classes.put(name, cls);
                } catch (ClassNotFoundException e8) {
                    throw new IllegalArgumentException(e8);
                }
            }
            AbstractC3292y.f(cls);
            if (expectedClassType.isAssignableFrom(cls)) {
                return cls;
            }
            throw new IllegalArgumentException((str + " must be a subclass of " + expectedClassType).toString());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final <C> Class<? extends C> parseClassFromNameInternal(Context context, String name, Class<? extends C> expectedClassType) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(name, "name");
            AbstractC3292y.i(expectedClassType, "expectedClassType");
            return NavDestination.parseClassFromName(context, name, expectedClassType);
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {
        private final NavDestination destination;
        private final boolean hasMatchingAction;
        private final boolean isExactDeepLink;
        private final Bundle matchingArgs;
        private final int matchingPathSegments;
        private final int mimeTypeMatchLevel;

        public DeepLinkMatch(NavDestination destination, Bundle bundle, boolean z8, int i8, boolean z9, int i9) {
            AbstractC3292y.i(destination, "destination");
            this.destination = destination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z8;
            this.matchingPathSegments = i8;
            this.hasMatchingAction = z9;
            this.mimeTypeMatchLevel = i9;
        }

        public final NavDestination getDestination() {
            return this.destination;
        }

        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }

        public final boolean hasMatchingArgs(Bundle bundle) {
            Bundle bundle2;
            NavType<Object> navType;
            Object obj;
            if (bundle == null || (bundle2 = this.matchingArgs) == null) {
                return false;
            }
            Set<String> keySet = bundle2.keySet();
            AbstractC3292y.h(keySet, "matchingArgs.keySet()");
            for (String key : keySet) {
                if (!bundle.containsKey(key)) {
                    return false;
                }
                NavArgument navArgument = (NavArgument) this.destination._arguments.get(key);
                Object obj2 = null;
                if (navArgument != null) {
                    navType = navArgument.getType();
                } else {
                    navType = null;
                }
                if (navType != null) {
                    Bundle bundle3 = this.matchingArgs;
                    AbstractC3292y.h(key, "key");
                    obj = navType.get(bundle3, key);
                } else {
                    obj = null;
                }
                if (navType != null) {
                    AbstractC3292y.h(key, "key");
                    obj2 = navType.get(bundle, key);
                }
                if (!AbstractC3292y.d(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.lang.Comparable
        public int compareTo(DeepLinkMatch other) {
            AbstractC3292y.i(other, "other");
            boolean z8 = this.isExactDeepLink;
            if (z8 && !other.isExactDeepLink) {
                return 1;
            }
            if (!z8 && other.isExactDeepLink) {
                return -1;
            }
            int i8 = this.matchingPathSegments - other.matchingPathSegments;
            if (i8 > 0) {
                return 1;
            }
            if (i8 < 0) {
                return -1;
            }
            Bundle bundle = this.matchingArgs;
            if (bundle != null && other.matchingArgs == null) {
                return 1;
            }
            if (bundle == null && other.matchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.matchingArgs;
                AbstractC3292y.f(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z9 = this.hasMatchingAction;
            if (z9 && !other.hasMatchingAction) {
                return 1;
            }
            if (z9 || !other.hasMatchingAction) {
                return this.mimeTypeMatchLevel - other.mimeTypeMatchLevel;
            }
            return -1;
        }
    }

    public NavDestination(String navigatorName) {
        AbstractC3292y.i(navigatorName, "navigatorName");
        this.navigatorName = navigatorName;
        this.deepLinks = new ArrayList();
        this.actions = new SparseArrayCompat<>();
        this._arguments = new LinkedHashMap();
    }

    public static /* synthetic */ int[] buildDeepLinkIds$default(NavDestination navDestination, NavDestination navDestination2, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                navDestination2 = null;
            }
            return navDestination.buildDeepLinkIds(navDestination2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String getDisplayName(Context context, int i8) {
        return Companion.getDisplayName(context, i8);
    }

    public static final InterfaceC3255g getHierarchy(NavDestination navDestination) {
        return Companion.getHierarchy(navDestination);
    }

    private final boolean hasRequiredArguments(NavDeepLink navDeepLink, Uri uri, Map<String, NavArgument> map) {
        return NavArgumentKt.missingRequiredArguments(map, new NavDestination$hasRequiredArguments$missingRequiredArguments$1(navDeepLink.getMatchingPathAndQueryArgs$navigation_common_release(uri, map))).isEmpty();
    }

    protected static final <C> Class<? extends C> parseClassFromName(Context context, String str, Class<? extends C> cls) {
        return Companion.parseClassFromName(context, str, cls);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <C> Class<? extends C> parseClassFromNameInternal(Context context, String str, Class<? extends C> cls) {
        return Companion.parseClassFromNameInternal(context, str, cls);
    }

    public final void addArgument(String argumentName, NavArgument argument) {
        AbstractC3292y.i(argumentName, "argumentName");
        AbstractC3292y.i(argument, "argument");
        this._arguments.put(argumentName, argument);
    }

    public final void addDeepLink(String uriPattern) {
        AbstractC3292y.i(uriPattern, "uriPattern");
        addDeepLink(new NavDeepLink.Builder().setUriPattern(uriPattern).build());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Bundle addInDefaultArgs(Bundle bundle) {
        Map<String, NavArgument> map;
        if (bundle == null && ((map = this._arguments) == null || map.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, NavArgument> entry : this._arguments.entrySet()) {
            entry.getValue().putDefaultValue(entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry<String, NavArgument> entry2 : this._arguments.entrySet()) {
                String key = entry2.getKey();
                NavArgument value = entry2.getValue();
                if (!value.verify(key, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument bundle. " + value.getType().getName() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int[] buildDeepLinkIds() {
        return buildDeepLinkIds$default(this, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto Lba
            boolean r2 = r9 instanceof androidx.navigation.NavDestination
            if (r2 != 0) goto Ld
            goto Lba
        Ld:
            java.util.List<androidx.navigation.NavDeepLink> r2 = r8.deepLinks
            androidx.navigation.NavDestination r9 = (androidx.navigation.NavDestination) r9
            java.util.List<androidx.navigation.NavDeepLink> r3 = r9.deepLinks
            boolean r2 = kotlin.jvm.internal.AbstractC3292y.d(r2, r3)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r8.actions
            int r3 = r3.size()
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r4 = r9.actions
            int r4 = r4.size()
            if (r3 != r4) goto L58
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r8.actions
            R5.N r3 = androidx.collection.SparseArrayKt.keyIterator(r3)
            k6.g r3 = k6.AbstractC3258j.c(r3)
            java.util.Iterator r3 = r3.iterator()
        L33:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L56
            java.lang.Object r4 = r3.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r5 = r8.actions
            java.lang.Object r5 = r5.get(r4)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r6 = r9.actions
            java.lang.Object r4 = r6.get(r4)
            boolean r4 = kotlin.jvm.internal.AbstractC3292y.d(r5, r4)
            if (r4 != 0) goto L33
            goto L58
        L56:
            r3 = 1
            goto L59
        L58:
            r3 = 0
        L59:
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r4 = r8._arguments
            int r4 = r4.size()
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r5 = r9._arguments
            int r5 = r5.size()
            if (r4 != r5) goto La0
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r4 = r8._arguments
            k6.g r4 = R5.Q.C(r4)
            java.util.Iterator r4 = r4.iterator()
        L71:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r6 = r9._arguments
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto La0
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r6 = r9._arguments
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.AbstractC3292y.d(r6, r5)
            if (r5 == 0) goto La0
            goto L71
        L9e:
            r4 = 1
            goto La1
        La0:
            r4 = 0
        La1:
            int r5 = r8.id
            int r6 = r9.id
            if (r5 != r6) goto Lb8
            java.lang.String r5 = r8.route
            java.lang.String r9 = r9.route
            boolean r9 = kotlin.jvm.internal.AbstractC3292y.d(r5, r9)
            if (r9 == 0) goto Lb8
            if (r2 == 0) goto Lb8
            if (r3 == 0) goto Lb8
            if (r4 == 0) goto Lb8
            goto Lb9
        Lb8:
            r0 = 0
        Lb9:
            return r0
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.equals(java.lang.Object):boolean");
    }

    public final String fillInLabel(Context context, Bundle bundle) {
        NavType<Object> navType;
        NavArgument navArgument;
        AbstractC3292y.i(context, "context");
        CharSequence charSequence = this.label;
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (bundle != null && bundle.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, "");
                if (group != null && (navArgument = this._arguments.get(group)) != null) {
                    navType = navArgument.getType();
                } else {
                    navType = null;
                }
                if (AbstractC3292y.d(navType, NavType.ReferenceType)) {
                    String string = context.getString(bundle.getInt(group));
                    AbstractC3292y.h(string, "context.getString(bundle.getInt(argName))");
                    stringBuffer.append(string);
                } else {
                    stringBuffer.append(bundle.getString(group));
                }
            } else {
                throw new IllegalArgumentException("Could not find \"" + group + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + '\"');
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public final NavAction getAction(@IdRes int i8) {
        NavAction navAction;
        if (this.actions.isEmpty()) {
            navAction = null;
        } else {
            navAction = this.actions.get(i8);
        }
        if (navAction == null) {
            NavGraph navGraph = this.parent;
            if (navGraph == null) {
                return null;
            }
            return navGraph.getAction(i8);
        }
        return navAction;
    }

    public final Map<String, NavArgument> getArguments() {
        return Q.w(this._arguments);
    }

    @IdRes
    public final int getId() {
        return this.id;
    }

    public final CharSequence getLabel() {
        return this.label;
    }

    public final String getNavigatorName() {
        return this.navigatorName;
    }

    public final NavGraph getParent() {
        return this.parent;
    }

    public final String getRoute() {
        return this.route;
    }

    public boolean hasDeepLink(Uri deepLink) {
        AbstractC3292y.i(deepLink, "deepLink");
        return hasDeepLink(new NavDeepLinkRequest(deepLink, null, null));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean hasRoute(String route, Bundle bundle) {
        NavDestination navDestination;
        AbstractC3292y.i(route, "route");
        if (AbstractC3292y.d(this.route, route)) {
            return true;
        }
        DeepLinkMatch matchDeepLink = matchDeepLink(route);
        if (matchDeepLink != null) {
            navDestination = matchDeepLink.getDestination();
        } else {
            navDestination = null;
        }
        if (!AbstractC3292y.d(this, navDestination)) {
            return false;
        }
        return matchDeepLink.hasMatchingArgs(bundle);
    }

    public int hashCode() {
        int i8;
        int i9;
        int i10;
        Set<String> keySet;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.id * 31;
        String str = this.route;
        if (str != null) {
            i8 = str.hashCode();
        } else {
            i8 = 0;
        }
        int i16 = i15 + i8;
        for (NavDeepLink navDeepLink : this.deepLinks) {
            int i17 = i16 * 31;
            String uriPattern = navDeepLink.getUriPattern();
            if (uriPattern != null) {
                i12 = uriPattern.hashCode();
            } else {
                i12 = 0;
            }
            int i18 = (i17 + i12) * 31;
            String action = navDeepLink.getAction();
            if (action != null) {
                i13 = action.hashCode();
            } else {
                i13 = 0;
            }
            int i19 = (i18 + i13) * 31;
            String mimeType = navDeepLink.getMimeType();
            if (mimeType != null) {
                i14 = mimeType.hashCode();
            } else {
                i14 = 0;
            }
            i16 = i19 + i14;
        }
        Iterator valueIterator = SparseArrayKt.valueIterator(this.actions);
        while (valueIterator.hasNext()) {
            NavAction navAction = (NavAction) valueIterator.next();
            int destinationId = ((i16 * 31) + navAction.getDestinationId()) * 31;
            NavOptions navOptions = navAction.getNavOptions();
            if (navOptions != null) {
                i10 = navOptions.hashCode();
            } else {
                i10 = 0;
            }
            i16 = destinationId + i10;
            Bundle defaultArguments = navAction.getDefaultArguments();
            if (defaultArguments != null && (keySet = defaultArguments.keySet()) != null) {
                AbstractC3292y.h(keySet, "keySet()");
                for (String str2 : keySet) {
                    int i20 = i16 * 31;
                    Bundle defaultArguments2 = navAction.getDefaultArguments();
                    AbstractC3292y.f(defaultArguments2);
                    Object obj = defaultArguments2.get(str2);
                    if (obj != null) {
                        i11 = obj.hashCode();
                    } else {
                        i11 = 0;
                    }
                    i16 = i20 + i11;
                }
            }
        }
        for (String str3 : this._arguments.keySet()) {
            int hashCode = ((i16 * 31) + str3.hashCode()) * 31;
            NavArgument navArgument = this._arguments.get(str3);
            if (navArgument != null) {
                i9 = navArgument.hashCode();
            } else {
                i9 = 0;
            }
            i16 = hashCode + i9;
        }
        return i16;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final DeepLinkMatch matchDeepLink(String route) {
        AbstractC3292y.i(route, "route");
        NavDeepLinkRequest.Builder.Companion companion = NavDeepLinkRequest.Builder.Companion;
        Uri parse = Uri.parse(Companion.createRoute(route));
        AbstractC3292y.e(parse, "Uri.parse(this)");
        NavDeepLinkRequest build = companion.fromUri(parse).build();
        if (this instanceof NavGraph) {
            return ((NavGraph) this).matchDeepLinkExcludingChildren(build);
        }
        return matchDeepLink(build);
    }

    @CallSuper
    public void onInflate(Context context, AttributeSet attrs) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(attrs, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, androidx.navigation.common.R.styleable.Navigator);
        AbstractC3292y.h(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        setRoute(obtainAttributes.getString(androidx.navigation.common.R.styleable.Navigator_route));
        int i8 = androidx.navigation.common.R.styleable.Navigator_android_id;
        if (obtainAttributes.hasValue(i8)) {
            setId(obtainAttributes.getResourceId(i8, 0));
            this.idName = Companion.getDisplayName(context, this.id);
        }
        this.label = obtainAttributes.getText(androidx.navigation.common.R.styleable.Navigator_android_label);
        I i9 = I.f8786a;
        obtainAttributes.recycle();
    }

    public final void putAction(@IdRes int i8, @IdRes int i9) {
        putAction(i8, new NavAction(i9, null, null, 6, null));
    }

    public final void removeAction(@IdRes int i8) {
        this.actions.remove(i8);
    }

    public final void removeArgument(String argumentName) {
        AbstractC3292y.i(argumentName, "argumentName");
        this._arguments.remove(argumentName);
    }

    public final void setId(@IdRes int i8) {
        this.id = i8;
        this.idName = null;
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setParent(NavGraph navGraph) {
        this.parent = navGraph;
    }

    public final void setRoute(String str) {
        Object obj;
        if (str == null) {
            setId(0);
        } else if (!n.T(str)) {
            String createRoute = Companion.createRoute(str);
            setId(createRoute.hashCode());
            addDeepLink(createRoute);
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        List<NavDeepLink> list = this.deepLinks;
        List<NavDeepLink> list2 = list;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3292y.d(((NavDeepLink) obj).getUriPattern(), Companion.createRoute(this.route))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Z.a(list2).remove(obj);
        this.route = str;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean supportsActions() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.idName;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.id));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.route;
        if (str2 != null && !n.T(str2)) {
            sb.append(" route=");
            sb.append(this.route);
        }
        if (this.label != null) {
            sb.append(" label=");
            sb.append(this.label);
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "sb.toString()");
        return sb2;
    }

    public final void addDeepLink(NavDeepLink navDeepLink) {
        AbstractC3292y.i(navDeepLink, "navDeepLink");
        List<String> missingRequiredArguments = NavArgumentKt.missingRequiredArguments(this._arguments, new NavDestination$addDeepLink$missingRequiredArguments$1(navDeepLink));
        if (missingRequiredArguments.isEmpty()) {
            this.deepLinks.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.getUriPattern() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + missingRequiredArguments).toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int[] buildDeepLinkIds(NavDestination navDestination) {
        C1427k c1427k = new C1427k();
        NavDestination navDestination2 = this;
        while (true) {
            AbstractC3292y.f(navDestination2);
            NavGraph navGraph = navDestination2.parent;
            if ((navDestination != null ? navDestination.parent : null) != null) {
                NavGraph navGraph2 = navDestination.parent;
                AbstractC3292y.f(navGraph2);
                if (navGraph2.findNode(navDestination2.id) == navDestination2) {
                    c1427k.c(navDestination2);
                    break;
                }
            }
            if (navGraph == null || navGraph.getStartDestinationId() != navDestination2.id) {
                c1427k.c(navDestination2);
            }
            if (AbstractC3292y.d(navGraph, navDestination) || navGraph == null) {
                break;
            }
            navDestination2 = navGraph;
        }
        List W02 = AbstractC1435t.W0(c1427k);
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(W02, 10));
        Iterator it = W02.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((NavDestination) it.next()).id));
        }
        return AbstractC1435t.V0(arrayList);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String getDisplayName() {
        String str = this.idName;
        return str == null ? String.valueOf(this.id) : str;
    }

    public boolean hasDeepLink(NavDeepLinkRequest deepLinkRequest) {
        AbstractC3292y.i(deepLinkRequest, "deepLinkRequest");
        return matchDeepLink(deepLinkRequest) != null;
    }

    public final void putAction(@IdRes int i8, NavAction action) {
        AbstractC3292y.i(action, "action");
        if (supportsActions()) {
            if (i8 != 0) {
                this.actions.put(i8, action);
                return;
            }
            throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
        }
        throw new UnsupportedOperationException("Cannot add action " + i8 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavDestination(Navigator<? extends NavDestination> navigator) {
        this(NavigatorProvider.Companion.getNameForNavigator$navigation_common_release(navigator.getClass()));
        AbstractC3292y.i(navigator, "navigator");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DeepLinkMatch matchDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        AbstractC3292y.i(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        DeepLinkMatch deepLinkMatch = null;
        for (NavDeepLink navDeepLink : this.deepLinks) {
            Uri uri = navDeepLinkRequest.getUri();
            Bundle matchingArguments = uri != null ? navDeepLink.getMatchingArguments(uri, this._arguments) : null;
            int calculateMatchingPathSegments$navigation_common_release = navDeepLink.calculateMatchingPathSegments$navigation_common_release(uri);
            String action = navDeepLinkRequest.getAction();
            boolean z8 = action != null && AbstractC3292y.d(action, navDeepLink.getAction());
            String mimeType = navDeepLinkRequest.getMimeType();
            int mimeTypeMatchRating = mimeType != null ? navDeepLink.getMimeTypeMatchRating(mimeType) : -1;
            if (matchingArguments == null) {
                if (z8 || mimeTypeMatchRating > -1) {
                    if (hasRequiredArguments(navDeepLink, uri, this._arguments)) {
                    }
                }
            }
            DeepLinkMatch deepLinkMatch2 = new DeepLinkMatch(this, matchingArguments, navDeepLink.isExactDeepLink(), calculateMatchingPathSegments$navigation_common_release, z8, mimeTypeMatchRating);
            if (deepLinkMatch == null || deepLinkMatch2.compareTo(deepLinkMatch) > 0) {
                deepLinkMatch = deepLinkMatch2;
            }
        }
        return deepLinkMatch;
    }
}
