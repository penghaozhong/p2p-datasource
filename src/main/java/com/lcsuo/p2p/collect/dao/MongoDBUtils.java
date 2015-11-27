package com.lcsuo.p2p.collect.dao;

import java.util.Map;

import org.bson.BasicBSONObject;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DefaultDBCallback;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;

/**
 * mongodb 工具类
 * <p>
 * HOST  DATABASENAME 需要根据自己机器进行修改
 * 
 * </p>
 * @author penghaozhong
 *
 */
public class MongoDBUtils{
	
	private static final String HOST = "192.168.1.98";
	private static final int PORT = 27017;
	private static final String DATABASENAME = "p2p-data";
	private static final String DBCOLLECTION = "p2p";
	
	private static MongoClient mongoClient ;
	private static  DB db;

	static {
		// 实例化mongodb
		mongoClient = new MongoClient(HOST, PORT);
		db = mongoClient.getDB(DATABASENAME);
	}

	private MongoDBUtils() {
		super();
	}
	
	public static MongoDatabase  getDB(String databaseName){
		return mongoClient.getDatabase(databaseName);
		
	}
	
	public static void insert(String dbName, String colName, Map map) {
        DBCollection coll = db.getCollection(colName);
        BasicDBObject record = new BasicDBObject(map);
        coll.insert(record);
    }
	 
	 public static void insert(String json) {
	        DBCollection coll = db.getCollection(DBCOLLECTION);
	        BasicBSONObject obj = (BasicBSONObject)JSON.parse(json, new DefaultDBCallback(coll));
	        BasicDBObject record = new BasicDBObject(obj);
	        coll.insert(record);
	    }
	 
	 
	 /**
	  * 查询方法 
	  * 根据 rankingmonth 进行查询 
	  * 已查询到的数据不会进行更新 
	  * @param rankingMonth
	  */
	 public static void find(String rankingMonth) {
	        DBCollection coll = db.getCollection(DBCOLLECTION);
	    }

}
