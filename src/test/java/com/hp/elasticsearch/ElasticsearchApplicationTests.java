package com.hp.elasticsearch;

/*import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;*/
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ElasticsearchApplicationTests {

   /* @Autowired
    JestClient jestClient;

    @Autowired
    BookRepository bookRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void test1(){
        Article article = new Article();
        article.setId(1);
        article.setTitle("好消息");
        article.setContent("good news");
        article.setAuthor("刘彦泽");

        Index index = new Index.Builder(article).index("hpps").type("news").build();

        try {
            jestClient.execute(index);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test2(){
        String json = "{\n" +
                "    \"query\" : {\n" +
                "        \"match\" : {\n" +
                "            \"author\" : \"刘彦泽\"\n" +
                "        }\n" +
                "    }\n" +
                "}";

        Search search = new Search.Builder(json).addIndex("hpps").addType("news").build();

        try {
            SearchResult result = jestClient.execute(search);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3(){
        *//*Book book = new Book();
        book.setId(1);
        book.setName("西游记");
        book.setAuthor("吴承恩");
        bookRepository.index(book);*//*

        for (Book book : bookRepository.findByNameLike("游记")) {
            System.out.println(book);
        }

    }*/
}
