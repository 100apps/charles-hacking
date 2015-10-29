package com.xk72.charles.gui;

import java.io.UnsupportedEncodingException;

public final class P {
	private static int A = 0;
	private static int B = 0;
	private static int C = 0;
	private static int D = 0;
	private static int E = 0;
	private static int F = 0;
	private static int G = 0;
	private static int H = 0;
	private static int I = 0;
	private static int J = 0;
	private static int K = 0;
	private static int L = 0;
	private static int M = 0;
	private static int N = 0;
	private static int O = 0;
	private static String a = "Thanks for looking at the source. Please register Charles if you use it.";
	private static final int ap = -1209970333;
	private static final int aq = -1640531527;
	private static P b = null;
	private static final int g = 1;
	private static final int h = 2;
	private static final int i = 3;
	private static final long j = 8800536498351690864L;
	private static final long k = -5408575981733630035L;
	private static final long l = -6517524745266237632L;
	private static final long m = 5911726755176091652L;
	private static final String[] n;
	private static final int o = 32;
	private static int p;
	private static int q;
	private static int r;
	private static int s;
	private static int t;
	private static int u;
	private static int v;
	private static int w;
	private static int x;
	private static int y;
	private static int z;
	private int P;
	private int Q;
	private int R;
	private int S;
	private int T;
	private int U;
	private int V;
	private int W;
	private int X;
	private int Y;
	private int Z;
	private int aa;
	private int ab;
	private int ac;
	private int ad;
	private int ae;
	private int af;
	private int ag;
	private int ah;
	private int ai;
	private int aj;
	private int ak;
	private int al;
	private int am;
	private int an;
	private int ao;
	private boolean c;
	private String d;
	private int e;
	private int f;

	static {
		b = new P();
		String[] strArr = new String[i];
		strArr[0] = "b241993e8a12c782348e4652cc22c2501d9d6f248e91a3d849275666a0ff7d954fdf638f0d03098c52c4710a5e619b9b09cd6cd027ea3bdb937172b3fdf0bded3d684333798880bb78780f6f6644580409ac882bc021732a";
		strArr[g] = "b241993e8a12c782348e4652cc22c250c30afb881b44ba4dd936c44a573755b5276046dc3ae32e58d10f467421f51ca607b0e29f53cd8f38dd9eee548398b195348e4652cc22c2502feb5f8fd884cb3c9a330ee10954d071";
		strArr[h] = "8a24264c4ae5e5371d663158ccbd75e5a5d70bef5d61291ba3af58b92fe98f7a5c8f83abe09b0c1b3f469d5ad85a3a01e81a2248a290b22d05f52db22eb8b10af10437ddcf2f437b1a519b09a9c4f2c374a882757515e2e2fde238a4eccc62d3fc36d9a77dcbd7cc05236b02716005836b21e58a07330bb18136139263e71a0f79382179978b680a";
		n = strArr;
		p = ap;
		q = 1444465436;
		r = -196066091;
		s = -1836597618;
		t = 817838151;
		u = -822693376;
		v = 1831742393;
		w = 191210866;
		x = -1449320661;
		y = 1205115108;
		z = -435416419;
		A = -2075947946;
		B = 578487823;
		C = -1062043704;
		D = 1592392065;
		E = -48139462;
		F = -1688670989;
		G = 965764780;
		H = -674766747;
		I = 1979669022;
		J = 339137495;
		K = -1301394032;
		L = 1353041737;
		M = -287489790;
		N = -1928021317;
		O = 726414452;
	}

	public P() {
		this.c = false;
		this.d = "Unregistered";
	}

	private P(String str, String str2) throws LicenceException {
		this.c = false;
		this.d = "Unregistered";
		try {
			if (a(c(str, str2))) {
				this.d = str;
				this.c = true;
				return;
			}
			throw new LicenceException(a((int) h));
		} catch (NumberFormatException e) {
			throw new LicenceException(a((int) g));
		}
	}

	private static final int a(byte[] bArr) {
		int i = 0;
		int i2 = 0;
		while (i < bArr.length) {
			i2 ^= bArr[i];
			i2 = (i2 >>> 29) | (i2 << i);
			i += g;
		}
		return i2;
	}

	private static final long a(String str) {
		return (Long.parseLong(str.substring(h, 10), 16) << o) | Long.parseLong(str.substring(10, 18), 16);
	}

