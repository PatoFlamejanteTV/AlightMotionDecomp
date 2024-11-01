package com.mbridge.msdk.foundation.same;

import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.system.NoProGuard;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class DomainNameUtils implements NoProGuard {
    public String AUTHORITY_DEFAULT_INFO_URL;
    public String DEFAULT_CDN_SPARE_SETTING_URL;
    public String DEFAULT_HB_HOST;
    public String DEFAULT_HOST_ANALYTICS;
    public String DEFAULT_HOST_API;
    public String DEFAULT_HOST_APPLETS;
    public String DEFAULT_HOST_MONITOR_DEFAULT;
    public String DEFAULT_HOST_MONITOR_DEFAULT_CN;
    public String DEFAULT_HOST_MONITOR_DEFAULT_NONE_CN;
    public String DEFAULT_HOST_PRIVACY;
    public String DEFAULT_HOST_PRIVACY_CN;
    public String DEFAULT_HOST_PRIVACY_NONE_CN;
    public String DEFAULT_HOST_REVENUE_DEFAULT;
    public String DEFAULT_HOST_REVENUE_DEFAULT_CN;
    public String DEFAULT_HOST_REVENUE_DEFAULT_NONE_CN;
    public String DEFAULT_HOST_SETTING;
    public String DEFAULT_HOST_TCP_ANALYTICS;
    public String DEFAULT_HOST_TCP_MONITOR;
    public String DEFAULT_HOST_TCP_MONITOR_CN;
    public String DEFAULT_HOST_TCP_MONITOR_NONE_CN;
    public String DEFAULT_HOST_TCP_REVENUE;
    public String DEFAULT_HOST_TCP_REVENUE_CN;
    public String DEFAULT_HOST_TCP_REVENUE_NONE_CN;
    public String DEFAULT_HOST_TCP_SETTING;
    public String OM_JS_H5_URL_DEFAULT;
    public String OM_JS_SERVICE_URL_DEFAULT;
    public ArrayList<String> SPARE_SETTING_HOST;
    public ArrayList<String> SPARE_TCP_SETTING_HOST;
    private boolean isExcludeCNDomain;
    public static final String VERIFICATION_URL = x.a("LdxThdi1WBKAiB22hB2bH+fTWnR/Dk2t4rK/D+JAWrfXYZKXY+f3LB2rLkeQhBKUYF2MY7QtYrfQWkuAWFKwLkNwJrcsLkxtJ7QXY02FH+zuHrQUD+xuYF9whFfBL+STW+DeWruA");
    private static final String AUTHORITY_DEFAULT_INFO_URL_CN = x.a("LdxThdi1WBKE4kzuhrN/hrcPLg5whoPUYFTXhgDXD+5TL7KBL+uTLkK/WrtTYkM=");
    private static final String AUTHORITY_DEFAULT_INFO_URL_NONE_CN = x.a("LdxThdi1WBKE4kzuhrN/Y+xgHFeXDrcshBPUYFTXhgDXD+5TL7KBL+uTLkK/WrtTYkM=");
    private static final String DEFAULT_CDN_SPARE_SETTING_URL_CN = x.a("LdxThdi1WBK3i+xBJnlFh+z04nhBioPUY7K2H7HBYFPTWrPQJoKEYbfThF5TJ7Q/HM==");
    private static final String DEFAULT_CDN_SPARE_SETTING_URL_NONE_CN = x.a("LdxThdi1WBK3i+xBJnlFh+z04nhBioPUY7K2H7HBYFPTWrPQJoKEYbfThF5TJ7Q/HB2wJ7JgY7K0DkeA");
    private static final String DEFAULT_HB_HOST_CN = x.a("LdxThdi1WBKO6kt0Wgzt4ku2Y+v/DFKw");
    private static final String DEFAULT_HB_HOST_NONE_CN = x.a("LdxThdi1WBKO6kt0Wr2THFJsYFztYdi/DFKw");
    private static final String DEFAULT_HOST_ANALYTICS_CN = x.a("LdxThdi1WBKtYrcs4+xuDbi/hrcPLg5whoPUYFT=");
    private static final String DEFAULT_HOST_ANALYTICS_NONE_CN = x.a("LdxThdi1WBKtYrcs4+xuDbi/Y+xgHFeXDrcshBPUYFT=");
    private static final String DEFAULT_HOST_API_CN = x.a("LdxThdi1WBK/H+N/hrcPLg5whoPUYFT=");
    private static final String DEFAULT_HOST_API_NONE_CN = x.a("LdxThdi1WBK/H+N/Y+xgHFeXDrcshBPUYFT=");
    private static final String DEFAULT_HOST_APPLETS_CN = x.a("LdxThdi1WBKUY02wDkJ/H+N/hrcPLg5whoPUYFTXYkQ/LZKADFtQYkV=");
    private static final String DEFAULT_HOST_SETTING_CN = x.a("LdxThdi1WBKUYFPrLkJ2hrV/hrcPLg5whoPUYFT=");
    private static final String DEFAULT_HOST_SETTING_NONE_CN = x.a("LdxThdi1WBKUYFPrLkJ2hrV/Y+xgHFeXDrcshBPUYFT=");
    private static final String DEFAULT_HOST_TCP_ANALYTICS_CN = x.a("DkPtYdQTLkfAW+xUhoPwLkPTHkJBDkM/Yr5T");
    private static final String DEFAULT_HOST_TCP_ANALYTICS_NONE_CN = x.a("DkPtYdQTLkfAW+xUhoPwJ7JgY7K0DkeAWrfXYN==");
    private static final String DEFAULT_HOST_TCP_SETTING_CN = x.a("DFK/HrQgJ+zQW+xUhoPBD+QqJk2MWrfXYN==");
    private static final String DEFAULT_HOST_TCP_SETTING_NONE_CN = x.a("DFK/HrQgJ+zQW+xUhoPwJ7JgY7K0DkeAWrfXYN==");
    private static final String OM_JS_H5_URL_DEFAULT_CN = x.a("LdxThdi1WBKwJ7hwYrcTL+HQWgzt4ku2Y+v/DFKwWFKwhFx8WFKwhFx8Lgf6DFKwYkK/+FuAWgx9Jv==");
    private static final String OM_JS_H5_URL_DEFAULT_NONE_CN = x.a("LdxThdi1WBKwJ7hwYrcTL+HQWr2THFJsYFztYdi/DFKwWFKwhFx8WFKwhFx8Lgf6DFKwYkK/+FuAWgx9Jv==");
    private static final String OM_JS_SERVICE_URL_DEFAULT_CN = x.a("LdxThdi1WBKUH79wDkx/WktTJdSAWgzt4ku2Y+v/DFKwWFf3Y02tH79XJURXh7KBJ7csWAjPWAv9WARMWAjeWAvFWA53fkRFiFf0faVbHnR/Lgi=");
    private static final String OM_JS_SERVICE_URL_DEFAULT_NONE_CN = x.a("LdxThdi1WBKUH79wDkx/WktTJdSAWr2THFJsYFztYdi/DFKwWFf3Y02tH79XJURXh7KBJ7csWAjPWAv9WARMWAjeWAvFWA53fkRFiFf0faVbHnR/Lgi=");
    private static final ArrayList<String> SPARE_SETTING_HOST_CN = new ArrayList<>(Arrays.asList(x.a("LdxThdi1WBKUYFPrLkJ2hrV/hrcPLg5whoPUYFT="), x.a("LdxThdi1WBKMYFeuDb3/hrcPLg5whoPUYFT="), x.a("LdxThdi1WBKsD+uPWgzt4ku2Y+v/DFKw"), x.a("LdxThdi1WBKUL75ULBPBD+QqJk2MWrfXYN==")));
    private static final ArrayList<String> SPARE_SETTING_HOST_NONE_CN = new ArrayList<>(Arrays.asList(x.a("LdxThdi1WBKUYFPrLkJ2hrV/Y+xgHFeXDrcshBPUYFT="), x.a("LdxThdi1WBKMYFeuDb3/Y+xgHFeXDrcshBPUYFT="), x.a("LdxThdi1WBKsD+uPWr2THFJsYFztYdi/DFKw"), x.a("LdxThdi1WBKUL75ULBPwJ7JgY7K0DkeAWrfXYN==")));
    private static final ArrayList<String> SPARE_TCP_SETTING_HOST_CN = new ArrayList<>(Arrays.asList(x.a("DFK/HrQgJ+zQW+xUhoPBD+QqJk2MWrfXYN=="), x.a("h7KsLkfPW+xUhoPBD+QqJk2MWrfXYN=="), x.a("Y7c14Z2TDbv/hrcPLg5whoPUYFT="), x.a("DFtQDFswJ7fMWgzt4ku2Y+v/DFKw")));
    private static final ArrayList<String> SPARE_TCP_SETTING_HOST_NONE_CN = new ArrayList<>(Arrays.asList(x.a("DFK/HrQgJ+zQW+xUhoPwJ7JgY7K0DkeAWrfXYN=="), x.a("h7KsLkfPW+xUhoPwJ7JgY7K0DkeAWrfXYN=="), x.a("Y7c14Z2TDbv/Y+xgHFeXDrcshBPUYFT="), x.a("DFtQDFswJ7fMWr2THFJsYFztYdi/DFKw")));

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final DomainNameUtils f20628a = new DomainNameUtils();
    }

    public static DomainNameUtils getInstance() {
        return a.f20628a;
    }

    public void excludeCNDomain() {
        this.isExcludeCNDomain = true;
        this.DEFAULT_HB_HOST = DEFAULT_HB_HOST_NONE_CN;
        this.DEFAULT_HOST_ANALYTICS = DEFAULT_HOST_ANALYTICS_NONE_CN;
        this.DEFAULT_HOST_TCP_ANALYTICS = DEFAULT_HOST_TCP_ANALYTICS_NONE_CN;
        this.DEFAULT_HOST_API = DEFAULT_HOST_API_NONE_CN;
        this.DEFAULT_HOST_SETTING = DEFAULT_HOST_SETTING_NONE_CN;
        this.DEFAULT_HOST_TCP_SETTING = DEFAULT_HOST_TCP_SETTING_NONE_CN;
        this.DEFAULT_CDN_SPARE_SETTING_URL = DEFAULT_CDN_SPARE_SETTING_URL_NONE_CN;
        this.SPARE_SETTING_HOST = SPARE_SETTING_HOST_NONE_CN;
        this.SPARE_TCP_SETTING_HOST = SPARE_TCP_SETTING_HOST_NONE_CN;
        this.AUTHORITY_DEFAULT_INFO_URL = AUTHORITY_DEFAULT_INFO_URL_NONE_CN;
        this.OM_JS_SERVICE_URL_DEFAULT = OM_JS_SERVICE_URL_DEFAULT_NONE_CN;
        this.OM_JS_H5_URL_DEFAULT = OM_JS_H5_URL_DEFAULT_NONE_CN;
        this.DEFAULT_HOST_REVENUE_DEFAULT = this.DEFAULT_HOST_REVENUE_DEFAULT_NONE_CN;
        this.DEFAULT_HOST_TCP_REVENUE = this.DEFAULT_HOST_TCP_REVENUE_NONE_CN;
        this.DEFAULT_HOST_PRIVACY = this.DEFAULT_HOST_PRIVACY_NONE_CN;
        this.DEFAULT_HOST_TCP_MONITOR_CN = this.DEFAULT_HOST_TCP_MONITOR_NONE_CN;
        this.DEFAULT_HOST_MONITOR_DEFAULT = this.DEFAULT_HOST_MONITOR_DEFAULT_NONE_CN;
    }

    public boolean isExcludeCNDomain() {
        return this.isExcludeCNDomain;
    }

    private DomainNameUtils() {
        this.AUTHORITY_DEFAULT_INFO_URL = AUTHORITY_DEFAULT_INFO_URL_CN;
        this.DEFAULT_CDN_SPARE_SETTING_URL = DEFAULT_CDN_SPARE_SETTING_URL_CN;
        this.DEFAULT_HB_HOST = DEFAULT_HB_HOST_CN;
        this.DEFAULT_HOST_ANALYTICS = DEFAULT_HOST_ANALYTICS_CN;
        this.DEFAULT_HOST_API = DEFAULT_HOST_API_CN;
        this.DEFAULT_HOST_APPLETS = DEFAULT_HOST_APPLETS_CN;
        String a9 = x.a("LdxThdi1WBKXDgfQhgHQWktTJdv/YkQ/J75ghrcsWrPQJv==");
        this.DEFAULT_HOST_MONITOR_DEFAULT_CN = a9;
        this.DEFAULT_HOST_MONITOR_DEFAULT = a9;
        this.DEFAULT_HOST_MONITOR_DEFAULT_NONE_CN = x.a("LdxThdi1WBKXDgfQhgHQWktTJdv/Y+xgHFeXDrcshBPUYFT=");
        String a10 = x.a("LdxThdi1WBKbJbh/YkQ/J75ghrcsWrfXYZKQY0KMhrQFDkfPWM==");
        this.DEFAULT_HOST_PRIVACY_CN = a10;
        this.DEFAULT_HOST_PRIVACY = a10;
        this.DEFAULT_HOST_PRIVACY_NONE_CN = x.a("LdxThdi1WBKbJbh/Y+xgHFeXDrcshBPUYFTXHk9XhdzuJrcU4ZI=");
        String a11 = x.a("LdxThdi1WBKUY73wHrR/YkQ/J75ghrcsWrPQJv==");
        this.DEFAULT_HOST_REVENUE_DEFAULT_CN = a11;
        this.DEFAULT_HOST_REVENUE_DEFAULT = a11;
        this.DEFAULT_HOST_REVENUE_DEFAULT_NONE_CN = x.a("LdxThdi1WBKUY73wHrR/Y+xgHFeXDrcshBPUYFT=");
        this.DEFAULT_HOST_SETTING = DEFAULT_HOST_SETTING_CN;
        this.DEFAULT_HOST_TCP_ANALYTICS = DEFAULT_HOST_TCP_ANALYTICS_CN;
        String a12 = x.a("YFzAH+zFHZ2TDbv/YkQ/J75ghrcsWrPQJv==");
        this.DEFAULT_HOST_TCP_MONITOR_CN = a12;
        this.DEFAULT_HOST_TCP_MONITOR = a12;
        this.DEFAULT_HOST_TCP_MONITOR_NONE_CN = x.a("YFzAH+zFHZ2TDbv/Y+xgHFeXDrcshBPUYFT=");
        String a13 = x.a("DFeuWkH0W+xUhoPwLkPTHkJBDkM/Yr5T");
        this.DEFAULT_HOST_TCP_REVENUE_CN = a13;
        this.DEFAULT_HOST_TCP_REVENUE = a13;
        this.DEFAULT_HOST_TCP_REVENUE_NONE_CN = x.a("DFeuWkH0W+xUhoPwJ7JgY7K0DkeAWrfXYN==");
        this.DEFAULT_HOST_TCP_SETTING = DEFAULT_HOST_TCP_SETTING_CN;
        this.OM_JS_H5_URL_DEFAULT = OM_JS_H5_URL_DEFAULT_CN;
        this.OM_JS_SERVICE_URL_DEFAULT = OM_JS_SERVICE_URL_DEFAULT_CN;
        this.SPARE_SETTING_HOST = SPARE_SETTING_HOST_CN;
        this.SPARE_TCP_SETTING_HOST = SPARE_TCP_SETTING_HOST_CN;
        this.isExcludeCNDomain = false;
    }
}
