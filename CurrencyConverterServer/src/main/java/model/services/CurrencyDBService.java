package model.services;

import dao.CurrencyDAO;
import model.entities.Currency;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Ilua on 15.12.2016.
 */
@Service
@Transactional
public class CurrencyDBService implements CurrencyDAO {

    private CurrencyDAO service;

    public CurrencyDBService() {
    }

    public CurrencyDBService(CurrencyDAO service) {
        this.service = service;
    }

    @Override
    public void add(List<Currency> list) {
        service.add(list);
    }

    @Override
    public void update(List<Currency> list) {
        service.update(list);
    }

    @Override
    public List<Currency> getCurrencies() {
        return service.getCurrencies();
    }

    @Override
    public List<Currency> getCurrencies(Calendar fromDate) {
        return service.getCurrencies(fromDate);
    }

    @Override
    public List<Currency> getCurrencies(Calendar fromDate, Calendar toDate) {
        return service.getCurrencies(fromDate, toDate);
    }
}
