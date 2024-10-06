package com.RentFast.App.Billing;

import java.util.ArrayList;
import java.util.List;

public class FineController {
    private List<Fine> fines;

    public FineController() {
        fines = new ArrayList<>();
    }

    public void issueFine(Fine fine){
        fines.add(fine);

    }

}
