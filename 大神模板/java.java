���� 
valueOf 
 public static BigInteger valueOf(long val)����һ����ָ��ֵ�� BigInteger �� ���ù����ṩ��ѡ�� (long) ����������Ϊ�������Ƶ��ʹ�õ� BigIntegers (�� 0 �� 1)�����ã����ֲ�������Ҫ��������� 

add 
 public BigInteger add(BigInteger val) throws ArithmeticException
����һ�� BigInteger ����ֵ�� (this + val) �� 
subtract 

 public BigInteger subtract(BigInteger val)����һ�� BigInteger ����ֵ�� (this - val) �� 
multiply 

 public BigInteger multiply(BigInteger val)����һ�� BigInteger ����ֵ�� (this * val) �� 
divide 

 public BigInteger divide(BigInteger val) throws ArithmeticException
����һ�� BigInteger ����ֵ�� (this / val) �� ��� val == 0 �����׳� ArithmeticException �� 
remainder 

 public BigInteger remainder(BigInteger val) throws ArithmeticException
����һ�� BigInteger ����ֵ�� (this % val) �� ��� val == 0�����׳� ArithmeticException �� 
divideAndRemainder 

 public BigInteger[] divideAndRemainder(BigInteger val) throws ArithmeticException
����һ���������� BigIntegers �����顣 ����ֵ�ĵ�һ�� ([0]) Ԫ������ (this / val), �ڶ��� ([1]) Ԫ�������� (this % val) ����� val == 0 �����׳� ArithmeticException �� 
pow 

 public BigInteger pow(int exponent) throws ArithmeticException
����һ�� BigInteger ����ֵ�� (this ** exponent) �� ��� exponent <0(��Ϊ�ò���������һ��������ֵ)�����׳� arithmeticexception ��ע�⣺ָ����һ�������������� biginteger �� 
gcd 

 public BigInteger gcd(BigInteger val)����ֵΪ abs(this) �� abs(val) ��󹫷�ĸ�� BigInteger �� ��� this == 0 && val == 0���򷵻� 0�� 
abs 

 public BigInteger abs()����һ�� BigInteger �����Ǹ���ֵ�ľ���ֵ�� 
negate 

 public BigInteger negate()����һ�� BigInteger ����ֵ�� (-1 * this ) �� 
signum 

 public int signum()���ظ���ֵ�ķ����� (���ݸ�����ֵ��������򸺷��� -1 �� 0 �� 1 ) �� 
mod 

 public BigInteger mod(BigInteger m)����һ�� BigInteger ����ֵ�� this mod m �� ��� m <= 0�����׳� arithmeticexception�� 
modPow 

 public BigInteger modPow(BigInteger exponent,                          BigInteger m)����һ�� BigInteger ����ֵ�� (this ** exponent) mod m �� ��� exponent == 1, ����ֵ�� (this mod m) �� ��� exponent <0 �� ����ֵ�� (this ** -exponent)��ģ�����档��� m <="0�����׳�" arithmeticexception �� 

modInverse 

 public BigInteger modInverse(BigInteger m) throws ArithmeticException
