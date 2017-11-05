/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.gestatech.hr.ejb.business.api;

import be.gestatech.hr.ejb.domain.entity.EmpDetailsView;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author amuri
 */
@Local
public interface EmpDetailsViewFacade {

    void create(EmpDetailsView empDetailsView);

    void edit(EmpDetailsView empDetailsView);

    void remove(EmpDetailsView empDetailsView);

    EmpDetailsView find(Object id);

    List<EmpDetailsView> findAll();

    List<EmpDetailsView> findRange(int[] range);

    int count();

}
