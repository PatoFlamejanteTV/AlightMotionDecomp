package com.mbridge.msdk.thrid.okhttp.internal.http;

import androidx.browser.trusted.sharing.ShareTarget;

/* loaded from: classes4.dex */
public final class HttpMethod {
    private HttpMethod() {
    }

    public static boolean invalidatesCache(String str) {
        if (!str.equals(ShareTarget.METHOD_POST) && !str.equals("PATCH") && !str.equals("PUT") && !str.equals("DELETE") && !str.equals("MOVE")) {
            return false;
        }
        return true;
    }

    public static boolean permitsRequestBody(String str) {
        if (!str.equals(ShareTarget.METHOD_GET) && !str.equals("HEAD")) {
            return true;
        }
        return false;
    }

    public static boolean redirectsToGet(String str) {
        return !str.equals("PROPFIND");
    }

    public static boolean redirectsWithBody(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean requiresRequestBody(String str) {
        if (!str.equals(ShareTarget.METHOD_POST) && !str.equals("PUT") && !str.equals("PATCH") && !str.equals("PROPPATCH") && !str.equals("REPORT")) {
            return false;
        }
        return true;
    }
}