���� this ȡģ m ��ģ�����档 ��� m<= 0 �� this û�ж����� mod m (���� gcd(this, m) !="1)�����׳�" arithmeticexception �� 
shiftLeft 

 public BigInteger shiftLeft(int n)����һ�� BigInteger ����ֵ�� (this << n)������ floor(this * 2**n)�� 
shiftRight 

 public BigInteger shiftRight(int n)����һ�� BigInteger ����ֵ�� (this >> n)�� ִ�з�����չ(���� floor(this / 2**n))�� 
and 

 public BigInteger and(BigInteger val)����һ�� BigInteger ����ֵ�� (this & val) �� (��� this �� val ���߶��Ǹ��ģ���÷�������һ��������) 
or 

 public BigInteger or(BigInteger val)����һ�� BigInteger ����ֵ�� (this | val) �� (��� this �� val ����֮һ�Ǹ��ģ���÷�������һ��������) 
xor 

 public BigInteger xor(BigInteger val)����һ�� BigInteger ����ֵ�� (this ^ val) �� (��� this �� val ����ֻ��һ���Ǹ��ģ���÷�������һ��������) 
not 

 public BigInteger not()����һ�� BigInteger ����ֵ�� (~this) �� (��� this �ǷǸ��ģ���÷�������һ��������) 
andNot 

 public BigInteger andNot(BigInteger val)����һ�� BigInteger ����ֵ�� (this & ~val) �� �÷����ȼ��� and(val.not())�����ǽ�����ģ�����ı�ݷ����� (��� this �Ǹ������� val ����������÷�������һ��������) 
testBit 

 public boolean testBit(int n) throws ArithmeticException
���������ָ��λ�򷵻� true �� (���� ((this & (1 << n)) !=0))����� n < 0�����׳� arithmeticexception�� 
setBit 

 public BigInteger setBit(int n) throws ArithmeticException
����һ�� BigInteger ����ֵ���ڸ���������ָ��λ������ֵ(���� (this | (1 << n)))�� ��� n < 0 �����׳� arithmeticexception �� 
clearBit 

 public BigInteger clearBit(int n) throws ArithmeticException
����һ�� BigInteger ����ֵ���ڸ���ָ��λ���������ֵ(���� (this & ~(1 << n)))�� ��� n < 0�����׳� arithmeticexception �� 
flipBit 

 public BigInteger flipBit(int n) throws ArithmeticException
����һ�� BigInteger ����ֵ���ڸ���ָ��λȡ��������ֵ(���� (this ^ (1 << n)))�� ��� n < 0�����׳� arithmeticexception �� 
getLowestSetBit 

 public int getLowestSetBit()���ظ������Ҷ� (lowest-order)�� 1 ��λ������ (�����Ǿ����Ҷ� 1 λ��� 0 λ�ĸ��� ) �� �������û�� 1 λ���򷵻� -1 (���� (this==0? -1 : log2(this & -this)))�� 
bitLength 

 public int bitLength()���ظ�������С�����Ʋ����ʾ��λ�ĸ����� �� *������* ����λ (ceil(log2(this <0 ? -this : this + 1)))����������˵����ȼ�����ͨ�����Ʊ�ʾ��λ�ĸ����� 
bitCount 

 public int bitCount()���ظ����Ķ����Ʋ����ʾ�в���������λ���ڵ�λ�ĸ����� �÷����� BigIntegers ֮��ʵ��λ�������ļ���ʱ�����á� 
isProbablePrime 

 public boolean isProbablePrime(int certainty)����� BigInteger �������������򷵻� true �����������ȷ��һ���������򷵻� false �� ���� certainty �ǶԵ�����Ը�����ܵĲ�ȷ���ԵĶ�������������������ĸ��ʳ����� 1 - 1/2**certainty��������÷������� true ��ִ��ʱ�������ڲ���ȷ���Ե�ֵ�� 
compareTo 

 public int compareTo(BigInteger val)���ݸ���ֵ��С�ڡ����ڡ������ val ���� -1��0 �� 1 ���÷����������߼��Ƚ������ (<, ="=,">, >=, !=, <= ) �Ĳ�������Ϊ��ѡ������������Щ�ȽϵĽ��鷽���ǣ�(x.compareto(y) 0) ������ �������ȽϷ��е�һ���� 
equals 

 public boolean equals(Object x)��� x ��һ�� BigInteger ���ҵ��ڸ����򷵻� true �� �ṩ�÷�����Ŀ����ʹ BigIntegers ������Ϊɢ����ؼ���ʹ�á� 
���ǣ� 
�� Object �е� equals 
min 

 public BigInteger min(BigInteger val)���� BigInteger ����ֵ�� this �� val �еĽ�С�ߡ� ��ֵ��ͬ�������߶����ܱ����ء� 
max 

 public BigInteger max(BigInteger val)���� BigInteger ����ֵ�� this �� val �еĽϴ��ߡ� ��ֵ��ͬ�������߶����ܱ����ء� 
hashCode 

 public int hashCode()Ϊ�ö������һ��ɢ���롣 
���ǣ� 
�� Object �е� hashCode 
toString 

 public String toString(int radix)���ر�ʾ�������ַ���������Ϊ�������� �� ������������� Character.MIN_RADIX(2) �� Character.MAX_RADIX(36)(������������) �ķ�Χ������ȱʡ�趨Ϊ 10 (������ Integer.toString ������)��ʹ���� Character.forDigit �ṩ�����ֵ��ַ���ӳ�䣬��������ʵ��Ļ���������ǰ��һ�����š� �ñ�ʾ��ͬ (String, int) �����Ӽ��ݡ� 
toString 

 public String toString()���ر�ʾ�������ַ���������Ϊ 10 �� ʹ���� Character.forDigit �ṩ�����ֵ��ַ���ӳ�䣬����������ʵĻ���������ǰ��һ�����š� �ñ�ʾ��ͬ (String) �����Ӽ��ݣ����������� Java �� + ��������ַ������Ӳ����� 
���ǣ� 
�� Object �е� toString 
toByteArray 

 public byte[] toByteArray()���ظ���ֵ�Ķ����Ʋ����ʾ�� ������ big-endian ��ʽ(������Ч�ֽ���λ�� [0]) ���������������Ҫ��ʾ��������С���ֽ��� (ceil((this.bitLength() + 1)/8)) ���ñ�ʾ��ͬ(byte[])�����Ӽ��ݡ� 
intValue 

 public int intValue()�Ѹ���ת��Ϊ int ֵ�� ��׼������ԭ��ת��ͬ��Java ���Թ淶���������һ���� 
���ǣ� 
�� Number �е� intValue 
longValue 

 public long longValue()�Ѹ���ת��Ϊ long �͡���׼������ԭ��ת��ͬ��Java ���Թ淶�������һ���� 
���ǣ� 
�� Number �е� longValue 
floatValue 

 public float floatValue()�Ѹ���ת��Ϊ float �͡��ò��������ڡ�Java ���Թ淶���ж���� double-to-float ����ԭ��ת���������ֵ̫�����²��ܱ�ʾΪһ��������ʱ��������ת��Ϊ���ʵ������������ 
���ǣ� 
�� Number �е� floatValue 
doubleValue 

 public double doubleValue()�Ѹ���ת��Ϊ double �͡� �ò��������ڡ�Java ���Թ淶���ж���� double-to-float ������ԭ��ת���������ֵ̫�����²��ܱ�ʾΪһ��˫��������������ת��Ϊ�ʵ�������������� 

import java.math.BigInteger;
public class BigIntegerGet {
    public String getAdd(String Str1,String Str2){
        String Str3=new String();
        BigInteger BigInt1=new BigInteger(Str1);
        BigInteger BigInt2=new BigInteger(Str2);
        BigInt1=BigInt1.add(BigInt2);
        Str3=BigInt1.toString();
        return Str3;
    }
    public String getSubtract(String Str1,String Str2){
        String Str3=new String();
        BigInteger BigInt1=new BigInteger(Str1);
        BigInteger BigInt2=new BigInteger(Str2);
        BigInt1=BigInt1.subtract(BigInt2);
        Str3=BigInt1.toString();       
        return Str3;
    }
    public String getMultiply(String Str1,String Str2){
        String Str3=new String();
        BigInteger BigInt1=new BigInteger(Str1);
        BigInteger BigInt2=new BigInteger(Str2);
        BigInt1=BigInt1.multiply(BigInt2);
        Str3=BigInt1.toString();       
        return Str3;
    }
    public String getDivide(String Str1,String Str2){
        String Str3=new String();
        BigInteger BigInt1=new BigInteger(Str1);
        BigInteger BigInt2=new BigInteger(Str2);
        BigInt1=BigInt1.divide(BigInt2);
        Str3=BigInt1.toString();       
        return Str3;
    }
    public String getRemainder(String Str1,String Str2){//��
        String Str3=new String();
        BigInteger BigInt1=new BigInteger(Str1);
        BigInteger BigInt2=new BigInteger(Str2);
        BigInt1=BigInt1.remainder(BigInt2);
        Str3=BigInt1.toString();       
        return Str3;
    }
    public String getGcd(String Str1,String Str2){
        String Str3=new String();
        BigInteger BigInt1=new BigInteger(Str1);
        BigInteger BigInt2=new BigInteger(Str2);
        BigInt1=BigInt1.gcd(BigInt2);
        Str3=BigInt1.toString();       
        return Str3;
    }
    public String getPow(String Str1,String Str2){
        String Str3=new String();
        BigInteger BigInt1=new BigInteger(Str1);
        int Int2=Integer.valueOf(Str2);
        BigInt1=BigInt1.pow(Int2);
        Str3=BigInt1.toString();       
        return Str3;
    }
    public String getMod(String Str1,String Str2){
        String Str3=new String();
        BigInteger BigInt1=new BigInteger(Str1);
        BigInteger BigInt2=new BigInteger(Str2);
        BigInt1=BigInt1.mod(BigInt2);
        Str3=BigInt1.toString();        
        return Str3;
    }
    public String getModInverse(String Str1,String Str2){
        String Str3=new String();
        BigInteger BigInt1=new BigInteger(Str1);
        BigInteger BigInt2=new BigInteger(Str2);
        BigInt1=BigInt1.modInverse(BigInt2);
        Str3=BigInt1.toString();        
        return Str3;
    }
    public String getMax(String Str1,String Str2){
        String Str3=new String();
        BigInteger BigInt1=new BigInteger(Str1);
        BigInteger BigInt2=new BigInteger(Str2);
        BigInt1=BigInt1.max(BigInt2);
        Str3=BigInt1.toString();        
        return Str3;
    }
    public String getMin(String Str1,String Str2){
        String Str3=new String();
        BigInteger BigInt1=new BigInteger(Str1);
        BigInteger BigInt2=new BigInteger(Str2);
        BigInt1=BigInt1.min(BigInt2);
        Str3=BigInt1.toString();        
        return Str3;
    }
    public int getHashcode(String Str){
        int hash=-1;
        BigInteger BigInt=new BigInteger(Str);
        hash=BigInt.hashCode();
        return hash;
    }
    public boolean getIsProbablePrime(String Str,int certainty){//����������Ϊ1 - 1/2certainty
        boolean flag=false;
        BigInteger BigInt=new BigInteger(Str);
        flag=BigInt.isProbablePrime(certainty);
        return flag;
    }
}
import java.math.BigDecimal; 

public class Arith { 

/** 
* ����Java�ļ����Ͳ��ܹ���ȷ�ĶԸ������������㣬����������ṩ�� 
* ȷ�ĸ��������㣬�����Ӽ��˳����������롣 
*/ 
//Ĭ�ϳ������㾫�� 
private static final int DEF_DIV_SCALE = 10; 
    
//����಻��ʵ���� 
private Arith(){ 
} 

    /** 
     * �ṩ��ȷ�ļӷ����㡣 
     * @param v1 ������ 
     * @param v2 ���� 
     * @return ���������ĺ� 
     */ 
    public static double add(double v1,double v2){ 
        BigDecimal b1 = new BigDecimal(Double.toString(v1)); 
        BigDecimal b2 = new BigDecimal(Double.toString(v2)); 
        return b1.add(b2).doubleValue(); 
    } 
    /** 
     * �ṩ��ȷ�ļ������㡣 
     * @param v1 ������ 
     * @param v2 ���� 
     * @return ���������Ĳ� 
     */ 
    public static double sub(double v1,double v2){ 
        BigDecimal b1 = new BigDecimal(Double.toString(v1)); 
        BigDecimal b2 = new BigDecimal(Double.toString(v2)); 
        return b1.subtract(b2).doubleValue(); 
    } 
    /** 
     * �ṩ��ȷ�ĳ˷����㡣 
     * @param v1 ������ 
     * @param v2 ���� 
     * @return ���������Ļ� 
     */ 
    public static double mul(double v1,double v2){ 
        BigDecimal b1 = new BigDecimal(Double.toString(v1)); 
        BigDecimal b2 = new BigDecimal(Double.toString(v2)); 
        return b1.multiply(b2).doubleValue(); 
    } 

    /** 
     * �ṩ����ԣ���ȷ�ĳ������㣬�����������������ʱ����ȷ�� 
     * С�����Ժ�10λ���Ժ�������������롣 
     * @param v1 ������ 
     * @param v2 ���� 
     * @return ������������ 
     */ 
    public static double div(double v1,double v2){ 
        return div(v1,v2,DEF_DIV_SCALE); 
    } 

    /** 
     * �ṩ����ԣ���ȷ�ĳ������㡣�����������������ʱ����scale����ָ 
     * �����ȣ��Ժ�������������롣 
     * @param v1 ������ 
     * @param v2 ���� 
     * @param scale ��ʾ��ʾ��Ҫ��ȷ��С�����Ժ�λ�� 
     * @return ������������ 
     */ 
    public static double div(double v1,double v2,int scale){ 
        if(scale<0){ 
            throw new IllegalArgumentException( 
                "The scale must be a positive integer or zero"); 
        } 
        BigDecimal b1 = new BigDecimal(Double.toString(v1)); 
        BigDecimal b2 = new BigDecimal(Double.toString(v2)); 
        return b1.divide(b2,scale,BigDecimal.ROUND_HALF_UP).doubleValue(); 
    } 

    /** 
     * �ṩ��ȷ��С��λ�������봦�� 
     * @param v ��Ҫ������������� 
     * @param scale С���������λ 
     * @return ���������Ľ�� 
     */ 
    public static double round(double v,int scale){ 
        if(scale<0){ 
            throw new IllegalArgumentException( 
                "The scale must be a positive integer or zero"); 
        } 
        BigDecimal b = new BigDecimal(Double.toString(v)); 
        BigDecimal one = new BigDecimal("1"); 
        return b.divide(one,scale,BigDecimal.ROUND_HALF_UP).doubleValue(); 
    } 
    
   /** 
    * �ṩ��ȷ������ת��(Float) 
    * @param v ��Ҫ��ת�������� 
    * @return ����ת����� 
    */ 
    public static float convertsToFloat(double v){ 
    BigDecimal b = new BigDecimal(v); 
    return b.floatValue(); 
    } 
    
    /** 
* �ṩ��ȷ������ת��(Int)�������������� 
* @param v ��Ҫ��ת�������� 
* @return ����ת����� 
*/ 
public static int convertsToInt(double v){ 
BigDecimal b = new BigDecimal(v); 
    return b.intValue(); 
} 

/** 
* �ṩ��ȷ������ת��(Long) 
* @param v ��Ҫ��ת�������� 
* @return ����ת����� 
*/ 
public static long convertsToLong(double v){ 
BigDecimal b = new BigDecimal(v); 
    return b.longValue(); 
} 

/** 
* �����������д��һ��ֵ 
* @param v1 ��Ҫ���Աȵĵ�һ���� 
* @param v2 ��Ҫ���Աȵĵڶ����� 
* @return �����������д��һ��ֵ 
*/ 
public static double returnMax(double v1,double v2){ 
BigDecimal b1 = new BigDecimal(v1); 
BigDecimal b2 = new BigDecimal(v2); 
    return b1.max(b2).doubleValue(); 
} 

/** 
* ������������С��һ��ֵ 
* @param v1 ��Ҫ���Աȵĵ�һ���� 
* @param v2 ��Ҫ���Աȵĵڶ����� 
* @return ������������С��һ��ֵ 
*/ 
public static double returnMin(double v1,double v2){ 
BigDecimal b1 = new BigDecimal(v1); 
BigDecimal b2 = new BigDecimal(v2); 
    return b1.min(b2).doubleValue(); 
} 

/** 
* ��ȷ�Ա��������� 
* @param v1 ��Ҫ���Աȵĵ�һ���� 
* @param v2 ��Ҫ���Աȵĵڶ����� 
* @return ���������һ���򷵻�0�������һ�����ȵڶ��������򷵻�1����֮����-1 
*/ 
public static int compareTo(double v1,double v2){ 
BigDecimal b1 = new BigDecimal(v1); 
BigDecimal b2 = new BigDecimal(v2); 
    return b1.compareTo(b2); 
} 
} 
�߾��ȳ˷�
import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	public static void main(String args[])throws Exception{
		Scanner cin=new Scanner(System.in);
		int n;
		String ans;
		BigDecimal a;
		while(cin.hasNext()){
			a=cin.nextBigDecimal();
			n=cin.nextInt();
			a=a.pow(n).stripTrailingZeros();
			ans=a.toPlainString();
			if(ans.substring(0,2).startsWith("0."))
		    	ans=ans.substring(1);
			System.out.println(ans);
		}
	}
}

