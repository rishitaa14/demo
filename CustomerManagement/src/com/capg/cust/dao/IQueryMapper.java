package com.capg.cust.dao;

public interface IQueryMapper {
 String INSERT_CUST_QUERY = "insert into customer values(?,?,?,SYSDATE)";
 String UPDATE_CUST_QUERY = "update customer set cname=?,amount=?,dop=? where cid=?";     
 
}
