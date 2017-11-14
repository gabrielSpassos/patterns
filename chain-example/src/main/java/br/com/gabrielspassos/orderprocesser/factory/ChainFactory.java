package br.com.gabrielspassos.orderprocesser.factory;

import br.com.gabrielspassos.orderprocesser.chain.ChiefHandler;
import br.com.gabrielspassos.orderprocesser.chain.Handler;
import br.com.gabrielspassos.orderprocesser.chain.ManagerHandler;
import br.com.gabrielspassos.orderprocesser.chain.SalesmanHandler;

public class ChainFactory {

    public static Handler createChain(){

        ChiefHandler chiefHandler = new ChiefHandler(null);
        ManagerHandler managerHandler = new ManagerHandler(chiefHandler);
        SalesmanHandler salesmanHandler = new SalesmanHandler(managerHandler);

        return salesmanHandler;
    }
}