1.String (char a[]) ��һ���ַ�����a ����һ���ַ�������,�� 
  char a[]={��b��,��o��,��y��}; 
  String s=new String(a); 
  ���������൱�� String s= "boy"; 

2. String(char a[],int startIndex,int count) ��ȡ�ַ�����a �е�һ�����ַ�����һ���ַ������� ,����startIndex ��count �ֱ�ָ����a ����ȡ�ַ�����ʼλ�úʹӸ�λ�ÿ�ʼ��ȡ���ַ�����,���� 
char a[]={��s��,��t��,��b��,��u��,��s��,��n��}; 
String s=new String(a,2,3); 
���������൱�� String s= "bus"; 

3 equals���� equalsIgnoreCase�������Դ�Сд 
�ַ����������String���е�public boolean equals(String s)�����Ƚϵ�ǰ�ַ��������ʵ���Ƿ������ָ�����ַ���s��ʵ����ͬ.�� 
String tom=new String( "we are students"); 
String boy=new String( "We are students"); 
String jerry= new String("we are students"); 

tom.equals(boy)��ֵ��false, 
tom.equals(jerry)��ֵ�� true. 

4 startsWith,endsWith���� 
String tom= "220302620629021",jerry= "21079670924022"; 
tom.startsWith("220")��ֵ��true 
jerry.startsWith("220")��ֵ��false. 

