package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: classes4.dex */
public final class W extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f18596a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W(String str) {
        super(str);
        this.f18596a = a(str);
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        char c8 = 65535;
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (lowerCase.equals("service_not_available")) {
                    c8 = 0;
                    break;
                }
                break;
            case -1290953729:
                if (lowerCase.equals("toomanymessages")) {
                    c8 = 1;
                    break;
                }
                break;
            case -920906446:
                if (lowerCase.equals("invalid_parameters")) {
                    c8 = 2;
                    break;
                }
                break;
            case -617027085:
                if (lowerCase.equals("messagetoobig")) {
                    c8 = 3;
                    break;
                }
                break;
            case -95047692:
                if (lowerCase.equals("missing_to")) {
                    c8 = 4;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                return 3;
            case 1:
                return 4;
            case 2:
            case 4:
                return 1;
            case 3:
                return 2;
            default:
                return 0;
        }
    }
}
