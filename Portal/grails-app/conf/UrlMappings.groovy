class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?" {}
        "/admin/login/$action?/$id?"(controller: "AdminLogin")
        "/admin/home/$action?/$id?"(controller: "AdminLogin")
        "/api/related"(controller: "RelatedProducts")
        "/api/licenses"(controller: "Licenses")
        "/api/renewals"(controller: "Renewals")
        "/api/backend"(controller: "Backend")
        "/"(view: "/login/index")
        "500"(view: '/error')
    }
}