5 regionMatches���� 
�ַ������� 
public boolean regionMatches(int firstStart,String other,int ortherStart,int length) 
����,�ӵ�ǰ�ַ�������firstStartָ����λ�ÿ�ʼ��,ȡ����Ϊlength��һ���Ӵ�,��������Ӵ��Ͳ���other ָ����һ���Ӵ����бȽ�,����,other ָ�����Ӵ��ǴӲ���othertStart ָ����λ�ÿ�ʼ,��other��ȡ����Ϊlength��һ���Ӵ�.��������Ӵ���ͬ�÷����ͷ���true,���򷵻�false. 
ʹ�ø÷��������ط��� 
public boolean regionMatches(boolean b,int firstStart,String other,int ortherStart,intlength) 
����ͨ������b�����Ƿ���Դ�Сд,��bȡtrueʱ,���Դ�Сд. 


6 compareTo,compareToIgnoreCase���� 
�ַ����������ʹ��String���е� 
public int compareTo(String s)����,���ǵ��������sָ�����ַ����Ƚϴ�С. 
�����ǰ�ַ�����s��ͬ,�÷�������ֵ0 
�����ǰ�ַ����������s,�÷���������ֵ 
���С��s,�÷������ظ�ֵ. 

7 public int indexOf (String s) �ַ������ø÷����ӵ�ǰ�ַ�����ʼ�����ַ���s,�������״γ���s��λ��.���û�м������ַ���s,�÷������ص�ֵ��-1. 

