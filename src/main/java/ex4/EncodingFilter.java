package ex4;

public class EncodingFilter implements Filter{
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) {
        System.out.println("전치리");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("후처리");
    }
}
