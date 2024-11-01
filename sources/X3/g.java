package X3;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: i2, reason: collision with root package name */
    private static final /* synthetic */ g[] f11128i2;

    /* renamed from: j2, reason: collision with root package name */
    private static final /* synthetic */ W5.a f11131j2;

    /* renamed from: a, reason: collision with root package name */
    private final String f11175a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f11105b = new g("PARAM_PLATFORM", 0, "C001");

    /* renamed from: c, reason: collision with root package name */
    public static final g f11108c = new g("PARAM_DEVICE_MODEL", 1, "C002");

    /* renamed from: d, reason: collision with root package name */
    public static final g f11111d = new g("PARAM_OS_NAME", 2, "C003");

    /* renamed from: e, reason: collision with root package name */
    public static final g f11114e = new g("PARAM_OS_VERSION", 3, "C004");

    /* renamed from: f, reason: collision with root package name */
    public static final g f11117f = new g("PARAM_LOCALE", 4, "C005");

    /* renamed from: g, reason: collision with root package name */
    public static final g f11120g = new g("PARAM_TIME_ZONE", 5, "C006");

    /* renamed from: h, reason: collision with root package name */
    public static final g f11123h = new g("PARAM_HARDWARE_ID", 6, "C007");

    /* renamed from: i, reason: collision with root package name */
    public static final g f11126i = new g("PARAM_SCREEN_RESOLUTION", 7, "C008");

    /* renamed from: j, reason: collision with root package name */
    public static final g f11129j = new g("PARAM_DEVICE_NAME", 8, "C009");

    /* renamed from: k, reason: collision with root package name */
    public static final g f11132k = new g("PARAM_IP_ADDRESS", 9, "C010");

    /* renamed from: l, reason: collision with root package name */
    public static final g f11134l = new g("PARAM_LATITUDE", 10, "C011");

    /* renamed from: m, reason: collision with root package name */
    public static final g f11136m = new g("PARAM_LONGITUDE", 11, "C012");

    /* renamed from: n, reason: collision with root package name */
    public static final g f11138n = new g("PARAM_TELE_DEVICE_ID", 12, "A001");

    /* renamed from: o, reason: collision with root package name */
    public static final g f11140o = new g("PARAM_TELE_SUBSCRIBER_ID", 13, "A002");

    /* renamed from: p, reason: collision with root package name */
    public static final g f11142p = new g("PARAM_TELE_IMEI_SV", 14, "A003");

    /* renamed from: q, reason: collision with root package name */
    public static final g f11145q = new g("PARAM_TELE_GROUP_IDENTIFIER_L1", 15, "A004");

    /* renamed from: r, reason: collision with root package name */
    public static final g f11148r = new g("PARAM_TELE_LINE1_NUMBER", 16, "A005");

    /* renamed from: s, reason: collision with root package name */
    public static final g f11151s = new g("PARAM_TELE_MMS_UA_PROFILE_URL", 17, "A006");

    /* renamed from: t, reason: collision with root package name */
    public static final g f11154t = new g("PARAM_TELE_MMS_USER_AGENT", 18, "A007");

    /* renamed from: u, reason: collision with root package name */
    public static final g f11157u = new g("PARAM_TELE_NETWORK_COUNTRY_ISO", 19, "A008");

    /* renamed from: v, reason: collision with root package name */
    public static final g f11160v = new g("PARAM_TELE_NETWORK_OPERATOR", 20, "A009");

    /* renamed from: w, reason: collision with root package name */
    public static final g f11163w = new g("PARAM_TELE_NETWORK_OPERATOR_NAME", 21, "A010");

    /* renamed from: x, reason: collision with root package name */
    public static final g f11166x = new g("PARAM_TELE_NETWORK_TYPE", 22, "A011");

    /* renamed from: y, reason: collision with root package name */
    public static final g f11169y = new g("PARAM_TELE_PHONE_COUNT", 23, "A012");

    /* renamed from: z, reason: collision with root package name */
    public static final g f11172z = new g("PARAM_TELE_PHONE_TYPE", 24, "A013");

    /* renamed from: A, reason: collision with root package name */
    public static final g f11025A = new g("PARAM_TELE_SIM_COUNTRY_ISO", 25, "A014");

    /* renamed from: B, reason: collision with root package name */
    public static final g f11028B = new g("PARAM_TELE_SIM_OPERATOR", 26, "A015");

    /* renamed from: C, reason: collision with root package name */
    public static final g f11031C = new g("PARAM_TELE_SIM_OPERATOR_NAME", 27, "A016");

    /* renamed from: D, reason: collision with root package name */
    public static final g f11034D = new g("PARAM_TELE_SIM_SERIAL_NUMBER", 28, "A017");

    /* renamed from: E, reason: collision with root package name */
    public static final g f11037E = new g("PARAM_TELE_SIM_STATE", 29, "A018");

    /* renamed from: F, reason: collision with root package name */
    public static final g f11040F = new g("PARAM_TELE_VOICE_MAIL_ALPHA_TAG", 30, "A019");

    /* renamed from: G, reason: collision with root package name */
    public static final g f11043G = new g("PARAM_TELE_VOICE_MAIL_NUMBER", 31, "A020");

    /* renamed from: H, reason: collision with root package name */
    public static final g f11046H = new g("PARAM_TELE_HAS_ICC_CARD", 32, "A021");

    /* renamed from: I, reason: collision with root package name */
    public static final g f11049I = new g("PARAM_TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED", 33, "A022");

    /* renamed from: J, reason: collision with root package name */
    public static final g f11052J = new g("PARAM_TELE_IS_NETWORK_ROAMING", 34, "A023");

    /* renamed from: K, reason: collision with root package name */
    public static final g f11055K = new g("PARAM_TELE_IS_SMS_CAPABLE", 35, "A024");

    /* renamed from: L, reason: collision with root package name */
    public static final g f11058L = new g("PARAM_TELE_IS_TTY_MODE_SUPPORTED", 36, "A025");

    /* renamed from: M, reason: collision with root package name */
    public static final g f11061M = new g("PARAM_TELE_IS_VOICE_CAPABLE", 37, "A026");

    /* renamed from: N, reason: collision with root package name */
    public static final g f11064N = new g("PARAM_TELE_IS_WORLD_PHONE", 38, "A027");

    /* renamed from: O, reason: collision with root package name */
    public static final g f11067O = new g("PARAM_WIFI_MAC", 39, "A028");

    /* renamed from: P, reason: collision with root package name */
    public static final g f11070P = new g("PARAM_WIFI_BSSID", 40, "A029");

    /* renamed from: Q, reason: collision with root package name */
    public static final g f11073Q = new g("PARAM_WIFI_SSID", 41, "A030");

    /* renamed from: R, reason: collision with root package name */
    public static final g f11076R = new g("PARAM_WIFI_NETWORK_ID", 42, "A031");

    /* renamed from: S, reason: collision with root package name */
    public static final g f11079S = new g("PARAM_WIFI_IS_5GHZ_BAND_SUPPORTED", 43, "A032");

    /* renamed from: T, reason: collision with root package name */
    public static final g f11082T = new g("PARAM_WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED", 44, "A033");

    /* renamed from: U, reason: collision with root package name */
    public static final g f11085U = new g("PARAM_WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED", 45, "A034");

    /* renamed from: V, reason: collision with root package name */
    public static final g f11088V = new g("PARAM_WIFI_IS_P2P_SUPPORTED", 46, "A035");

    /* renamed from: W, reason: collision with root package name */
    public static final g f11091W = new g("PARAM_WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED", 47, "A036");

    /* renamed from: X, reason: collision with root package name */
    public static final g f11094X = new g("PARAM_WIFI_IS_SCAN_ALWAYS_AVAILABLE", 48, "A037");

    /* renamed from: Y, reason: collision with root package name */
    public static final g f11097Y = new g("PARAM_WIFI_IS_TDLS_SUPPORTED", 49, "A038");

    /* renamed from: Z, reason: collision with root package name */
    public static final g f11100Z = new g("PARAM_BLUETOOTH_ADDRESS", 50, "A039");

    /* renamed from: p0, reason: collision with root package name */
    public static final g f11143p0 = new g("PARAM_BLUETOOTH_BONDED_DEVICE", 51, "A040");

    /* renamed from: q0, reason: collision with root package name */
    public static final g f11146q0 = new g("PARAM_BLUETOOTH_IS_ENABLED", 52, "A041");

    /* renamed from: r0, reason: collision with root package name */
    public static final g f11149r0 = new g("PARAM_BUILD_BOARD", 53, "A042");

    /* renamed from: s0, reason: collision with root package name */
    public static final g f11152s0 = new g("PARAM_BUILD_BOOTLOADER", 54, "A043");

    /* renamed from: t0, reason: collision with root package name */
    public static final g f11155t0 = new g("PARAM_BUILD_BRAND", 55, "A044");

    /* renamed from: u0, reason: collision with root package name */
    public static final g f11158u0 = new g("PARAM_BUILD_DEVICE", 56, "A045");

    /* renamed from: v0, reason: collision with root package name */
    public static final g f11161v0 = new g("PARAM_BUILD_DISPLAY", 57, "A046");

    /* renamed from: w0, reason: collision with root package name */
    public static final g f11164w0 = new g("PARAM_BUILD_FINGERPRINT", 58, "A047");

    /* renamed from: x0, reason: collision with root package name */
    public static final g f11167x0 = new g("PARAM_BUILD_HARDWARE", 59, "A048");

    /* renamed from: y0, reason: collision with root package name */
    public static final g f11170y0 = new g("PARAM_BUILD_ID", 60, "A049");

    /* renamed from: z0, reason: collision with root package name */
    public static final g f11173z0 = new g("PARAM_BUILD_MANUFACTURER", 61, "A050");

    /* renamed from: A0, reason: collision with root package name */
    public static final g f11026A0 = new g("PARAM_BUILD_PRODUCT", 62, "A051");

    /* renamed from: B0, reason: collision with root package name */
    public static final g f11029B0 = new g("PARAM_BUILD_RADIO", 63, "A052");

    /* renamed from: C0, reason: collision with root package name */
    public static final g f11032C0 = new g("PARAM_BUILD_SERIAL", 64, "A053");

    /* renamed from: D0, reason: collision with root package name */
    public static final g f11035D0 = new g("PARAM_BUILD_SUPPORTED_32_BIT_ABIS", 65, "A054");

    /* renamed from: E0, reason: collision with root package name */
    public static final g f11038E0 = new g("PARAM_BUILD_SUPPORTED_64_BIT_ABIS", 66, "A055");

    /* renamed from: F0, reason: collision with root package name */
    public static final g f11041F0 = new g("PARAM_BUILD_TAGS", 67, "A056");

    /* renamed from: G0, reason: collision with root package name */
    public static final g f11044G0 = new g("PARAM_BUILD_TIME", 68, "A057");

    /* renamed from: H0, reason: collision with root package name */
    public static final g f11047H0 = new g("PARAM_BUILD_TYPE", 69, "A058");

    /* renamed from: I0, reason: collision with root package name */
    public static final g f11050I0 = new g("PARAM_BUILD_USER", 70, "A059");

    /* renamed from: J0, reason: collision with root package name */
    public static final g f11053J0 = new g("PARAM_BUILD_VERSION_CODENAME", 71, "A060");

    /* renamed from: K0, reason: collision with root package name */
    public static final g f11056K0 = new g("PARAM_BUILD_VERSION_INCREMENTAL", 72, "A061");

    /* renamed from: L0, reason: collision with root package name */
    public static final g f11059L0 = new g("PARAM_BUILD_VERSION_PREVIEW_SDK_INT", 73, "A062");

    /* renamed from: M0, reason: collision with root package name */
    public static final g f11062M0 = new g("PARAM_BUILD_VERSION_SDK_INT", 74, "A063");

    /* renamed from: N0, reason: collision with root package name */
    public static final g f11065N0 = new g("PARAM_BUILD_VERSION_SECURITY_PATCH", 75, "A064");

    /* renamed from: O0, reason: collision with root package name */
    public static final g f11068O0 = new g("PARAM_SECURE_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED", 76, "A065");

    /* renamed from: P0, reason: collision with root package name */
    public static final g f11071P0 = new g("PARAM_SECURE_ACCESSIBILITY_ENABLED", 77, "A066");

    /* renamed from: Q0, reason: collision with root package name */
    public static final g f11074Q0 = new g("PARAM_SECURE_ACCESSIBILITY_ACCESSIBILITY_SPEAK_PASSWORD", 78, "A067");

    /* renamed from: R0, reason: collision with root package name */
    public static final g f11077R0 = new g("PARAM_SECURE_ALLOWED_GEOLOCATION_ORIGINS", 79, "A068");

    /* renamed from: S0, reason: collision with root package name */
    public static final g f11080S0 = new g("PARAM_SECURE_ANDROID_ID", 80, "A069");

    /* renamed from: T0, reason: collision with root package name */
    public static final g f11083T0 = new g("PARAM_SECURE_DATA_ROAMING", 81, "A070");

    /* renamed from: U0, reason: collision with root package name */
    public static final g f11086U0 = new g("PARAM_SECURE_DEFAULT_INPUT_METHOD", 82, "A071");

    /* renamed from: V0, reason: collision with root package name */
    public static final g f11089V0 = new g("PARAM_SECURE_DEVICE_PROVISIONED", 83, "A072");

    /* renamed from: W0, reason: collision with root package name */
    public static final g f11092W0 = new g("PARAM_SECURE_ENABLED_ACCESSIBILITY_SERVICES", 84, "A073");

    /* renamed from: X0, reason: collision with root package name */
    public static final g f11095X0 = new g("PARAM_SECURE_ENABLED_INPUT_METHODS", 85, "A074");

    /* renamed from: Y0, reason: collision with root package name */
    public static final g f11098Y0 = new g("PARAM_SECURE_INPUT_METHOD_SELECTOR_VISIBILITY", 86, "A075");

    /* renamed from: Z0, reason: collision with root package name */
    public static final g f11101Z0 = new g("PARAM_SECURE_INSTALL_NON_MARKET_APPS", 87, "A076");

    /* renamed from: a1, reason: collision with root package name */
    public static final g f11103a1 = new g("PARAM_SECURE_LOCATION_MODE", 88, "A077");

    /* renamed from: b1, reason: collision with root package name */
    public static final g f11106b1 = new g("PARAM_SECURE_SKIP_FIRST_USE_HINTS", 89, "A078");

    /* renamed from: c1, reason: collision with root package name */
    public static final g f11109c1 = new g("PARAM_SECURE_SYS_PROP_SETTING_VERSION", 90, "A079");

    /* renamed from: d1, reason: collision with root package name */
    public static final g f11112d1 = new g("PARAM_SECURE_TTS_DEFAULT_PITCH", 91, "A080");

    /* renamed from: e1, reason: collision with root package name */
    public static final g f11115e1 = new g("PARAM_SECURE_TTS_DEFAULT_RATE", 92, "A081");

    /* renamed from: f1, reason: collision with root package name */
    public static final g f11118f1 = new g("PARAM_SECURE_TTS_DEFAULT_SYNTH", 93, "A082");

    /* renamed from: g1, reason: collision with root package name */
    public static final g f11121g1 = new g("PARAM_SECURE_TTS_ENABLED_PLUGINS", 94, "A083");

    /* renamed from: h1, reason: collision with root package name */
    public static final g f11124h1 = new g("PARAM_GLOBAL_ADB_ENABLED", 95, "A084");

    /* renamed from: i1, reason: collision with root package name */
    public static final g f11127i1 = new g("PARAM_GLOBAL_AIRPLANE_MODE_RADIOS", 96, "A085");

    /* renamed from: j1, reason: collision with root package name */
    public static final g f11130j1 = new g("PARAM_GLOBAL_ALWAYS_FINISH_ACTIVITIES", 97, "A086");

    /* renamed from: k1, reason: collision with root package name */
    public static final g f11133k1 = new g("PARAM_GLOBAL_ANIMATOR_DURATION_SCALE", 98, "A087");

    /* renamed from: l1, reason: collision with root package name */
    public static final g f11135l1 = new g("PARAM_GLOBAL_AUTO_TIME", 99, "A088");

    /* renamed from: m1, reason: collision with root package name */
    public static final g f11137m1 = new g("PARAM_GLOBAL_AUTO_TIME_ZONE", 100, "A089");

    /* renamed from: n1, reason: collision with root package name */
    public static final g f11139n1 = new g("PARAM_GLOBAL_DEVELOPMENT_SETTINGS_ENABLED", 101, "A090");

    /* renamed from: o1, reason: collision with root package name */
    public static final g f11141o1 = new g("PARAM_GLOBAL_HTTP_PROXY", 102, "A091");

    /* renamed from: p1, reason: collision with root package name */
    public static final g f11144p1 = new g("PARAM_GLOBAL_NETWORK_PREFERENCE", 103, "A092");

    /* renamed from: q1, reason: collision with root package name */
    public static final g f11147q1 = new g("PARAM_GLOBAL_STAY_ON_WHILE_PLUGGED_IN", 104, "A093");

    /* renamed from: r1, reason: collision with root package name */
    public static final g f11150r1 = new g("PARAM_GLOBAL_TRANSITION_ANIMATION_SCALE", 105, "A094");

    /* renamed from: s1, reason: collision with root package name */
    public static final g f11153s1 = new g("PARAM_GLOBAL_USB_MASS_STORAGE_ENABLED", 106, "A095");

    /* renamed from: t1, reason: collision with root package name */
    public static final g f11156t1 = new g("PARAM_GLOBAL_USE_GOOGLE_MAIL", 107, "A096");

    /* renamed from: u1, reason: collision with root package name */
    public static final g f11159u1 = new g("PARAM_GLOBAL_WAIT_FOR_DEBUGGER", 108, "A097");

    /* renamed from: v1, reason: collision with root package name */
    public static final g f11162v1 = new g("PARAM_GLOBAL_WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON", 109, "A098");

    /* renamed from: w1, reason: collision with root package name */
    public static final g f11165w1 = new g("PARAM_SYSTEM_ACCELEROMETER_ROTATION", 110, "A099");

    /* renamed from: x1, reason: collision with root package name */
    public static final g f11168x1 = new g("PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY", 111, "A100");

    /* renamed from: y1, reason: collision with root package name */
    public static final g f11171y1 = new g("PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY_TIMEOUT", 112, "A101");

    /* renamed from: z1, reason: collision with root package name */
    public static final g f11174z1 = new g("PARAM_SYSTEM_DATE_FORMAT", 113, "A102");

    /* renamed from: A1, reason: collision with root package name */
    public static final g f11027A1 = new g("PARAM_SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING", 114, "A103");

    /* renamed from: B1, reason: collision with root package name */
    public static final g f11030B1 = new g("PARAM_SYSTEM_DTMF_TONE_WHEN_DIALING", 115, "A104");

    /* renamed from: C1, reason: collision with root package name */
    public static final g f11033C1 = new g("PARAM_SYSTEM_END_BUTTON_BEHAVIOR", 116, "A105");

    /* renamed from: D1, reason: collision with root package name */
    public static final g f11036D1 = new g("PARAM_SYSTEM_FONT_SCALE", 117, "A106");

    /* renamed from: E1, reason: collision with root package name */
    public static final g f11039E1 = new g("PARAM_SYSTEM_HAPTIC_FEEDBACK_ENABLED", 118, "A107");

    /* renamed from: F1, reason: collision with root package name */
    public static final g f11042F1 = new g("PARAM_SYSTEM_MODE_RINGER_STREAMS_AFFECTED", 119, "A108");

    /* renamed from: G1, reason: collision with root package name */
    public static final g f11045G1 = new g("PARAM_SYSTEM_NOTIFICATION_SOUND", 120, "A109");

    /* renamed from: H1, reason: collision with root package name */
    public static final g f11048H1 = new g("PARAM_SYSTEM_MUTE_STREAMS_AFFECTED", 121, "A110");

    /* renamed from: I1, reason: collision with root package name */
    public static final g f11051I1 = new g("PARAM_SYSTEM_RINGTONE", 122, "A111");

    /* renamed from: J1, reason: collision with root package name */
    public static final g f11054J1 = new g("PARAM_SYSTEM_SCREEN_BRIGHTNESS", 123, "A112");

    /* renamed from: K1, reason: collision with root package name */
    public static final g f11057K1 = new g("PARAM_SYSTEM_SCREEN_BRIGHTNESS_MODE", 124, "A113");

    /* renamed from: L1, reason: collision with root package name */
    public static final g f11060L1 = new g("PARAM_SYSTEM_SCREEN_OFF_TIMEOUT", 125, "A114");

    /* renamed from: M1, reason: collision with root package name */
    public static final g f11063M1 = new g("PARAM_SYSTEM_SOUND_EFFECTS_ENABLED", 126, "A115");

    /* renamed from: N1, reason: collision with root package name */
    public static final g f11066N1 = new g("PARAM_SYSTEM_TEXT_AUTO_CAPS", ModuleDescriptor.MODULE_VERSION, "A116");

    /* renamed from: O1, reason: collision with root package name */
    public static final g f11069O1 = new g("PARAM_SYSTEM_TEXT_AUTO_PUNCTUATE", 128, "A117");

    /* renamed from: P1, reason: collision with root package name */
    public static final g f11072P1 = new g("PARAM_SYSTEM_TEXT_AUTO_REPLACE", TsExtractor.TS_STREAM_TYPE_AC3, "A118");

    /* renamed from: Q1, reason: collision with root package name */
    public static final g f11075Q1 = new g("PARAM_SYSTEM_TEXT_SHOW_PASSWORD", TsExtractor.TS_STREAM_TYPE_HDMV_DTS, "A119");

    /* renamed from: R1, reason: collision with root package name */
    public static final g f11078R1 = new g("PARAM_SYSTEM_TIME_12_24", 131, "A120");

    /* renamed from: S1, reason: collision with root package name */
    public static final g f11081S1 = new g("PARAM_SYSTEM_USER_ROTATION", 132, "A121");

    /* renamed from: T1, reason: collision with root package name */
    public static final g f11084T1 = new g("PARAM_SYSTEM_VIBRATE_ON", 133, "A122");

    /* renamed from: U1, reason: collision with root package name */
    public static final g f11087U1 = new g("PARAM_SYSTEM_VIBRATE_WHEN_RINGING", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, "A123");

    /* renamed from: V1, reason: collision with root package name */
    public static final g f11090V1 = new g("PARAM_PACKAGE_IS_SAFE_MODE", TsExtractor.TS_STREAM_TYPE_E_AC3, "A124");

    /* renamed from: W1, reason: collision with root package name */
    public static final g f11093W1 = new g("PARAM_PACKAGE_GET_INSTALLED_APPS", 136, "A125");

    /* renamed from: X1, reason: collision with root package name */
    public static final g f11096X1 = new g("PARAM_PACKAGE_INSTALLER_PACKAGE_NAME", 137, "A126");

    /* renamed from: Y1, reason: collision with root package name */
    public static final g f11099Y1 = new g("PARAM_PACKAGE_SYSTEM_AVAILABLE_FEATURES", TsExtractor.TS_STREAM_TYPE_DTS, "A127");

    /* renamed from: Z1, reason: collision with root package name */
    public static final g f11102Z1 = new g("PARAM_PACKAGE_SYSTEM_SHARED_LIBRARY_NAMES", 139, "A128");

    /* renamed from: a2, reason: collision with root package name */
    public static final g f11104a2 = new g("PARAM_ENV_EXTERNAL_STORAGE_STATE", 140, "A129");

    /* renamed from: b2, reason: collision with root package name */
    public static final g f11107b2 = new g("PARAM_LOCALE_AVAILABLE_LOCALES", 141, "A130");

    /* renamed from: c2, reason: collision with root package name */
    public static final g f11110c2 = new g("PARAM_DISPLAY_DENSITY", 142, "A131");

    /* renamed from: d2, reason: collision with root package name */
    public static final g f11113d2 = new g("PARAM_DISPLAY_DENSITY_DPI", 143, "A132");

    /* renamed from: e2, reason: collision with root package name */
    public static final g f11116e2 = new g("PARAM_DISPLAY_SCALED_DENSITY", 144, "A133");

    /* renamed from: f2, reason: collision with root package name */
    public static final g f11119f2 = new g("PARAM_DISPLAY_XDPI", 145, "A134");

    /* renamed from: g2, reason: collision with root package name */
    public static final g f11122g2 = new g("PARAM_DISPLAY_YDPI", 146, "A135");

    /* renamed from: h2, reason: collision with root package name */
    public static final g f11125h2 = new g("PARAM_STAT_FS_TOTAL_BYTES", 147, "A136");

    static {
        g[] a9 = a();
        f11128i2 = a9;
        f11131j2 = W5.b.a(a9);
    }

    private g(String str, int i8, String str2) {
        this.f11175a = str2;
    }

    private static final /* synthetic */ g[] a() {
        return new g[]{f11105b, f11108c, f11111d, f11114e, f11117f, f11120g, f11123h, f11126i, f11129j, f11132k, f11134l, f11136m, f11138n, f11140o, f11142p, f11145q, f11148r, f11151s, f11154t, f11157u, f11160v, f11163w, f11166x, f11169y, f11172z, f11025A, f11028B, f11031C, f11034D, f11037E, f11040F, f11043G, f11046H, f11049I, f11052J, f11055K, f11058L, f11061M, f11064N, f11067O, f11070P, f11073Q, f11076R, f11079S, f11082T, f11085U, f11088V, f11091W, f11094X, f11097Y, f11100Z, f11143p0, f11146q0, f11149r0, f11152s0, f11155t0, f11158u0, f11161v0, f11164w0, f11167x0, f11170y0, f11173z0, f11026A0, f11029B0, f11032C0, f11035D0, f11038E0, f11041F0, f11044G0, f11047H0, f11050I0, f11053J0, f11056K0, f11059L0, f11062M0, f11065N0, f11068O0, f11071P0, f11074Q0, f11077R0, f11080S0, f11083T0, f11086U0, f11089V0, f11092W0, f11095X0, f11098Y0, f11101Z0, f11103a1, f11106b1, f11109c1, f11112d1, f11115e1, f11118f1, f11121g1, f11124h1, f11127i1, f11130j1, f11133k1, f11135l1, f11137m1, f11139n1, f11141o1, f11144p1, f11147q1, f11150r1, f11153s1, f11156t1, f11159u1, f11162v1, f11165w1, f11168x1, f11171y1, f11174z1, f11027A1, f11030B1, f11033C1, f11036D1, f11039E1, f11042F1, f11045G1, f11048H1, f11051I1, f11054J1, f11057K1, f11060L1, f11063M1, f11066N1, f11069O1, f11072P1, f11075Q1, f11078R1, f11081S1, f11084T1, f11087U1, f11090V1, f11093W1, f11096X1, f11099Y1, f11102Z1, f11104a2, f11107b2, f11110c2, f11113d2, f11116e2, f11119f2, f11122g2, f11125h2};
    }

    public static W5.a b() {
        return f11131j2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f11128i2.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f11175a;
    }
}
