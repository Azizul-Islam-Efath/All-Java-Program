package com.mycompany.exception_handling;
import java.util.*;
class NotEnoughMoney extends Exception {
    public NotEnoughMoney() {
        super("Not enough money to withdraw.");
    }
}
