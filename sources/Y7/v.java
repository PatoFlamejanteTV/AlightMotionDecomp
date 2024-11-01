package y7;

import y7.g;
import y7.i;
import y7.o;

/* loaded from: classes5.dex */
abstract class v {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static u a(k kVar, n nVar, i iVar) {
        double d8;
        if (nVar != null) {
            if (iVar != null) {
                int a9 = kVar.d().a();
                byte[][] a10 = nVar.a();
                u[] uVarArr = new u[a10.length];
                for (int i8 = 0; i8 < a10.length; i8++) {
                    uVarArr[i8] = new u(0, a10[i8]);
                }
                o.a f8 = ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(iVar.e()).o(0).p(iVar.g()).f(iVar.a());
                while (true) {
                    i iVar2 = (i) ((i.b) f8).l();
                    if (a9 > 1) {
                        int i9 = 0;
                        while (true) {
                            d8 = a9 / 2;
                            if (i9 >= ((int) Math.floor(d8))) {
                                break;
                            }
                            iVar2 = (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar2.b())).h(iVar2.c())).n(iVar2.e()).o(iVar2.f()).p(i9).f(iVar2.a())).l();
                            int i10 = i9 * 2;
                            uVarArr[i9] = b(kVar, uVarArr[i10], uVarArr[i10 + 1], iVar2);
                            i9++;
                        }
                        if (a9 % 2 == 1) {
                            uVarArr[(int) Math.floor(d8)] = uVarArr[a9 - 1];
                        }
                        a9 = (int) Math.ceil(a9 / 2.0d);
                        f8 = ((i.b) ((i.b) new i.b().g(iVar2.b())).h(iVar2.c())).n(iVar2.e()).o(iVar2.f() + 1).p(iVar2.g()).f(iVar2.a());
                    } else {
                        return uVarArr[0];
                    }
                }
            } else {
                throw new NullPointerException("address == null");
            }
        } else {
            throw new NullPointerException("publicKey == null");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u b(k kVar, u uVar, u uVar2, o oVar) {
        if (uVar == null) {
            throw new NullPointerException("left == null");
        }
        if (uVar2 == null) {
            throw new NullPointerException("right == null");
        }
        if (uVar.a() != uVar2.a()) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        if (oVar == null) {
            throw new NullPointerException("address == null");
        }
        byte[] f8 = kVar.f();
        if (oVar instanceof i) {
            i iVar = (i) oVar;
            oVar = (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(iVar.e()).o(iVar.f()).p(iVar.g()).f(0)).l();
        } else if (oVar instanceof g) {
            g gVar = (g) oVar;
            oVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n(gVar.f()).f(0)).k();
        }
        byte[] c8 = kVar.c().c(f8, oVar.d());
        if (oVar instanceof i) {
            i iVar2 = (i) oVar;
            oVar = (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar2.b())).h(iVar2.c())).n(iVar2.e()).o(iVar2.f()).p(iVar2.g()).f(1)).l();
        } else if (oVar instanceof g) {
            g gVar2 = (g) oVar;
            oVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar2.b())).h(gVar2.c())).m(gVar2.e()).n(gVar2.f()).f(1)).k();
        }
        byte[] c9 = kVar.c().c(f8, oVar.d());
        if (oVar instanceof i) {
            i iVar3 = (i) oVar;
            oVar = (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar3.b())).h(iVar3.c())).n(iVar3.e()).o(iVar3.f()).p(iVar3.g()).f(2)).l();
        } else if (oVar instanceof g) {
            g gVar3 = (g) oVar;
            oVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar3.b())).h(gVar3.c())).m(gVar3.e()).n(gVar3.f()).f(2)).k();
        }
        byte[] c10 = kVar.c().c(f8, oVar.d());
        int c11 = kVar.d().c();
        byte[] bArr = new byte[c11 * 2];
        for (int i8 = 0; i8 < c11; i8++) {
            bArr[i8] = (byte) (uVar.b()[i8] ^ c9[i8]);
        }
        for (int i9 = 0; i9 < c11; i9++) {
            bArr[i9 + c11] = (byte) (uVar2.b()[i9] ^ c10[i9]);
        }
        return new u(uVar.a(), kVar.c().b(c8, bArr));
    }
}
