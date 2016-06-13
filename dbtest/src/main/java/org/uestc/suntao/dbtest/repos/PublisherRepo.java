package org.uestc.suntao.dbtest.repos;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.uestc.suntao.dbtest.model.Publisher;

public interface PublisherRepo extends CrudRepository<Publisher, Serializable> {

}
