package com.deepu.DAO;

import com.deepu.Entity.Loan;

public interface DaoInterface {

                void save(Loan loan);

                Loan fetchById (Integer loanId);

                void remove (Integer loanId);


}
