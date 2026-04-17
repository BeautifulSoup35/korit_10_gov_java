package ex4;

public interface Filter {
    void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain);

}