public int indexOf(String s ,int startpoint) �ַ������ø÷����ӵ�ǰ�ַ�����startpoint λ�ô���ʼ�����ַ���s,�������״γ���s ��λ��.���û�м������ַ���s,�÷������ص�ֵ��-1. 

public int lastIndexOf (String s) �ַ������ø÷����ӵ�ǰ�ַ�����ͷ��ʼ�����ַ���s,������������s��λ��.���û�м������ַ���s,�÷������ص�ֵ��-1. 

public int lastIndexOf(String s ,int startpoint) �ַ������ø÷����ӵ�ǰ�ַ�����startpoint λ�ô���ʼ�����ַ���s,������������s ��λ��.���û�м������ַ���s,�÷������ص�ֵ��-1. 

8 public String substring(int startpoint) �ַ���������ø÷������һ����ǰ�ַ������Ӵ�,���Ӵ��Ǵӵ�ǰ�ַ�����startpoint����ȡ��������õ����ַ���. 

public String substring(int start ,int end) �ַ���������ø÷������һ����ǰ�ַ������Ӵ�,���Ӵ��Ǵӵ�ǰ�ַ�����start ����ȡ��end �����õ����ַ���,��������end������Ӧ���ַ�. 

9 public String replace(char oldChar,char newChar) �ַ�������s���ø÷������Ի��һ��������,������������ò���newChar ָ�����ַ��滻s ����oldChar ָ���������ַ����õ����ַ���. 

