
package dao;

import connection.MyConnection;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Book;
import model.Student;

public class LibraryDAO 
{
    public static boolean chechkFLogin(String user,String pass)
  {
   Connection con=null;
   PreparedStatement ps=null;
   ResultSet rs=null;
   try
   {
     con=MyConnection.getConnection();
     String sql;
     sql="select * from flogin where username=? and password=?";
     ps=con.prepareStatement(sql);
     ps.setString(1, user);
     ps.setString(2, pass);
     rs=ps.executeQuery();
     if(rs.next())
         return true;
   }
   catch(Exception e)
   {
       System.out.println(e);
   }
   return false;
  }
      public static boolean chechkSLogin(String user,String pass)
  {
   Connection con=null;
   PreparedStatement ps=null;
   ResultSet rs=null;
   try
   {
     con=MyConnection.getConnection();
     String sql;
     sql="select * from slogin where username=? and password=?";
     ps=con.prepareStatement(sql);
     ps.setString(1, user);
     ps.setString(2, pass);
     rs=ps.executeQuery();
     if(rs.next())
         return true;
   }
   catch(Exception e)
   {
       System.out.println(e);
   }
   return false;
  }
      public Book checkById(String b)
      {
       Connection con=null;
       PreparedStatement ps=null;
       ResultSet rs=null;
       Book B=new Book();
       try
       {
           con=MyConnection.getConnection();
           String sql;
           sql="select * from book where book_id=?";
           ps=con.prepareStatement(sql);
           ps.setString(1,b);
           rs=ps.executeQuery();
           if(rs.next())
           {
               B.setB_id(rs.getString(1));
               B.setB_name(rs.getString(2));
               B.setSub(rs.getString(3));
               B.setA_name(rs.getString(4));
               B.setDepartment(rs.getString(5));
               B.setEddition(rs.getString(6));
               B.setAva(rs.getString(7));
            }
           else
               B=null;
       }
       catch(Exception e)
       {}
       return B;
      }
      public List<Book> checkByBookName(String name)
   {
     Connection con=null;
     PreparedStatement ps=null;
     ResultSet rs=null;
     List<Book> mylist=new ArrayList<Book>();
     try
     {
      con=MyConnection.getConnection();
      String sql;
      sql="select * from book where subject=?";
      ps=con.prepareStatement(sql);
      ps.setString(1, name);
      rs=ps.executeQuery();
       
      while(rs.next())
      {
       Book b=new Book();
       b.setB_id(rs.getString(1));
       b.setB_name(rs.getString(2));
       b.setSub(rs.getString(3));
       b.setA_name(rs.getString(4));
       b.setDepartment(rs.getString(5));
       b.setEddition(rs.getString(6));
       b.setAva(rs.getString(7));
       
       mylist.add(b);
       
       b=null;
      }
      
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
     return mylist;
  } 
      public Book checkByBookNameAndAuthorName(String b_name,String a_name)
  {
     Connection con=null;
     PreparedStatement ps=null;
     ResultSet rs=null;
     Book b=new Book();
     try
     {
      con=MyConnection.getConnection();
      String sql;
      sql="select * from book where book_name=? and author_name=?";
      ps=con.prepareStatement(sql);
      ps.setString(1, b_name);
      ps.setString(2, a_name);
      rs=ps.executeQuery();
       
      while(rs.next())
      {
      
       b.setB_id(rs.getString(1));
       b.setB_name(rs.getString(2));
       b.setSub(rs.getString(3));
       b.setA_name(rs.getString(4));
       b.setDepartment(rs.getString(5));
       b.setEddition(rs.getString(6));
       b.setAva(rs.getString(7));
      }
      
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
     return b;
  } 
      public List<Book> checkByDepartmentAntSubject(String department,String subject)
   {
     Connection con=null;
     PreparedStatement ps=null;
     ResultSet rs=null;
     List<Book> mylist=new ArrayList<Book>();
     try
     {
      con=MyConnection.getConnection();
      String sql;
      sql="select * from book where department=? and subject=?";
      ps=con.prepareStatement(sql);
      ps.setString(1, department);
      ps.setString(2, subject);
      rs=ps.executeQuery();
       
      while(rs.next())
      {
       Book b=new Book();
       b.setB_id(rs.getString(1));
       b.setB_name(rs.getString(2));
       b.setSub(rs.getString(3));
       b.setA_name(rs.getString(4));
       b.setDepartment(rs.getString(5));
       b.setEddition(rs.getString(6));
       b.setAva(rs.getString(7));
       
       mylist.add(b);
       
       b=null;
      }
      
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
     return mylist;
  } 
      public List<Book> ShowAll()
   {
     Connection con=null;
     PreparedStatement ps=null;
     ResultSet rs=null;
     List<Book> mylist=new ArrayList<Book>();
     try
     {
      con=MyConnection.getConnection();
      String sql;
      sql="select * from book";
      ps=con.prepareStatement(sql);
      rs=ps.executeQuery();
       
      while(rs.next())
      {
       Book b=new Book();
       b.setB_id(rs.getString(1));
       b.setB_name(rs.getString(2));
       b.setSub(rs.getString(3));
       b.setA_name(rs.getString(4));
       b.setDepartment(rs.getString(5));
       b.setEddition(rs.getString(6));
       b.setAva(rs.getString(7));
       
       mylist.add(b);
       
       b=null;
      }
      
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
     return mylist;
  } 
      public List<Book> ShowByDepartment(String department)
   {
     Connection con=null;
     PreparedStatement ps=null;
     ResultSet rs=null;
     List<Book> mylist=new ArrayList<Book>();
     try
     {
      con=MyConnection.getConnection();
      String sql;
      sql="select * from book where department=?";
      ps=con.prepareStatement(sql);
      ps.setString(1, department);
      rs=ps.executeQuery();
       
      while(rs.next())
      {
       Book b=new Book();
       b.setB_id(rs.getString(1));
       b.setB_name(rs.getString(2));
       b.setSub(rs.getString(3));
       b.setA_name(rs.getString(4));
       b.setDepartment(rs.getString(5));
       b.setEddition(rs.getString(6));
       b.setAva(rs.getString(7));
       
       mylist.add(b);
       
       b=null;
      }
      
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
     return mylist;
  } 
      public boolean insertBook(Book b)
    {
      Connection con=null;
      PreparedStatement ps=null;
      try
      {
        con=MyConnection.getConnection();
        String sql;
        sql="insert into book values(?,?,?,?,?,?,?)";
        ps=con.prepareStatement(sql);
        ps.setString(1,b.getB_id());
        ps.setString(2,b.getB_name());
        ps.setString(3,b.getSub());
        ps.setString(4,b.getA_name());
        ps.setString(5,b.getDepartment());
        ps.setString(6,b.getEddition());
        ps.setString(7,b.getAva());
        if(ps.executeUpdate()>0)
            return true;
      }
      catch(Exception e)
      {
         System.out.println(e);
      }
        return false;
    }
      public boolean deleteBookById(String b_id)
    {
     Connection con=null;
     PreparedStatement ps=null;
     try
     {
      con=MyConnection.getConnection();
      String sql;
      sql="delete from book where book_id=?";
      ps=con.prepareStatement(sql);
      ps.setString(1,b_id);
      if(ps.executeUpdate()>0)
          return true;
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
     return false; 
    }
       
        public boolean updateBook(Book s)
    {
        Connection con=null;
        PreparedStatement ps=null;
        try
        {
            con=MyConnection.getConnection();
            String sql;
            sql="update book set  book_id=?, book_name=?, subject=?, author_name=?, department=?, edition=?, avaibility=? where book_id=?";
            ps=con.prepareStatement(sql);
            ps.setString(1,s.getB_id());
            ps.setString(2,s.getB_name());
            ps.setString(3,s.getSub());
            ps.setString(4,s.getA_name());
            ps.setString(5,s.getDepartment());
            ps.setString(6,s.getEddition());
            ps.setString(7,s.getAva());
            ps.setString(8,s.getB_id());
            if(ps.executeUpdate()>0)
                return true;
        }
        catch(Exception e)
        {
            
        }
        return false;
    }
        public boolean insertStud(Student s)
    {
      Connection con=null;
      PreparedStatement ps=null;
      try
      {
        con=MyConnection.getConnection();
        String sql;
        sql="insert into issue values(?,?,?,?,?)";
        ps=con.prepareStatement(sql);
        ps.setString(1,s.getId());
        ps.setString(2,s.getName());
        ps.setString(3,s.getCon());
        ps.setString(4,s.getDate());
        ps.setString(5,s.getB_id());
        
        if(ps.executeUpdate()>0)
            return true;
      }
      catch(Exception e)
      {
         System.out.println(e);
      }
        return false;
    }
        public Student checkBySId(String b)
      {
       Connection con=null;
       PreparedStatement ps=null;
       ResultSet rs=null;
       Student B=new Student();
       try
       {
           con=MyConnection.getConnection();
           String sql;
           sql="select * from issue where student_id=? ";
           ps=con.prepareStatement(sql);
           ps.setString(1,b);
           rs=ps.executeQuery();
           if(rs.next())
           {
            B.setId(rs.getString(1));
            B.setName(rs.getString(2));
            B.setCon(rs.getString(3));
            B.setDate(rs.getString(4));
            B.setB_id(rs.getString(5));
           }
           else
               B=null;
       }
       catch(Exception e)
       {}
       return B;
      }
        public List<Student> ShowAllStud()
   {
     Connection con=null;
     PreparedStatement ps=null;
     ResultSet rs=null;
     List<Student> mylist=new ArrayList<Student>();
     try
     {
      con=MyConnection.getConnection();
      String sql;
      sql="select * from issue";
      ps=con.prepareStatement(sql);
      rs=ps.executeQuery();
       
      while(rs.next())
      {
       Student B=new Student();
       B.setId(rs.getString(1));
       B.setName(rs.getString(2));
       B.setCon(rs.getString(3));
       B.setDate(rs.getString(4));
       B.setB_id(rs.getString(5));
       
       mylist.add(B);
       
       B=null;
      }
      
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
     return mylist;
  } 
        public boolean deleteStudById(String s_id)
    {
     Connection con=null;
     PreparedStatement ps=null;
     try
     {
      con=MyConnection.getConnection();
      String sql;
      sql="delete from issue where student_id=?";
      ps=con.prepareStatement(sql);
      ps.setString(1,s_id);
      if(ps.executeUpdate()>0)
          return true;
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
     return false; 
    }
        public static int autoIncr()
    {
     Connection con=null;
     PreparedStatement ps=null;
     ResultSet rs=null;
     int m=101;
     try
     {
       con=MyConnection.getConnection();
       String sql;
       sql="select max(book_id) from book";
       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
       if(rs.next())
       {
          m=rs.getInt(1);
          m=m+1;
       }
     }
     catch(Exception e)
     {
     
     }
     return m;
    }
        public String penalty(String stud_id)
        {
          Connection con=null;
          PreparedStatement ps=null;
          ResultSet rs=null;
          String date=null;
           try
     {
       con=MyConnection.getConnection();
       String sql;
       sql="select date from issue where student_id=?";
       ps=con.prepareStatement(sql);
       ps.setString(1, stud_id);
       rs=ps.executeQuery();
       if(rs.next())
       {
          date=rs.getString(1);
       }
     }
     catch(Exception e)
     {
     
     }
           return date;
        }
        
//        public static void main(String args[])
//        {
//            SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy"); 
//            LibraryDAO ld=new LibraryDAO();
//                         Date date = new Date();
//                         String date2;
//                         date2=formatter.format(date);  
//                         String date1;
//                         date1=ld.penalty("504");
//                          try {
//                             Date dateBefore = formatter.parse(date1);
//                             Date dateAfter = formatter.parse(date2);
//                             long difference = dateAfter.getTime() - dateBefore.getTime();
//                             float daysBetween = (difference / (1000*60*60*24));
//              
//                             System.out.println("Number of Days between dates: "+daysBetween);
//                                 } catch (Exception e) {
//                                     System.out.println(e);
//             
//                                }
//        }
//        
//        
        
        
        
        
//        public static void main(String args[])throws Exception
//        {
////           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
////        Date date1 = sdf.parse("2021-01-02");
////        Date date2 = sdf.parse("2020-12-25");
////
////        System.out.println("date1 : " + sdf.format(date1));
////        System.out.println("date2 : " + sdf.format(date2));
////            System.out.println(date2.compareTo(date1));
////            
//             SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
//    Date date = new Date();  
//    System.out.println(formatter.format(date));  
//            
//
//        }
        

}
