package ex4;

public class Tomcat {
    public static void main(String[] args) {
        System.out.println("요청들어옴");

        //filter생성
        ServletRequest request = new ServletRequest();
        ServletResponse response = new ServletResponse();
        FilterChain filterChain = new FilterChain();


        filterChain.doFilter(request, response);
        System.out.println("여기서 최종응답함");
    }
}
