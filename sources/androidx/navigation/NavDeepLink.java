package androidx.navigation;

import Q5.I;
import Q5.InterfaceC1416k;
import Q5.l;
import Q5.o;
import Q5.r;
import Q5.x;
import R5.AbstractC1435t;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.j;
import l6.n;

/* loaded from: classes3.dex */
public final class NavDeepLink {
    private final String action;
    private final InterfaceC1416k fragArgs$delegate;
    private final InterfaceC1416k fragArgsAndRegex$delegate;
    private final InterfaceC1416k fragPattern$delegate;
    private final InterfaceC1416k fragRegex$delegate;
    private boolean isExactDeepLink;
    private final InterfaceC1416k isParameterizedQuery$delegate;
    private boolean isSingleQueryParamValueOnly;
    private final String mimeType;
    private final InterfaceC1416k mimeTypePattern$delegate;
    private String mimeTypeRegex;
    private final List<String> pathArgs;
    private final InterfaceC1416k pathPattern$delegate;
    private String pathRegex;
    private final InterfaceC1416k queryArgsMap$delegate;
    private final String uriPattern;
    private static final Companion Companion = new Companion(null);
    private static final Pattern SCHEME_PATTERN = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    private static final Pattern FILL_IN_PATTERN = Pattern.compile("\\{(.+?)\\}");

    /* loaded from: classes3.dex */
    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        private String action;
        private String mimeType;
        private String uriPattern;

        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public final Builder fromAction(String action) {
                AbstractC3292y.i(action, "action");
                if (action.length() > 0) {
                    Builder builder = new Builder();
                    builder.setAction(action);
                    return builder;
                }
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
            }

            public final Builder fromMimeType(String mimeType) {
                AbstractC3292y.i(mimeType, "mimeType");
                Builder builder = new Builder();
                builder.setMimeType(mimeType);
                return builder;
            }

