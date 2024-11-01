package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* loaded from: classes3.dex */
public interface P0 extends IInterface {
    void beginAdUnitExposure(String str, long j8);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j8);

    void endAdUnitExposure(String str, long j8);

    void generateEventId(U0 u02);

    void getAppInstanceId(U0 u02);

    void getCachedAppInstanceId(U0 u02);

    void getConditionalUserProperties(String str, String str2, U0 u02);

    void getCurrentScreenClass(U0 u02);

    void getCurrentScreenName(U0 u02);

    void getGmpAppId(U0 u02);

    void getMaxUserProperties(String str, U0 u02);

    void getSessionId(U0 u02);

    void getTestFlag(U0 u02, int i8);

    void getUserProperties(String str, String str2, boolean z8, U0 u02);

    void initForTests(Map map);

    void initialize(Y.a aVar, C2107c1 c2107c1, long j8);

    void isDataCollectionEnabled(U0 u02);

    void logEvent(String str, String str2, Bundle bundle, boolean z8, boolean z9, long j8);

    void logEventAndBundle(String str, String str2, Bundle bundle, U0 u02, long j8);

    void logHealthData(int i8, String str, Y.a aVar, Y.a aVar2, Y.a aVar3);

    void onActivityCreated(Y.a aVar, Bundle bundle, long j8);

    void onActivityDestroyed(Y.a aVar, long j8);

    void onActivityPaused(Y.a aVar, long j8);

    void onActivityResumed(Y.a aVar, long j8);

    void onActivitySaveInstanceState(Y.a aVar, U0 u02, long j8);

    void onActivityStarted(Y.a aVar, long j8);

    void onActivityStopped(Y.a aVar, long j8);

    void performAction(Bundle bundle, U0 u02, long j8);

    void registerOnMeasurementEventListener(V0 v02);

    void resetAnalyticsData(long j8);

    void setConditionalUserProperty(Bundle bundle, long j8);

    void setConsent(Bundle bundle, long j8);

    void setConsentThirdParty(Bundle bundle, long j8);

    void setCurrentScreen(Y.a aVar, String str, String str2, long j8);

    void setDataCollectionEnabled(boolean z8);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(V0 v02);

    void setInstanceIdProvider(InterfaceC2089a1 interfaceC2089a1);

    void setMeasurementEnabled(boolean z8, long j8);

    void setMinimumSessionDuration(long j8);

    void setSessionTimeoutDuration(long j8);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j8);

    void setUserProperty(String str, String str2, Y.a aVar, boolean z8, long j8);

    void unregisterOnMeasurementEventListener(V0 v02);
}
