package com.mbridge.msdk.out;

import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class LoadListener implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract void onLoadFaild(String str);

    public abstract void onLoadSucceed();
}
