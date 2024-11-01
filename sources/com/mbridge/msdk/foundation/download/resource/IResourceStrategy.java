package com.mbridge.msdk.foundation.download.resource;

import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;

/* loaded from: classes4.dex */
interface IResourceStrategy {
    String getResourceStrategyName();

    void processResource(MBResourceManager mBResourceManager, IDatabaseHelper iDatabaseHelper, ResourceConfig resourceConfig);
}
