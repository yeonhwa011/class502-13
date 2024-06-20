package Configs;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;

public class DBConn {
   private static SqlSessionFactory factory;

   static {
       try {
           Reader reader = Resources.getResourceAsReader("configs/mybatis-config.xml");

           factory= new SqlSessionFactoryBuilder().build(reader);
       }catch (IOException e){
           e.printStackTrace();
       }
   }

   public static SqlSession getSession(boolean autoCommit){
       SqlSession session = factory.openSession(autoCommit);
       return session;
   }

   public static SqlSession getSession(){
       return getSession(true);
   }
}