public String replaceAll(String old ,String new) �ַ�������s���ø÷������Ի��һ��������,�����������ͨ���ò���newָ�����ַ����滻s ����old ָ���������ַ������õ����ַ���. 

Public String trim() һ���ַ���s ͨ�����÷���trim()�õ�һ���ַ�������,���ַ���������sȥ��ǰ��ո����ַ���. 

10 ת��Ϊ���� 
java.lang���е�Integer��������෽�� 
public static int parseInt(String s) 
���Խ� �����֡� ��ʽ���ַ���,��"12387",ת��Ϊint������.���� 
int x; 
String s="6542"; 
x=Integer.parseInt("6542"); 
���Ƶ�,ʹ��java.lang���е�Byte,Short,Long�����Ӧ���෽�� 
public static byte parseByte(String s) 
public static short parseShort(String s) 
public static long parseLong(String s) 
���Խ������֡���ʽ���ַ���,ת��Ϊ��Ӧ�Ļ����������� 

11 ת��Ϊfloat�ͻ�double��java.lang���е�Float��������෽�� 
  public static int parseFloat (String s)���Խ� �����֡���ʽ���ַ���,��"12387.8976",ת ��Ϊfloat ������.���� 
  float n=Float.parseFloat("12387.8976") 
�� 
  String s= new String(��12387.8976��); 
  float n=Float.parseFloat(s) 

