package com.mycompany.problem_solve_inher_inter_excep;

public class InvalidRentalDataException extends RuntimeException {

    InvalidRentalDataException(String m) {
        super(m);
    }
}
