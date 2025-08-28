<%-- 
    Document   : home
    Created on : 16 Apr, 2024, 2:00:44 AM
    Author     : Rajakta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home • PrepBIX</title>
        <link rel="stylesheet" href="homeStyle.css" type="text/css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@mdi/font@7.4.47/css/materialdesignicons.min.css">
    </head>
    <body>
        <aside class="sidebar-nav" id="sidebar-nav">
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">×</a>
            <nav class="sidebar">
                <div class="nav-logo">
                    <center><h2>PrepBIX</h2></center>
                </div>
                <li class="divider"></li>
                <ul id="ul">
                    <li class="nav-item">
                        <a href="home.jsp">
                            <span class="icon"><i class="mdi mdi-home"></i></span><span class="text">Home</span>
                        </a>
                    </li>
                    <li class="divider"></li>
                    <li class="nav-item">
                        <a href="#">
                            <span class="icon"><i class="mdi mdi-math-integral-box"></i></span>
                            <span class="text">Arithmetic Aptitude</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a href="#">
                            <span class="icon"><i class="mdi mdi-chart-box"></i></span>
                            <span class="text">Data Interpretation</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a href="#">
                            <span class="icon"><i class="mdi mdi-text-box-check"></i></span>
                            <span class="text">Verbal Ability</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a href="#">
                            <span class="icon"><i class="mdi mdi-chart-arc"></i></span>
                            <span class="text">Logical Reasoning</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a href="#">
                            <span class="icon"><i class="mdi mdi-alphabetical-variant"></i></span>
                            <span class="text">Verbal Reasoning</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a href="#">
                            <span class="icon"><i class="mdi mdi-collage"></i></span>
                            <span class="text">Non-Verbal Reasoning</span>
                        </a>
                    </li>
                    <li class="divider"></li>
                    <li class="nav-item">
                        <a href="#">
                            <span class="icon"><i class="mdi mdi-clock-outline"></i></span>
                            <span class="text">Online Tests</span>
                        </a>
                    </li>
                </ul>
            </nav>
        </aside>
        
        
        <main class="main-wrapper" id="main-wrapper" color="cyan">
        <header>
                
            <nav class="navbar">
                <div class="nav1" style="display: flex;" >
                    <button class="openbtn" onclick="openNav()">☰</button>
                    <div class="logo">PrepBIX</div>
                </div>
                <div id="nav2">
                <ul id="nav2-ul">
                    <li class="">
                        <form action="https://www.google.com/search" method="GET" target="_blank">
                        <input type="text" name="q" placeholder="Search...">
                        <button class="search-btn" type="submit">
                          <i class="mdi mdi-magnify mdi-24px"></i>
                        </button>
                      </form>

                    </li>
                    <li class="nav2-btn">
                        <span class="theme-toggle" id="theme-btn">
                          <i class="mdi mdi-theme-light-dark mdi-rotate-315"></i>
                        </span>
                    </li>

                    <li class="nav2-btn">
                       <span class="logout-btn">
                            <a href="logout.jsp">
                                <i class="mdi mdi-logout"></i>
                            </a> 
                        </span> 
                    </li>
                </ul>
                </div>
                <%--
                <div class="search-bar">
                  <form action="https://www.google.com/search" method="GET" target="_blank">
                    <input type="text" name="q" placeholder="Search...">
                    <button class="search-btn" type="submit">
                      <i class="mdi mdi-magnify mdi-24px"></i>
                    </button>
                  </form>
                </div>

                    <span class="theme-toggle">
                      <button id="theme-btn"><i class="mdi mdi-theme-light-dark mdi-rotate-315"></i></button>
                    </span>

                    <div class="logout-btn">
                        <a href="logout.jsp">
                            <button><i class="mdi mdi-logout"></i></button>
                        </a> 
                    </div>--%>

            </nav>
            <script>
                function openNav() {
                  document.getElementById("sidebar-nav").style.width = "270px";
                  document.getElementById("main-wrapper").style.marginLeft = "270px";
                }

                function closeNav() {
                  document.getElementById("sidebar-nav").style.width = "0";
                  document.getElementById("main-wrapper").style.marginLeft= "0";
                }
            </script>
            
            <script>
                // Example JavaScript for toggling the theme
                const themeBtn = document.getElementById('theme-btn');
                themeBtn.addEventListener('click', () => {
                  document.body.classList.toggle('dark-theme');
                });
            </script>    
        </header>    
            

            <%String username=(String)session.getAttribute("username");
            if(username==null)
            {
                response.sendRedirect("login.html");
            }
            %>
            <h1>Hello <%=username%>....!</h1>
            <h3>Login Successful......:)</h3>
            <section>
            <h2>General Aptitude</h2>
            <iframe width="33%" src="https://www.youtube.com/embed/S-Ji7aayH3A?si=mfnEu0k1rTdbKIln" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen>
                
            </iframe>
            
            </section>
          
            <a href="logout.jsp">Sign Out</a>
        </main>
        <footer>
            <div >
                <p>&copy; 2025 Placement Preparation. All rights reserved.</p>
            </div>
        </footer>
    </body>
</html>
