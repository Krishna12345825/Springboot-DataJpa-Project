package com.krishna.service;

import com.krishna.model.Person;

public interface IOneToManyMappingMgmtService {
     public   String   saveDataUsingParent(Person person);
     public   void   loadDataUsingParent();
     public  String   deleteParentAndItsChilds(int pid);
     public  String  deleteAllPhoneNumbersOfAPerson(int pid);
}