12 public StringvalueOf( byte n) 
  public StringvalueOf (int n) 
  public StringvalueOf (long n) 
  public StringvalueOf (float n) 
  public StringvalueOf (double n) 

������123,1232.98����ֵת��Ϊ�ַ���,�� 
String str=String.valueOf(12313.9876); 
float x=123.987f; 
String temp=String.valueOf(x); 

13 ���ַ����е��ַ��������ַ����� 
public void getChars(int start,int end,char c[],int offset ) �ַ�������getChars ��������ǰ�ַ����е�һ�����ַ�����������c ָ����������,���ַ����д�λ��start ��end-1λ���ϵ��ַ�����������c��,��������c ��offset����ʼ�����Щ�ַ�.��Ҫע�����,���뱣֤����c��������Ҫ���������ַ�.

Java����split�������зָ��ַ�����  
1.�﷨���� 

String.split(sourceStr,maxSplit) 

String.split(sourceStr) 

����˵����sourceStr�Ǳ��ָ���ַ�����maxSplit�����ķָ��� 

����ֵ˵����split�����ķ���ֵ��һ���ַ�������String[] 

2.ʾ������ 

package wang48.jiaocheng; 
public class StringSplit  
{ 
 public static void main(String[]args) 
 { 
  String sourceStr="1,2,3,4,5"; 
  String[] sourceStrArray=sourceStr.split(","); 
  for(int i=0;i<sourceStrArray.length;i++) 
  { 
   System.out.println(sourceStrArray[i]); 
  } 
   
  //���ָ��3���ַ��� 
  int maxSplit=3; 
  sourceStrArray=sourceStr.split(",",maxSplit); 
  for(int i=0;i<sourceStrArray.length;i++) 
  { 
   System.out.println(sourceStrArray[i]); 
  } 
   
 } 

} 

