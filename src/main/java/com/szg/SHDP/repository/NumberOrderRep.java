package com.szg.SHDP.repository;

import java.util.List;

import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import org.springframework.data.hadoop.hbase.RowMapper;
import org.springframework.stereotype.Repository;


import com.szg.SHDP.entity.NumberOrder;

@Repository
public class NumberOrderRep {
	
	@Autowired
	private HbaseTemplate hbaseTemplate;
	
	private String tableName = "file_content";
	
	public static byte[] CF_DATA=Bytes.toBytes("data");
	
	public byte[] qContent_data =Bytes.toBytes("content_data");
	
	public byte[] qHalfandone =Bytes.toBytes("halfaddone");
	
	public List<NumberOrder> findAll(){
		
		return hbaseTemplate.find(tableName, "data", new RowMapper<NumberOrder>() {

			public NumberOrder mapRow(Result result, int rowNum) throws Exception {
				
				return new NumberOrder(Bytes.toString(result.getValue(CF_DATA, qContent_data)),
									   Bytes.toString(result.getValue(CF_DATA, qHalfandone)));
			}
		});
	}
	

}
