
Product product;
@Before
product = new Product();

@After
product=null;


@Test
 public boolean breakupString(String product){
 
 String testProduct;
 List<Array> result;
 boolean res;
  
 int position;
 position= product.indexOf('-');
positiontwo =product.lastIndexOf('-')
 
 if( product.getList(1).equals(split(product,position))&& product.getList(2).equals(split(product,positiontwo))  ){
 res=true;}
 else {
 res=false;}
 
 

 return res;
  
 }




//ειναι τελευταιο μαθημα ελπιζω να μη πηγε τοσο χαλια