            public final Builder fromUriPattern(String uriPattern) {
                AbstractC3292y.i(uriPattern, "uriPattern");
                Builder builder = new Builder();
                builder.setUriPattern(uriPattern);
                return builder;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder() {
        }

        public static final Builder fromAction(String str) {
            return Companion.fromAction(str);
        }

        public static final Builder fromMimeType(String str) {
            return Companion.fromMimeType(str);
        }

        public static final Builder fromUriPattern(String str) {
            return Companion.fromUriPattern(str);
        }

        public final NavDeepLink build() {
            return new NavDeepLink(this.uriPattern, this.action, this.mimeType);
        }

        public final Builder setAction(String action) {
            AbstractC3292y.i(action, "action");
            if (action.length() > 0) {
                this.action = action;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
        }

        public final Builder setMimeType(String mimeType) {
            AbstractC3292y.i(mimeType, "mimeType");
            this.mimeType = mimeType;
            return this;
        }

        public final Builder setUriPattern(String uriPattern) {
            AbstractC3292y.i(uriPattern, "uriPattern");
            this.uriPattern = uriPattern;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class MimeType implements Comparable<MimeType> {
        private String subType;
        private String type;

        public MimeType(String mimeType) {
            List m8;
            AbstractC3292y.i(mimeType, "mimeType");
            List i8 = new j("/").i(mimeType, 0);
            if (!i8.isEmpty()) {
                ListIterator listIterator = i8.listIterator(i8.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        m8 = AbstractC1435t.Q0(i8, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            m8 = AbstractC1435t.m();
            this.type = (String) m8.get(0);
            this.subType = (String) m8.get(1);
        }

        public final String getSubType() {
            return this.subType;
        }

        public final String getType() {
            return this.type;
        }

        public final void setSubType(String str) {
            AbstractC3292y.i(str, "<set-?>");
            this.subType = str;
        }

        public final void setType(String str) {
            AbstractC3292y.i(str, "<set-?>");
            this.type = str;
        }

        @Override // java.lang.Comparable
        public int compareTo(MimeType other) {
            AbstractC3292y.i(other, "other");
            int i8 = AbstractC3292y.d(this.type, other.type) ? 2 : 0;
            return AbstractC3292y.d(this.subType, other.subType) ? i8 + 1 : i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class ParamQuery {
        private final List<String> arguments = new ArrayList();
        private String paramRegex;

        public final void addArgumentName(String name) {
            AbstractC3292y.i(name, "name");
            this.arguments.add(name);
        }

        public final String getArgumentName(int i8) {
            return this.arguments.get(i8);
        }

        public final List<String> getArguments() {
            return this.arguments;
        }

        public final String getParamRegex() {
            return this.paramRegex;
        }

        public final void setParamRegex(String str) {
            this.paramRegex = str;
        }

        public final int size() {
            return this.arguments.size();
        }
    }

    public NavDeepLink(String str, String str2, String str3) {
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        this.pathArgs = new ArrayList();
        this.pathPattern$delegate = l.b(new NavDeepLink$pathPattern$2(this));
        this.isParameterizedQuery$delegate = l.b(new NavDeepLink$isParameterizedQuery$2(this));
        o oVar = o.f8805c;
        this.queryArgsMap$delegate = l.a(oVar, new NavDeepLink$queryArgsMap$2(this));
        this.fragArgsAndRegex$delegate = l.a(oVar, new NavDeepLink$fragArgsAndRegex$2(this));
        this.fragArgs$delegate = l.a(oVar, new NavDeepLink$fragArgs$2(this));
        this.fragRegex$delegate = l.a(oVar, new NavDeepLink$fragRegex$2(this));
        this.fragPattern$delegate = l.b(new NavDeepLink$fragPattern$2(this));
        this.mimeTypePattern$delegate = l.b(new NavDeepLink$mimeTypePattern$2(this));
        parsePath();
        parseMime();
    }

    private final void buildRegex(String str, List<String> list, StringBuilder sb) {
        Matcher matcher = FILL_IN_PATTERN.matcher(str);
        int i8 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            AbstractC3292y.g(group, "null cannot be cast to non-null type kotlin.String");
            list.add(group);
            if (matcher.start() > i8) {
                String substring = str.substring(i8, matcher.start());
                AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(substring));
            }
            sb.append("([^/]+?)");
            i8 = matcher.end();
        }
        if (i8 < str.length()) {
            String substring2 = str.substring(i8);
            AbstractC3292y.h(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(substring2));
        }
    }

    private final List<String> getFragArgs() {
        return (List) this.fragArgs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r getFragArgsAndRegex() {
        return (r) this.fragArgsAndRegex$delegate.getValue();
    }

    private final Pattern getFragPattern() {
        return (Pattern) this.fragPattern$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFragRegex() {
        return (String) this.fragRegex$delegate.getValue();
    }

    private final boolean getMatchingPathArguments(Matcher matcher, Bundle bundle, Map<String, NavArgument> map) {
        List<String> list = this.pathArgs;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
        int i8 = 0;
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1435t.w();
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i9));
            NavArgument navArgument = map.get(str);
            try {
                AbstractC3292y.h(value, "value");
                if (parseArgument(bundle, str, value, navArgument)) {
                    return false;
                }
                arrayList.add(I.f8786a);
                i8 = i9;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean getMatchingQueryArguments(Uri uri, Bundle bundle, Map<String, NavArgument> map) {
        String query;
        for (Map.Entry<String, ParamQuery> entry : getQueryArgsMap().entrySet()) {
            String key = entry.getKey();
            ParamQuery value = entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(key);
            if (this.isSingleQueryParamValueOnly && (query = uri.getQuery()) != null && !AbstractC3292y.d(query, uri.toString())) {
                queryParameters = AbstractC1435t.e(query);
            }
            if (!parseInputParams(queryParameters, value, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    private final void getMatchingUriFragment(String str, Bundle bundle, Map<String, NavArgument> map) {
        Matcher matcher;
        Pattern fragPattern = getFragPattern();
        if (fragPattern != null) {
            matcher = fragPattern.matcher(String.valueOf(str));
        } else {
            matcher = null;
        }
        if (matcher == null || !matcher.matches()) {
            return;
        }
        List<String> fragArgs = getFragArgs();
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(fragArgs, 10));
        int i8 = 0;
        for (Object obj : fragArgs) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1435t.w();
            }
            String str2 = (String) obj;
            String value = Uri.decode(matcher.group(i9));
            NavArgument navArgument = map.get(str2);
            try {
                AbstractC3292y.h(value, "value");
                if (parseArgument(bundle, str2, value, navArgument)) {
                    return;
                }
                arrayList.add(I.f8786a);
                i8 = i9;
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
    }

    private final Pattern getMimeTypePattern() {
        return (Pattern) this.mimeTypePattern$delegate.getValue();
    }

    private final Pattern getPathPattern() {
        return (Pattern) this.pathPattern$delegate.getValue();
    }

    private final Map<String, ParamQuery> getQueryArgsMap() {
        return (Map) this.queryArgsMap$delegate.getValue();
    }

    private final boolean isParameterizedQuery() {
        return ((Boolean) this.isParameterizedQuery$delegate.getValue()).booleanValue();
    }

    private final boolean matchAction(String str) {
        boolean z8;
        boolean z9;
        if (str == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        String str2 = this.action;
        if (str2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8 != z9 && (str == null || AbstractC3292y.d(str2, str))) {
            return true;
        }
        return false;
    }

    private final boolean matchMimeType(String str) {
        boolean z8;
        boolean z9;
        if (str == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.mimeType != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8 != z9) {
            if (str == null) {
                return true;
            }
            Pattern mimeTypePattern = getMimeTypePattern();
            AbstractC3292y.f(mimeTypePattern);
            if (mimeTypePattern.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private final boolean matchUri(Uri uri) {
        boolean z8;
        boolean z9;
        if (uri == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (getPathPattern() != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8 != z9) {
            if (uri == null) {
                return true;
            }
            Pattern pathPattern = getPathPattern();
            AbstractC3292y.f(pathPattern);
            if (pathPattern.matcher(uri.toString()).matches()) {
                return true;
            }
        }
        return false;
    }

    private final boolean parseArgument(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (navArgument != null) {
            navArgument.getType().parseAndPut(bundle, str, str2);
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }

    private final boolean parseArgumentForRepeatedParam(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (navArgument != null) {
            NavType<Object> type = navArgument.getType();
            type.parseAndPut(bundle, str, str2, type.get(bundle, str));
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r parseFragment() {
        String str = this.uriPattern;
        if (str != null && Uri.parse(str).getFragment() != null) {
            ArrayList arrayList = new ArrayList();
            String fragment = Uri.parse(this.uriPattern).getFragment();
            StringBuilder sb = new StringBuilder();
            AbstractC3292y.f(fragment);
            buildRegex(fragment, arrayList, sb);
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "fragRegex.toString()");
            return x.a(arrayList, sb2);
        }
        return null;
    }

    private final boolean parseInputParams(List<String> list, ParamQuery paramQuery, Bundle bundle, Map<String, NavArgument> map) {
        Matcher matcher;
        if (list != null) {
            for (String str : list) {
                String paramRegex = paramQuery.getParamRegex();
                if (paramRegex != null) {
                    matcher = Pattern.compile(paramRegex, 32).matcher(str);
                } else {
                    matcher = null;
                }
                if (matcher == null || !matcher.matches()) {
                    return false;
                }
                Bundle bundle2 = new Bundle();
                try {
                    List<String> arguments = paramQuery.getArguments();
                    ArrayList arrayList = new ArrayList(AbstractC1435t.x(arguments, 10));
                    int i8 = 0;
                    for (Object obj : arguments) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            AbstractC1435t.w();
                        }
                        String str2 = (String) obj;
                        String group = matcher.group(i9);
                        if (group == null) {
                            group = "";
                        } else {
                            AbstractC3292y.h(group, "argMatcher.group(index + 1) ?: \"\"");
                        }
                        NavArgument navArgument = map.get(str2);
                        if (parseArgumentForRepeatedParam(bundle, str2, group, navArgument)) {
                            if (!AbstractC3292y.d(group, '{' + str2 + '}') && parseArgument(bundle2, str2, group, navArgument)) {
                                return false;
                            }
                        }
                        arrayList.add(I.f8786a);
                        i8 = i9;
                    }
                    bundle.putAll(bundle2);
                } catch (IllegalArgumentException unused) {
                }
            }
            return true;
        }
        return true;
    }

    private final void parseMime() {
        if (this.mimeType == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.mimeType).matches()) {
            MimeType mimeType = new MimeType(this.mimeType);
            this.mimeTypeRegex = n.z("^(" + mimeType.getType() + "|[*]+)/(" + mimeType.getSubType() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
            return;
        }
        throw new IllegalArgumentException(("The given mimeType " + this.mimeType + " does not match to required \"type/subtype\" format").toString());
    }

    private final void parsePath() {
        if (this.uriPattern == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!SCHEME_PATTERN.matcher(this.uriPattern).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.uriPattern);
        matcher.find();
        boolean z8 = false;
        String substring = this.uriPattern.substring(0, matcher.start());
        AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        buildRegex(substring, this.pathArgs, sb);
        if (!n.G(sb, ".*", false, 2, null) && !n.G(sb, "([^/]+?)", false, 2, null)) {
            z8 = true;
        }
        this.isExactDeepLink = z8;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "uriRegex.toString()");
        this.pathRegex = n.z(sb2, ".*", "\\E.*\\Q", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, ParamQuery> parseQuery() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!isParameterizedQuery()) {
            return linkedHashMap;
        }
        Uri parse = Uri.parse(this.uriPattern);
        for (String paramName : parse.getQueryParameterNames()) {
            StringBuilder sb = new StringBuilder();
            List<String> queryParams = parse.getQueryParameters(paramName);
            if (queryParams.size() <= 1) {
                AbstractC3292y.h(queryParams, "queryParams");
                String queryParam = (String) AbstractC1435t.o0(queryParams);
                if (queryParam == null) {
                    this.isSingleQueryParamValueOnly = true;
                    queryParam = paramName;
                }
                Matcher matcher = FILL_IN_PATTERN.matcher(queryParam);
                ParamQuery paramQuery = new ParamQuery();
                int i8 = 0;
                while (matcher.find()) {
                    String group = matcher.group(1);
                    AbstractC3292y.g(group, "null cannot be cast to non-null type kotlin.String");
                    paramQuery.addArgumentName(group);
                    AbstractC3292y.h(queryParam, "queryParam");
                    String substring = queryParam.substring(i8, matcher.start());
                    AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(Pattern.quote(substring));
                    sb.append("(.+?)?");
                    i8 = matcher.end();
                }
                if (i8 < queryParam.length()) {
                    AbstractC3292y.h(queryParam, "queryParam");
                    String substring2 = queryParam.substring(i8);
                    AbstractC3292y.h(substring2, "this as java.lang.String).substring(startIndex)");
                    sb.append(Pattern.quote(substring2));
                }
                String sb2 = sb.toString();
                AbstractC3292y.h(sb2, "argRegex.toString()");
                paramQuery.setParamRegex(n.z(sb2, ".*", "\\E.*\\Q", false, 4, null));
                AbstractC3292y.h(paramName, "paramName");
                linkedHashMap.put(paramName, paramQuery);
            } else {
                throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + this.uriPattern + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
            }
        }
        return linkedHashMap;
    }

    public final int calculateMatchingPathSegments$navigation_common_release(Uri uri) {
        if (uri != null && this.uriPattern != null) {
            List<String> requestedPathSegments = uri.getPathSegments();
            List<String> uriPathSegments = Uri.parse(this.uriPattern).getPathSegments();
            AbstractC3292y.h(requestedPathSegments, "requestedPathSegments");
            AbstractC3292y.h(uriPathSegments, "uriPathSegments");
            return AbstractC1435t.s0(requestedPathSegments, uriPathSegments).size();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof NavDeepLink)) {
            return false;
        }
        NavDeepLink navDeepLink = (NavDeepLink) obj;
        if (!AbstractC3292y.d(this.uriPattern, navDeepLink.uriPattern) || !AbstractC3292y.d(this.action, navDeepLink.action) || !AbstractC3292y.d(this.mimeType, navDeepLink.mimeType)) {
            return false;
        }
        return true;
    }

    public final String getAction() {
        return this.action;
    }

    public final List<String> getArgumentsNames$navigation_common_release() {
        List<String> list = this.pathArgs;
        Collection<ParamQuery> values = getQueryArgsMap().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            AbstractC1435t.C(arrayList, ((ParamQuery) it.next()).getArguments());
        }
        return AbstractC1435t.G0(AbstractC1435t.G0(list, arrayList), getFragArgs());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Bundle getMatchingArguments(Uri deepLink, Map<String, NavArgument> arguments) {
        Matcher matcher;
        AbstractC3292y.i(deepLink, "deepLink");
        AbstractC3292y.i(arguments, "arguments");
        Pattern pathPattern = getPathPattern();
        if (pathPattern != null) {
            matcher = pathPattern.matcher(deepLink.toString());
        } else {
            matcher = null;
        }
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!getMatchingPathArguments(matcher, bundle, arguments)) {
            return null;
        }
        if (isParameterizedQuery() && !getMatchingQueryArguments(deepLink, bundle, arguments)) {
            return null;
        }
        getMatchingUriFragment(deepLink.getFragment(), bundle, arguments);
        if (!NavArgumentKt.missingRequiredArguments(arguments, new NavDeepLink$getMatchingArguments$missingRequiredArguments$1(bundle)).isEmpty()) {
            return null;
        }
        return bundle;
    }

    public final Bundle getMatchingPathAndQueryArgs$navigation_common_release(Uri uri, Map<String, NavArgument> arguments) {
        Matcher matcher;
        AbstractC3292y.i(arguments, "arguments");
        Bundle bundle = new Bundle();
        if (uri == null) {
            return bundle;
        }
        Pattern pathPattern = getPathPattern();
        if (pathPattern != null) {
            matcher = pathPattern.matcher(uri.toString());
        } else {
            matcher = null;
        }
        if (matcher == null) {
            return bundle;
        }
        if (!matcher.matches()) {
            return bundle;
        }
        getMatchingPathArguments(matcher, bundle, arguments);
        if (isParameterizedQuery()) {
            getMatchingQueryArguments(uri, bundle, arguments);
        }
        return bundle;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMimeTypeMatchRating(String mimeType) {
        AbstractC3292y.i(mimeType, "mimeType");
        if (this.mimeType != null) {
            Pattern mimeTypePattern = getMimeTypePattern();
            AbstractC3292y.f(mimeTypePattern);
            if (mimeTypePattern.matcher(mimeType).matches()) {
                return new MimeType(this.mimeType).compareTo(new MimeType(mimeType));
            }
        }
        return -1;
    }

    public final String getUriPattern() {
        return this.uriPattern;
    }

    public int hashCode() {
        int i8;
        int i9;
        String str = this.uriPattern;
        int i10 = 0;
        if (str != null) {
            i8 = str.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = i8 * 31;
        String str2 = this.action;
        if (str2 != null) {
            i9 = str2.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (i11 + i9) * 31;
        String str3 = this.mimeType;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return i12 + i10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isExactDeepLink() {
        return this.isExactDeepLink;
    }

    public final boolean matches$navigation_common_release(Uri uri) {
        AbstractC3292y.i(uri, "uri");
        return matches$navigation_common_release(new NavDeepLinkRequest(uri, null, null));
    }

    public final void setExactDeepLink$navigation_common_release(boolean z8) {
        this.isExactDeepLink = z8;
    }

    public final boolean matches$navigation_common_release(NavDeepLinkRequest deepLinkRequest) {
        AbstractC3292y.i(deepLinkRequest, "deepLinkRequest");
        if (matchUri(deepLinkRequest.getUri()) && matchAction(deepLinkRequest.getAction())) {
            return matchMimeType(deepLinkRequest.getMimeType());
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLink(String uri) {
        this(uri, null, null);
        AbstractC3292y.i(uri, "uri");
    }
}
