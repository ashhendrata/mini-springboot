rootProject.name = "mini-springboot"
include("src:main:Queries")
findProject(":src:main:Queries")?.name = "Queries"
