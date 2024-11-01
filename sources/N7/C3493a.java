package n7;

import A7.e;
import E7.c;
import G7.f;
import G7.g;
import W6.C1488n;
import b7.InterfaceC1991a;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import k7.InterfaceC3267a;
import l7.AbstractC3340a;
import m7.InterfaceC3380a;
import p7.InterfaceC3593e;
import z7.C4276c;

/* renamed from: n7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3493a extends Provider {

    /* renamed from: a, reason: collision with root package name */
    private static String f35760a = "BouncyCastle Security Provider v1.69";

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC3267a f35761b = new C3494b();

    /* renamed from: c, reason: collision with root package name */
    private static final Map f35762c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final Class f35763d = AbstractC3340a.a(C3493a.class, "java.security.cert.PKIXRevocationChecker");

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f35764e = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f35765f = {"SipHash", "SipHash128", "Poly1305"};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f35766g = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015", "Zuc"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f35767h = {"X509", "IES", "COMPOSITE"};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f35768i = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f35769j = {"GOST3411", "Keccak", "MD2", "MD4", SameMD5.TAG, "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f35770k = {"BC", "BCFKS", "PKCS12"};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f35771l = {"DRBG"};

    /* renamed from: n7.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C0814a implements PrivilegedAction {
        C0814a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            C3493a.this.f();
            return null;
        }
    }

    public C3493a() {
        super("BC", 1.69d, f35760a);
        AccessController.doPrivileged(new C0814a());
    }

    private void c(String str, String[] strArr) {
        for (int i8 = 0; i8 != strArr.length; i8++) {
            Class a9 = AbstractC3340a.a(C3493a.class, str + strArr[i8] + "$Mappings");
            if (a9 != null) {
                try {
                    android.support.v4.media.a.a(a9.newInstance());
                    throw null;
                } catch (Exception e8) {
                    throw new InternalError("cannot create instance of " + str + strArr[i8] + "$Mappings : " + e8);
                }
            }
        }
    }

    private void e() {
        b(InterfaceC3593e.f36498r, new c());
        b(InterfaceC3593e.f36502v, new B7.c());
        b(InterfaceC3593e.f36503w, new f());
        b(Y6.a.f13145a, new f());
        b(InterfaceC3593e.f36461F, new g());
        b(Y6.a.f13146b, new g());
        b(InterfaceC3593e.f36493m, new A7.f());
        b(InterfaceC3593e.f36494n, new e());
        b(InterfaceC3593e.f36481a, new D7.c());
        b(InterfaceC3593e.f36479X, new C7.c());
        b(InterfaceC3593e.f36480Y, new C7.c());
        b(InterfaceC1991a.f14952I0, new C4276c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        String str;
        String str2;
        c("org.bouncycastle.jcajce.provider.digest.", f35769j);
        c("org.bouncycastle.jcajce.provider.symmetric.", f35764e);
        c("org.bouncycastle.jcajce.provider.symmetric.", f35765f);
        c("org.bouncycastle.jcajce.provider.symmetric.", f35766g);
        c("org.bouncycastle.jcajce.provider.asymmetric.", f35767h);
        c("org.bouncycastle.jcajce.provider.asymmetric.", f35768i);
        c("org.bouncycastle.jcajce.provider.keystore.", f35770k);
        c("org.bouncycastle.jcajce.provider.drbg.", f35771l);
        e();
        put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        Class cls = f35763d;
        put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        if (cls != null) {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8";
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8";
        } else {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
        }
        put("CertPathBuilder.RFC3280", str2);
        put("CertPathValidator.PKIX", str);
        put("CertPathBuilder.PKIX", str2);
        put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    public void b(C1488n c1488n, InterfaceC3380a interfaceC3380a) {
        Map map = f35762c;
        synchronized (map) {
            map.put(c1488n, interfaceC3380a);
        }
    }
}
