import com.exam.data.Certificate
import com.exam.security.Role
import com.exam.security.RoleMenu
import com.exam.security.User
import com.exam.security.UserRole

class BootStrap {

    def init = { servletContext ->

        for (String url in [
                '/', '/error', '/index', '/index.gsp', '/**/favicon.ico', '/shutdown',
                '/assets/**', '/**/js/**', '/**/css/**', '/**/images/**',
                '/login', '/login.*', '/login/*',
                '/logout', '/logout.*', '/logout/*']) {
            new RoleMenu(url: url, configAttribute: 'permitAll').save()
        }

        new RoleMenu(url: '/profile/**', configAttribute: 'ROLE_USER').save()
        new RoleMenu(url: '/admin/**', configAttribute: 'ROLE_ADMIN').save()
        new RoleMenu(url: '/admin/role/**', configAttribute: 'ROLE_SUPERVISOR').save()
        new RoleMenu(url: '/admin/user/**',
                configAttribute: 'ROLE_ADMIN,ROLE_SUPERVISOR').save()
        new RoleMenu(url: '/login/impersonate',
                configAttribute: 'ROLE_SWITCH_USER,isFullyAuthenticated()').save()

        new RoleMenu(url: '/user/**', configAttribute: 'ROLE_ADMIN').save()
        new RoleMenu(url: '/requestmap/**', configAttribute: 'ROLE_ADMIN').save()
        new RoleMenu(url: '/role/**', configAttribute: 'ROLE_ADMIN').save()
        new RoleMenu(url: '/forgotPassword/**', configAttribute: 'permitAll').save()
        new RoleMenu(url: '/register/**', configAttribute: 'permitAll').save()
        new RoleMenu(url: '/bahanUjian/**', configAttribute: 'ROLE_ADMIN').save()
        new RoleMenu(url: '/certificate/**', configAttribute: 'ROLE_ADMIN').save()



        def adminRole = new Role(authority: 'ROLE_ADMIN').save()
        def userRole = new Role(authority: 'ROLE_USER').save()

        def user = new User(username: 'admin', password: 'admin123')
        def ridho = new User(username: 'ridho', password: 'ridho123')
        def atuanda = new User(username: 'atuanda', password: 'atuanda123')
        user.save(flush: true)
        ridho.save(flush: true)
        atuanda.save(flush: true)

        UserRole.create user, adminRole
        UserRole.create ridho, adminRole
        UserRole.create atuanda, userRole

        UserRole.withSession {
            it.flush()
            it.clear()
        }


        new Certificate(nama: "Global Certificate", informasi: "Global Certificate").save(flush: true)
        new Certificate(nama: "Reguler  Certificate", informasi: "Reguler  Certificate").save(flush: true)
    }

    def destroy = {
    }
}