�������� 

1 
2 
3 
4 
5 
1 
2 
3,4,5 

StringTokenizer�÷�
1��StringTokenizer����java.util�࣬���õ�ʱ�����ࣺimport java.util.*;2�����캯����          1��StringTokenizer��String str��������һ������str�Ķ�����ʱ��Ĭ�ϵ�Token������С��ո񡱡����Ʊ��(��\t��)���������з�(��\n��)�������س���(��\r��)����        2��StringTokenizer(String str, String delim) ������һ����������str��StringTokenizer���󣬲��ṩһ��ָ���ķָ������硰�����ȡ�     3��StringTokenizer(String str, String delim, boolean returnDelims) ������һ����������str��StringTokenizer���󣬲��ṩһ��ָ���ķָ�����ͬ2����ͬʱ��ָ���Ƿ񷵻طָ�����3�������� 
     ˵���� ���з�����Ϊpublic�� 
             1��.int countTokens() ������nextToken���������õĴ�����������ù��캯��1��2�����صľ��Ƿָ��������� 
        2.��boolean hasMoreTokens() �������Ƿ��зָ����� 
       3.��boolean hasMoreElements() �����ͬ�ϡ� 
       4.��String nextToken() �����شӵ�ǰλ�õ���һ���ָ������ַ����� 
       5.��Object nextElement() �����ͬ4�� 
     6.��String nextToken(String delim) ����4���ƣ���ָ���ķָ������ؽ����
�������������ӣ��������ҵã�û�з����������������һ�¡���1�� 
����: 
      String s = new String("The Java platform is the ideal platform for network computing"); 
      StringTokenizer st = new StringTokenizer(s); 
      System.out.println( "Token Total: " + st.countTokens() ); 
      while( st.hasMoreElements() ){ 
         System.out.println( st.nextToken() ); 
����������������������} 
���Ϊ�� 
Token Total: 10 
The 
Java 
platform 
is 
the 
ideal 
platform 
for 
network 
computing 
����ܼ򵥣����ò��Ҵ�˵�ˣ����캯��1�� ����1����2����2: 
����: 
      String s = new String("The=Java=platform=is=the=ideal=platform=for=network=computing"); 
      StringTokenizer st = new StringTokenizer(s,"=",true); //��Ϊfalseʱ������ʲô�����
      System.out.println( "Token Total: " + st.countTokens() ); 
      while( st.hasMoreElements() ){ 
         System.out.println( st.nextToken() ); 
      } 
���Ϊ�� 
Token Total: 19 ��falseʱΪ10��
The 
= ��falseʱ��û���ˡ�������
Java 
= 
platform 
= 
is 
= 
the 
= 
ideal 
= 
platform 
= 
for 
= 
network 
= 
Computing

Java����������ж�
Scanner in = new Scanner(System.in);
while(in.hasNext()){
System.out.println(in.next());
}

BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
while(true){
     temp=in.readLine();
     if(temp==null) break;
}

Java �ļ�����
Scanner in=new Scanner(new File("data.in"));
BufferedReader in = new BufferedReader( new FileReader("data.in") );

Java�ļ����
PrintWriter out=new PrintWriter( "test.out" );
out.println(a.add(b));
out.close(); 