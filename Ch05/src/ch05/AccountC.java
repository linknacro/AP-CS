
import java.util.*;
import java.io.*;

public class AccountC implements Comparable<AccountC> {

    enum AccountCType {
        CASH, MARGIN, RRSP
    };

    //PRIVATE
    private String fFirstName; //non-null
    private String fLastName;  //non-null
    private int fAccountCNumber;
    private int fBalance;
    private boolean fIsNewAccountC;

    /**
     * Type of the AccountC, expressed as a type-safe enumeration (non-null).
     */
    private AccountCType fAccountCType;

    public AccountC(
            String aFirstName,
            String aLastName,
            int aAccountCNumber,
            int aBalance
    ) {
        //..parameter validations elided
        fFirstName = aFirstName;
        fLastName = aLastName;
        fAccountCNumber = aAccountCNumber;
        fBalance = aBalance;

    }

    /**
     * @param aThat is a non-null AccountC.
     *
     * @throws NullPointerException if aThat is null.
     */
    @Override
    public int compareTo(AccountC aThat) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        //this optimization is usually worthwhile, and can
        //always be added
        if (this == aThat)
            return EQUAL;

        //primitive numbers follow this form
        if (this.fAccountCNumber < aThat.fAccountCNumber)
            return BEFORE;
        if (this.fAccountCNumber > aThat.fAccountCNumber)
            return AFTER;

        //booleans follow this form
        if (!this.fIsNewAccountC && aThat.fIsNewAccountC)
            return BEFORE;
        if (this.fIsNewAccountC && !aThat.fIsNewAccountC)
            return AFTER;

        //objects, including type-safe enums, follow this form
        //note that null objects will throw an exception here
        int comparison = this.fAccountCType.compareTo(aThat.fAccountCType);
        if (comparison != EQUAL)
            return comparison;

        comparison = this.fLastName.compareTo(aThat.fLastName);
        if (comparison != EQUAL)
            return comparison;

        comparison = this.fFirstName.compareTo(aThat.fFirstName);
        if (comparison != EQUAL)
            return comparison;

        if (this.fBalance < aThat.fBalance)
            return BEFORE;
        if (this.fBalance > aThat.fBalance)
            return AFTER;

        //all comparisons have yielded equality
        //verify that compareTo is consistent with equals (optional)
        assert this.equals(aThat) : "compareTo inconsistent with equals.";

        return EQUAL;
    }
    
    

    /**
     * Define equality of state.
     */
    @Override
    public boolean equals(Object aThat) {
        if (this == aThat)
            return true;
        if (!(aThat instanceof AccountC))
            return false;

        AccountC that = (AccountC) aThat;
        return (this.fAccountCNumber == that.fAccountCNumber)
                && (this.fAccountCType == that.fAccountCType)
                && (this.fBalance == that.fBalance)
                && (this.fIsNewAccountC == that.fIsNewAccountC)
                && (this.fFirstName.equals(that.fFirstName))
                && (this.fLastName.equals(that.fLastName));
    }

    public String toString() {
        return fAccountCNumber + "  " + fLastName + ", " + fFirstName + "  " + fBalance;
    }

}