	private String a(int i) {
		d(j);
		try {
			String str = n[i];
			byte[] bArr = new byte[(str.length() / h)];
			for (int i2 = 0; i2 < bArr.length; i2 += g) {
				bArr[i2] = (byte) Integer.parseInt(str.substring(i2 << g, (i2 << g) + h), 16);
			}
			bArr = c(bArr);
			int length = bArr.length;
			// 把null改成了0
			while (bArr[length - 1] == 0) {
				length--;
			}
			return new String(bArr, 0, length, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}

	public static String a(String str, String str2) {
		try {
			b = new P(str, str2);
			return null;
		} catch (LicenceException e) {
			return e.getMessage();
		}
	}

	private static void a(P p) {
		b = p;
	}

	public static boolean a() {
		return true;//b.c;
	}

	private boolean a(long j) {
		int b = b(j);
		d(j);
		for (int i = 0; i < b + 35; i += g) {
			j = c(j);
		}
		return j == m;
	}

	private static final int b(long j) {
		long j2 = 0;
		for (int i = 56; i >= 0; i -= 8) {
			j2 ^= (j >>> i) & 255;
		}
		return Math.abs((int) (j2 & 255));
	}

	private static final int b(String str) {
		return Integer.parseInt(str.substring(0, h), 16);
	}

	public static String b() {
		P p = b;
		switch (p.f) {
		case g /* 1 */:
			return p.d;
		case h /* 2 */:
			return p.d + " - Site License";
		case i /* 3 */:
			return p.d + " - Multi-Site License";
		default:
			return p.d;
		}
	}

	private boolean b(String str, String str2) throws LicenceException {
		long c = c(str, str2);
		int b = b(c);
		d(c);
		for (int i = 0; i < b + 35; i += g) {
			c = c(c);
		}
		return c == m;
	}

	private byte[] b(byte[] bArr) {
		int length = bArr.length;
		int i = length + 4;
		if (i % 8 != 0) {
			i += 8 - (i % 8);
		}
		byte[] bArr2 = new byte[i];
		System.arraycopy(bArr, 0, bArr2, 4, length);
		bArr2[0] = (byte) (length >> 24);
		bArr2[g] = (byte) (length >> 16);
		bArr2[h] = (byte) (length >> 8);
		bArr2[i] = (byte) length;
		return c(bArr2);
	}

	private long c(long j) {
		int i = ((int) (j >>> 32)) + this.Q;
		int i2 = (((int) j) + this.P) ^ i;
		int i3 = i & 31;
		i2 = ((i2 >>> (32 - i3)) | (i2 << i3)) + this.R;
		i ^= i2;
		i3 = i2 & 31;
		i = ((i >>> (32 - i3)) | (i << i3)) + this.S;
		i2 ^= i;
		i3 = i & 31;
		i2 = ((i2 >>> (32 - i3)) | (i2 << i3)) + this.T;
		i ^= i2;
		i3 = i2 & 31;
		i = ((i >>> (32 - i3)) | (i << i3)) + this.U;
		i2 ^= i;
		i3 = i & 31;
		i2 = ((i2 >>> (32 - i3)) | (i2 << i3)) + this.V;
		i ^= i2;
		i3 = i2 & 31;
		i = ((i >>> (32 - i3)) | (i << i3)) + this.W;
		i2 ^= i;
		i3 = i & 31;
		i2 = ((i2 >>> (32 - i3)) | (i2 << i3)) + this.X;
		i ^= i2;
		i3 = i2 & 31;
		i = ((i >>> (32 - i3)) | (i << i3)) + this.Y;
		i2 ^= i;
		i3 = i & 31;
		i2 = ((i2 >>> (32 - i3)) | (i2 << i3)) + this.Z;
		i ^= i2;
		i3 = i2 & 31;
		i = ((i >>> (32 - i3)) | (i << i3)) + this.aa;
		i2 ^= i;
		i3 = i & 31;
		i2 = ((i2 >>> (32 - i3)) | (i2 << i3)) + this.ab;
		i ^= i2;
		i3 = i2 & 31;
		i = ((i >>> (32 - i3)) | (i << i3)) + this.ac;
		i2 ^= i;
		i3 = i & 31;
		i2 = ((i2 >>> (32 - i3)) | (i2 << i3)) + this.ad;
		i ^= i2;
		i3 = i2 & 31;
		i = ((i >>> (32 - i3)) | (i << i3)) + this.ae;
		i2 ^= i;
		i3 = i & 31;
		i2 = ((i2 >>> (32 - i3)) | (i2 << i3)) + this.af;
		i ^= i2;
		i3 = i2 & 31;
		i = ((i >>> (32 - i3)) | (i << i3)) + this.ag;
		i2 ^= i;
		i3 = i & 31;
		i2 = ((i2 >>> (32 - i3)) | (i2 << i3)) + this.ah;
		i ^= i2;
		i3 = i2 & 31;
		i = ((i >>> (32 - i3)) | (i << i3)) + this.ai;
		i2 ^= i;
		i3 = i & 31;
		i2 = ((i2 >>> (32 - i3)) | (i2 << i3)) + this.aj;
		i ^= i2;
		i3 = i2 & 31;
		i = ((i >>> (32 - i3)) | (i << i3)) + this.ak;
		i2 ^= i;
		i3 = i & 31;
		i2 = ((i2 >>> (32 - i3)) | (i2 << i3)) + this.al;
		i ^= i2;
		i3 = i2 & 31;
		i = ((i >>> (32 - i3)) | (i << i3)) + this.am;
		i2 ^= i;
		i3 = i & 31;
		i2 = ((i2 >>> (32 - i3)) | (i2 << i3)) + this.an;
		i ^= i2;
		i3 = i2 & 31;
		return (((long) i2) & 4294967295L) + (((long) (((i >>> (32 - i3)) | (i << i3)) + this.ao)) << 32);
	}

	private long c(String str, String str2) throws LicenceException {
		int i = 0;
		if (str2.length() != 18) {
			throw new LicenceException(a(0));
		} else if (str2.equalsIgnoreCase("7055ce2f8cb4f9405f") || str2.equalsIgnoreCase("5bae9d8cdea32760ae")
				|| str2.equalsIgnoreCase("f3264994d9ea6bc595") || str2.equalsIgnoreCase("b9930cef009d3a7865")
				|| str2.equalsIgnoreCase("62bd6a5f95aa67998e") || str2.equalsIgnoreCase("a1c536c35904e64584")
				|| str2.equalsIgnoreCase("d6e5590ecc05edd9b3") || str2.equalsIgnoreCase("8fbe36ce2726458b18")
				|| str2.equalsIgnoreCase("042a8352caf1188945") || str2.equalsIgnoreCase("9d26d5088770221c3c")
				|| str2.equalsIgnoreCase("e19b2a01905e4129bf") || str2.equalsIgnoreCase("68ebe4c9d792f31057")
				|| str2.equalsIgnoreCase("4e4beb8a43e9feb9c7") || str2.equalsIgnoreCase("d04d85b44b306fc9ec")
				|| str2.equalsIgnoreCase("2b5d21a38c9452e342") || str2.equalsIgnoreCase("88cb89c26a813bce44")
				|| str2.equalsIgnoreCase("76c9ee78c8ab124054") || str2.equalsIgnoreCase("729db7c98163ac7d3d")
				|| str2.equalsIgnoreCase("7c1d4761993c412472") || str2.equalsIgnoreCase("08bc0b7ec91cd0f4aa")
				|| str2.equalsIgnoreCase("25bafae175decaedcc") || str2.equalsIgnoreCase("3181aae6822ef90ccd")
				|| str2.equalsIgnoreCase("d7a8fe9dc9dc919f87") || str2.equalsIgnoreCase("728dae81d9d22aca03")
				|| str2.equalsIgnoreCase("119a9b593348fa3e74") || str2.equalsIgnoreCase("04ab87c8d69667878e")
				|| str2.equalsIgnoreCase("4b282d851ebd87a7bb") || str2.equalsIgnoreCase("ed526255313b756e42")
				|| str2.equalsIgnoreCase("ed5ab211362ab25ca7") || str2.equalsIgnoreCase("18f4789a3df48f3b15")
				|| str2.equalsIgnoreCase("67549e44b1c8d8d857") || str2.equalsIgnoreCase("4593c6c54227c4f17d")
				|| str2.equalsIgnoreCase("1c59db29042e7df8ef") || str2.equalsIgnoreCase("a647e3dd42ce9b409b")
				|| str2.equalsIgnoreCase("7e06d6a70b82858113") || str2.equalsIgnoreCase("ef4b5a48595197a373")
				|| str2.equalsIgnoreCase("0ac55f6bebd0330640") || str2.equalsIgnoreCase("1beda9831c78994f43")
				|| str2.equalsIgnoreCase("8a2b9debb15766bff9") || str2.equalsIgnoreCase("da0e7561b10d974216")
				|| str2.equalsIgnoreCase("86257b04b8c303fd9a") || str2.equalsIgnoreCase("a4036b2761c9583fda")
				|| str2.equalsIgnoreCase("18e69f6d5bc820d4d3")) {
			throw new LicenceException(a((int) g));
		} else {
			long parseLong = (Long.parseLong(str2.substring(h, 10), 16) << 32)
					| Long.parseLong(str2.substring(10, 18), 16);
			int parseInt = Integer.parseInt(str2.substring(0, h), 16);
			d(k);
			parseLong = c(parseLong);
			if (b(parseLong) != parseInt) {
				throw new LicenceException(a((int) g));
			}
			this.e = (int) (((parseLong << 32) >>> 32) >>> 24);
			if (this.e == g) {
				this.f = g;
			} else if (this.e == i) {
				this.f = (int) ((((parseLong << 32) >>> 32) >>> 16) & 255);
				if (!(this.f == g || this.f == h || this.f == i)) {
					throw new LicenceException(a((int) g));
				}
			} else if (this.e > i) {
				this.f = (int) ((((parseLong << 32) >>> 32) >>> 16) & 255);
			} else {
				throw new LicenceException(a((int) g));
			}
			d(j);
			try {
				byte[] bytes = str.getBytes("UTF-8");
				int length = bytes.length;
				parseInt = length + 4;
				if (parseInt % 8 != 0) {
					parseInt += 8 - (parseInt % 8);
				}
				byte[] bArr = new byte[parseInt];
				System.arraycopy(bytes, 0, bArr, 4, length);
				bArr[0] = (byte) (length >> 24);
				bArr[g] = (byte) (length >> 16);
				bArr[h] = (byte) (length >> 8);
				bArr[i] = (byte) length;
				byte[] c = c(bArr);
				parseInt = 0;
				while (i < c.length) {
					parseInt ^= c[i];
					parseInt = (parseInt >>> 29) | (parseInt << i);
					i += g;
				}
				return ((((long) (((int) (parseLong >> 32)) ^ parseInt)) << 32) >>> 32) | -6517524747541020672L;
			} catch (UnsupportedEncodingException e) {
				return -1;
			}
		}
	}

	private boolean c() {
		return this.c;
	}

	private byte[] c(byte[] bArr) {
		byte[] bArr2 = new byte[bArr.length];
		int length = bArr.length;
		long j = 0;
		int i = 0;
		for (int i2 = 0; i2 < length; i2 += g) {
			j = (j << 8) | ((long) (bArr[i2] & 255));
			i += g;
			if (i == 8) {
				j = c(j);
				bArr2[i2 - 7] = (byte) ((int) (j >>> 56));
				bArr2[i2 - 6] = (byte) ((int) (j >>> 48));
				bArr2[i2 - 5] = (byte) ((int) (j >>> 40));
				bArr2[i2 - 4] = (byte) ((int) (j >>> o));
				bArr2[i2 - 3] = (byte) ((int) (j >>> 24));
				bArr2[i2 - 2] = (byte) ((int) (j >>> 16));
				bArr2[i2 - 1] = (byte) ((int) (j >>> 8));
				bArr2[i2] = (byte) ((int) j);
				j = 0;
				i = 0;
			}
		}
		return bArr2;
	}

	private String d() {
		switch (this.f) {
		case g /* 1 */:
			return this.d;
		case h /* 2 */:
			return this.d + " - Site License";
		case i /* 3 */:
			return this.d + " - Multi-Site License";
		default:
			return this.d;
		}
	}

	private void d(long j) {
		int i = (int) j;
		int i2 = (int) (j >>> o);
		int i3 = p;
		i3 = (i3 >>> 29) | (i3 << i);
		this.P = i3;
		i += i3;
		int i4 = i3 & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + q;
		i3 = (i3 >>> 29) | (i3 << i);
		this.Q = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + r;
		i3 = (i3 >>> 29) | (i3 << i);
		this.R = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + s;
		i3 = (i3 >>> 29) | (i3 << i);
		this.S = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + t;
		i3 = (i3 >>> 29) | (i3 << i);
		this.T = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + u;
		i3 = (i3 >>> 29) | (i3 << i);
		this.U = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + v;
		i3 = (i3 >>> 29) | (i3 << i);
		this.V = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + w;
		i3 = (i3 >>> 29) | (i3 << i);
		this.W = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + x;
		i3 = (i3 >>> 29) | (i3 << i);
		this.X = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + y;
		i3 = (i3 >>> 29) | (i3 << i);
		this.Y = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + z;
		i3 = (i3 >>> 29) | (i3 << i);
		this.Z = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + A;
		i3 = (i3 >>> 29) | (i3 << i);
		this.aa = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + B;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ab = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + C;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ac = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + D;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ad = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + E;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ae = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + F;
		i3 = (i3 >>> 29) | (i3 << i);
		this.af = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + G;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ag = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + H;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ah = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + I;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ai = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + J;
		i3 = (i3 >>> 29) | (i3 << i);
		this.aj = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + K;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ak = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + L;
		i3 = (i3 >>> 29) | (i3 << i);
		this.al = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + M;
		i3 = (i3 >>> 29) | (i3 << i);
		this.am = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + N;
		i3 = (i3 >>> 29) | (i3 << i);
		this.an = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + O;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ao = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.P;
		i3 = (i3 >>> 29) | (i3 << i);
		this.P = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.Q;
		i3 = (i3 >>> 29) | (i3 << i);
		this.Q = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.R;
		i3 = (i3 >>> 29) | (i3 << i);
		this.R = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.S;
		i3 = (i3 >>> 29) | (i3 << i);
		this.S = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.T;
		i3 = (i3 >>> 29) | (i3 << i);
		this.T = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.U;
		i3 = (i3 >>> 29) | (i3 << i);
		this.U = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.V;
		i3 = (i3 >>> 29) | (i3 << i);
		this.V = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.W;
		i3 = (i3 >>> 29) | (i3 << i);
		this.W = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.X;
		i3 = (i3 >>> 29) | (i3 << i);
		this.X = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.Y;
		i3 = (i3 >>> 29) | (i3 << i);
		this.Y = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.Z;
		i3 = (i3 >>> 29) | (i3 << i);
		this.Z = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.aa;
		i3 = (i3 >>> 29) | (i3 << i);
		this.aa = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.ab;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ab = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.ac;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ac = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.ad;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ad = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.ae;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ae = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.af;
		i3 = (i3 >>> 29) | (i3 << i);
		this.af = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.ag;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ag = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.ah;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ah = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.ai;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ai = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.aj;
		i3 = (i3 >>> 29) | (i3 << i);
		this.aj = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.ak;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ak = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.al;
		i3 = (i3 >>> 29) | (i3 << i);
		this.al = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.am;
		i3 = (i3 >>> 29) | (i3 << i);
		this.am = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.an;
		i3 = (i3 >>> 29) | (i3 << i);
		this.an = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.ao;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ao = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.P;
		i3 = (i3 >>> 29) | (i3 << i);
		this.P = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.Q;
		i3 = (i3 >>> 29) | (i3 << i);
		this.Q = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.R;
		i3 = (i3 >>> 29) | (i3 << i);
		this.R = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.S;
		i3 = (i3 >>> 29) | (i3 << i);
		this.S = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.T;
		i3 = (i3 >>> 29) | (i3 << i);
		this.T = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.U;
		i3 = (i3 >>> 29) | (i3 << i);
		this.U = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.V;
		i3 = (i3 >>> 29) | (i3 << i);
		this.V = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.W;
		i3 = (i3 >>> 29) | (i3 << i);
		this.W = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.X;
		i3 = (i3 >>> 29) | (i3 << i);
		this.X = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.Y;
		i3 = (i3 >>> 29) | (i3 << i);
		this.Y = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.Z;
		i3 = (i3 >>> 29) | (i3 << i);
		this.Z = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.aa;
		i3 = (i3 >>> 29) | (i3 << i);
		this.aa = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.ab;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ab = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.ac;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ac = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.ad;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ad = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.ae;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ae = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.af;
		i3 = (i3 >>> 29) | (i3 << i);
		this.af = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.ag;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ag = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.ah;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ah = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.ai;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ai = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.aj;
		i3 = (i3 >>> 29) | (i3 << i);
		this.aj = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.ak;
		i3 = (i3 >>> 29) | (i3 << i);
		this.ak = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.al;
		i3 = (i3 >>> 29) | (i3 << i);
		this.al = i3;
		i += i3 + i2;
		i4 = (i3 + i2) & 31;
		i = (i >>> (32 - i4)) | (i << i4);
		i3 = (i3 + i) + this.am;
		i3 = (i3 >>> 29) | (i3 << i);
		this.am = i3;
		i2 += i3 + i;
		i4 = (i3 + i) & 31;
		i2 = (i2 >>> (32 - i4)) | (i2 << i4);
		i3 = (i3 + i2) + this.an;
		i3 = (i3 >>> 29) | (i3 << i);
		this.an = i3;
		i += i3 + i2;
		i2 = (i2 + i3) & 31;
		i = (((i >>> (32 - i2)) | (i << i2)) + i3) + this.ao;
		this.ao = (i >>> 29) | (i << i);
	}
}

class LicenceException extends Exception {
	public LicenceException(String str) {
		super(str);
	}
}