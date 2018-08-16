package _13_Stu_Interfaces.Solved;

interface DatabaseService {

  public void delete (Object object);

  public void insert (Object object);

  public void replace (int id, Object object);

  public void retrieve (int id);

  public void update (Object object);

}
