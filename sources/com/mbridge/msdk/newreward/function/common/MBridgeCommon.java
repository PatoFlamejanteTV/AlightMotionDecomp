package com.mbridge.msdk.newreward.function.common;

/* loaded from: classes4.dex */
public class MBridgeCommon {
    public static final int BIDDING_TYPE_HEADER_BIDDING = 1;
    public static final int BIDDING_TYPE_WATER_FALL = 0;
    public static final int DEFAULT_LOAD_TIMEOUT = 60000;
    public static final int DOWNLOAD_SCENE_LOAD = 0;
    public static final int DOWNLOAD_SCENE_SHOW = 1;
    public static final int LOAD_STATE_LOADING = 1;
    public static final int LOAD_STATE_LOAD_FINISH = 2;
    public static final int LOAD_STATE_UN_KNOWN = 0;

    /* loaded from: classes4.dex */
    public static class ADType {
        public static final int AD_TYPE_INTERSTITIAL_VIDEO = 287;
        public static final int AD_TYPE_NEW_INTERSTITIAL_VIDEO = 287;
        public static final int AD_TYPE_REWARD_VIDEO = 94;
    }

    /* loaded from: classes4.dex */
    public static class CampaignState {
        public static final int STATE_DELETE = 8;
        public static final int STATE_LOADING = 2;
        public static final int STATE_LOAD_FAILED_ADN_RETURN_ERROR = 402;
        public static final int STATE_LOAD_FAILED_ALREADY_INSTALL = 403;
        public static final int STATE_LOAD_FAILED_CAMPAIGN_REQUEST_ERROR = 401;
        public static final int STATE_LOAD_FAILED_EXCEPTION = 406;
        public static final int STATE_LOAD_FAILED_RESOURCE_DOWNLOAD_ERROR = 404;
        public static final int STATE_LOAD_FAILED_TIMEOUT = 405;
        public static final int STATE_LOAD_SUCCESS = 3;
        public static final int STATE_REQUEST_SUCCESS = 1;
        public static final int STATE_SHOWING = 5;
        public static final int STATE_SHOW_FAILED = 7;
        public static final int STATE_SHOW_SUCCESS = 6;
        public static final int STATE_UN_AVAILABLE = 0;
    }

    /* loaded from: classes4.dex */
    public static class Database {
        public static final String DATABASE_NAME = "mbridge_sdk_new.db";
        public static final int DATABASE_VERSION = 1;
    }

    /* loaded from: classes4.dex */
    public static class ResourceCheckRule {
        public static final int CHECK_RULE_BIG_TEMPLATE = 3;
        public static final int CHECK_RULE_END_CARD = 2;
        public static final int CHECK_RULE_TEMPLATE = 1;
        public static final int CHECK_RULE_VIDEO = 0;
    }

    /* loaded from: classes4.dex */
    public static class ResourceFrom {
        public static final int FROM_CACHE = 1;
        public static final int FROM_NETWORK = 2;
        public static final int FROM_RESUME_FROM_BREAK_POINT = 3;
        public static final int FROM_UN_KNOWN = 0;
    }

    /* loaded from: classes4.dex */
    public static class ResourceType {
        public static final int TYPE_END_SCREEN = 8;
        public static final int TYPE_IMAGE = 6;
        public static final int TYPE_MRAID = 5;
        public static final int TYPE_PAUSE = 7;
        public static final int TYPE_TEMPLATE_BIG = 3;
        public static final int TYPE_TEMPLATE_ENDCARD = 4;
        public static final int TYPE_TEMPLATE_VIDEO = 2;
        public static final int TYPE_VIDEO = 1;
    }

    /* loaded from: classes4.dex */
    public static class SettingConfig {
        public static final String KEY_SETTING_CONFIG_LOAD_CHECK_INTERVAL = "load_check_interval";
        public static final String KEY_SETTING_CONFIG_LOAD_CHECK_OPTIMIZED = "load_check_switch";
        public static final String KEY_SETTING_CONFIG_LOAD_TOKEN_VALIDITY_PERIOD = "load_check_token_validity_period";
        public static final String KEY_SETTING_CONFIG_RETRY_STRATEGY = "retry_strategy";
        public static final String KEY_SETTING_CONFIG_RETRY_STRATEGY_CAMPAIGN_REQUEST_INTERVAL = "campaign_request_interval";
        public static final String KEY_SETTING_CONFIG_RETRY_STRATEGY_CAMPAIGN_REQUEST_MAX = "campaign_request_max";
        public static final String KEY_SETTING_CONFIG_RETRY_STRATEGY_CAMPAIGN_REQUEST_TIMEOUT = "campaign_request_timeout";
        public static final String KEY_SETTING_CONFIG_RETRY_STRATEGY_CAMPAIGN_RETRY_TIMEOUT = "campaign_retry_timeout";
        public static final String KEY_SETTING_CONFIG_RETRY_STRATEGY_DOWNLOAD_RETRY_MAX = "download_retry_max";
    }

    /* loaded from: classes4.dex */
    public static class SharedPreference {
        public static final String KEY_CAMPAIGN_REQUEST_TIMEOUT = "campaign_request_timeout";
        public static final String KEY_LOADING_CAPACITY = "loading_capacity";
        public static final String KEY_VCN = "vcn_%s";
    }
}
