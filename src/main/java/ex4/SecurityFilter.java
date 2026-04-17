package ex4;

public class SecurityFilter implements Filter{
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) {
        System.out.println("시큐리티 필터 전처리");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("시큐리티 필터 후처리");

    }
}
