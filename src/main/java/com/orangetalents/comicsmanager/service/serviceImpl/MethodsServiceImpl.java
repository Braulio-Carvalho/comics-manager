package com.orangetalents.comicsmanager.service.serviceImpl;

import com.orangetalents.comicsmanager.service.MethodsService;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;

@Service
public class MethodsServiceImpl implements MethodsService {
    DayOfWeek discountDay;

    public void lastChar(char lastChars) {
        switch (lastChars) {
            case '0':
            case '1':
                discountDay = DayOfWeek.MONDAY;
                break;

            case '2':
            case '3':
                discountDay = DayOfWeek.TUESDAY;
                break;

            case '4':
            case '5':
                discountDay = DayOfWeek.WEDNESDAY;
                break;

            case '6':
            case '7':
                discountDay = DayOfWeek.THURSDAY;
                break;

            case '8':
            case '9':
                discountDay = DayOfWeek.FRIDAY;
                break;

        }
    }
}
