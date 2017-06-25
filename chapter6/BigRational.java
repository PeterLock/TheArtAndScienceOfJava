/**
 * File name: BigRational.java
 * ---------------------------
 */

package com.chapter6;
import java.math.BigInteger;

import acm.util.ErrorException;
 
public class BigRational { 
	
    public BigRational(){
        this(BigInteger.ZERO);
    }
     
    public BigRational(BigInteger numerator){
        this(numerator,BigInteger.ONE);      
    }
    public BigRational(BigInteger numerator, BigInteger denominator) {
        if (BigInteger.ZERO == denominator) throw new ErrorException("Cannot divide by zero.");
        
        BigInteger gcd = numerator.abs().gcd(denominator.abs());
        
        this.numerator = numerator.divide(gcd);
        this.denominator = denominator.divide(gcd);
    }
 
    public BigRational add(BigRational r) {
        return new BigRational (this.numerator.multiply(r.denominator)
                .add(r.numerator.multiply(this.denominator)), 
                this.denominator.multiply(r.denominator));
    }
 
    public BigRational subtract(BigRational r) {
        return new BigRational(this.numerator.multiply(r.denominator).subtract(r.numerator).multiply(this.denominator),
                this.denominator.multiply(r.denominator));
    }
 
    public BigRational multiply(BigRational r) {
        return new BigRational(this.numerator.multiply(r.numerator), 
                this.denominator.multiply(r.denominator));
    }
 
    public BigRational divide(BigRational r) {
        return new BigRational(this.numerator.multiply(r.denominator),
                this.denominator.multiply(r.numerator));
    }
 
    public String toString() {
        if (denominator == BigInteger.ONE) {
            return "" + numerator;
        } else {
            return numerator + "/" + denominator;
        }
    }  
    
    private BigInteger numerator;
    private BigInteger denominator;
 
}
