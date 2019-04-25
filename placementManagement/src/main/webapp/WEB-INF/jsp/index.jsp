<%@ include file="table_creation_p_db.jsp" %>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="utf-8">
  <title>Sharda  Placement</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">
 <link rel="stylesheet" href="css/font-awesome.min.css">
  <link rel="stylesheet" href="css/bootstrap.css">
  
  <link href="static/javascripts/validate.js">
  <!-- Bootstrap CSS File -->
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="lib/lightbox/css/lightbox.min.css" rel="stylesheet">
    <script th:src="@{//ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js}"></script>
  <!-- Main Stylesheet File -->
  <link href="css/style.css" rel="stylesheet">
    <script>
        $( document ).ready(function(){

            $("#login").on("click",function () {
                $ajax({
                    url:"/login",
                    method:"get"
                });
            })
        });
    </script>
</head>

<body>

  <!--==========================
    Header
  ============================-->
  <header id="header">
    <div class="container-fluid">

      <div id="logo" class="pull-left">
       <a href="#intro"><img src="img/logo.png" alt="" title="" /></a>
        <!-- Uncomment below if you prefer to use an image logo -->
        
      </div>

      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li class="menu-active"><a href="index.jsp">Home</a></li>
          <li><a href="#about">About Us</a></li>
          <li><a href="#services">What's Happenning</a></li>
          <li class="menu-has-children"><a href="">Placement</a>
            <ul>
              <li><a href="#">placement overview</a></li>
              <li><a href="#">our Recruiters</a></li>
              <li><a href="#">placement policy</a></li>
              <li><a href="#">contact placement cell</a></li>
            </ul>
          </li>
          <li><a href="#contact">Contact Us</a></li>
           <li>
            <button type="button" id="loginbutton" class="btn btn-outline-success"><a href="login1.jsp">Log In</a></button>
            </li>
                <li>
                 <button type="button" class="btn btn-outline-primary"><a href="signupstudent.jsp">Sign Up student</a></button>
                </li>
                
                <li>
                 <button type="button" class="btn btn-outline-primary"><a href="signupplacement.jsp">Sign Up placement</a></button>
                </li>
          </ul>
      </nav><!-- #nav-menu-container -->
    </div>
  </header><!-- #header -->

  <!--==========================
    Intro Section
  ============================-->
  <section id="intro">
    <div class="intro-container">
      <div id="introCarousel" class="carousel  slide carousel-fade" data-ride="carousel">

        <ol class="carousel-indicators"></ol>

        <div class="carousel-inner" role="listbox">

          <div class="carousel-item active">
            <div class="carousel-background"><img src="img/sharda.jpg" alt="sharda image"></div>
            <div class="carousel-container">
              <div class="carousel-content">
                <h2>Sharda University</h2>
                <p>Training and Placement Management System</p>
                <a href="https://www.sharda.ac.in" class="btn-get-started scrollto">Read More...</a>
              </div>
            </div>
          </div>

          
        </div>

        <a class="carousel-control-prev" href="#introCarousel" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon ion-chevron-left" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>

        <a class="carousel-control-next" href="#introCarousel" role="button" data-slide="next">
          <span class="carousel-control-next-icon ion-chevron-right" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>

      </div>
    </div>
  </section><!-- #intro -->

  <main id="main">
 <!--==========================
      About Us Section
    ============================-->
    <section id="about">
      <div class="container">

        <header class="section-header">
          <h3>About Us</h3>
          <p>SHARDA UNIVERSITY IS A LEADING EDUCATIONAL INSTITUTION BASED OUT OF GREATER NOIDA, DELHI NCR. A VENTURE OF THE RENOWNED SHARDA GROUP OF INSTITUTIONS (SGI), THE UNIVERSITY HAS ESTABLISHED ITSELF AS A HIGH QUALITY EDUCATION PROVIDER WITH PRIME FOCUS ON HOLISTIC LEARNING AND IMBIBING COMPETITIVE ABILITIES IN STUDENTS.</p>
        </header>

               <div class="row about-cols">
              
           <div class="row">
       <div class="col-lg-4 col-sm-6 text-center mb-4">
      <img class="rounded-circle img-fluid d-block mx-auto" src="img/about1.png" alt="">
      <h2 class="title"><a href="https://www.sharda.ac.in/sgi-overview-history.html">About SGI</a></h2>
           <p>
                The Sharda Group of Institutions has been a provider of world class education since 1996.
              </p>

          </div>
    <div class="col-lg-4 col-sm-6 text-center mb-4">
      <img class="rounded-circle img-fluid d-block mx-auto" src="img/about2.png" alt="">
       <h2 class="title"><a href="https://www.sharda.ac.in/csr-activities.html">CSR Activities</a></h2>
       <p>Sharda University, in its corporate policy, philosophy and deeds has shown strong commitment.
              </p>  </div>
    <div class="col-lg-4 col-sm-6 text-center mb-4">
      <img class="rounded-circle img-fluid d-block mx-auto" src="img/about3.png" alt="">
      <h2 class="title"><a href="https://www.sharda.ac.in/administration.html">Administration</a></h2>
      <p>
                It is the largest educational group based in UttarPradesh, having 20,000+ students and 1,200+ faculty 
              </p>
    </div>
   </div>
        </div>

      </div>
    </section><!-- #about -->
    <!--==========================
      Contact Section
    ============================-->
    <section id="contact" class="section-bg wow fadeInUp">
      <div class="container">

        <div class="section-header">
          <h3>Contact Us</h3>
          <p>Sharda University greater noida main branch</p>
        </div>

        <div class="row contact-info">

          <div class="col-md-4">
            <div class="contact-address">
              <i class="ion-ios-location-outline"></i>
              <h3>Address</h3>
              <address>Plot No. 32-34,Knowledge Park III,
              Greater Noida, Uttar Pradesh</address>
            </div>
          </div>

          <div class="col-md-4">
            <div class="contact-phone">
              <i class="ion-ios-telephone-outline"></i>
              <h3>Phone Number</h3>
              <p><a href="tel:+155895548855">0120 406 0210</a></p>
            </div>
          </div>

          <div class="col-md-4">
            <div class="contact-email">
              <i class="ion-ios-email-outline"></i>
              <h3>Email</h3>
              <p><a href="mailto:info@example.com">su.finance.info@sharda.ac.in</a></p>
            </div>
          </div>

        </div>

        <div class="form">
          <div id="errormessage"></div>
          <form action="contact_index.jsp" method="post" >
            <div class="form-row">
              <div class="form-group col-md-6">
                <input type="text" name="name" class="form-control"  placeholder="Your Name" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                <div class="validation"></div>
              </div>
              <div class="form-group col-md-6">
                <input type="email" name="email" class="form-control"  placeholder="Your Email" data-rule="email" data-msg="Please enter a valid email" />
                <div class="validation"></div>
              </div>
            </div>
            <div class="form-group">
              <input type="text" class="form-control" name="subject"  placeholder="Subject" data-rule="minlen:4" data-msg="Please enter at least 8 chars of subject" />
              <div class="validation"></div>
            </div>
            <div class="form-group">
              <textarea class="form-control" name="message" rows="5" data-rule="required" data-msg="Please write something for us" placeholder="Message"></textarea>
              <div class="validation"></div>
            </div>
            <div class="text-center"><button type="submit">Send Message</button></div>
          </form>

</div>
</div>
   </section><!-- #contact -->
   <%
  String msg=request.getParameter("msg");
if(msg!=null)
{
	System.out.println("<html><body>");
    System.out.println("<center><font color=black size=5 text-align=center>"+msg);
    System.out.println("</font></center>");
    System.out.println("</body></html>");
}
%>
     </main>

  <!--==========================
    Footer
  ============================-->
  <footer id="footer">
    <div class="footer-top">
      <div class="container">
        <div class="row">

          <div class="col-lg-3 col-md-6 footer-info">
            <h3>Sharda University</h3>
            <p>The name of University, 'Sharda' is synonymous to 'Goddess of knowledge and learning - Saraswati'. She is identified with 'veena' an Indian musical instrument and the 'lotus' where she resides. The lotus in our logo symbolizes the seat of learning that the University is created for.</p>
          </div>

          <div class="col-lg-3 col-md-6 footer-links">
            <h4>Useful Links</h4>
            <ul>
              <li><i class="ion-ios-arrow-right"></i> <a href="#">Home</a></li>
              <li><i class="ion-ios-arrow-right"></i> <a href="#">About us</a></li>
              <li><i class="ion-ios-arrow-right"></i> <a href="#">Contact Us</a></li>
              <li><i class="ion-ios-arrow-right"></i> <a href="#">Our Recruiters</a></li>
              <li><i class="ion-ios-arrow-right"></i> <a href="#">Placement policy</a></li>
            </ul>
          </div>

          <div class="col-lg-3 col-md-6 footer-contact">
            <h4>Contact Us</h4>
            <p>
             Plot No. 32-34, <br>
              Knowledge Park III, <br>
              Greater Noida, Uttar Pradesh<br>
              <strong>Phone:</strong>0120 406 0210<br>
              <strong>Email:</strong>su.finance.info@sharda.ac.in<br>
            </p>

            <div class="social-links">
              <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
              <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
              <a href="#" class="instagram"><i class="fa fa-instagram"></i></a>
              <a href="#" class="google-plus"><i class="fa fa-google-plus"></i></a>
              <a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a>
            </div>

          </div>

          <div class="col-lg-3 col-md-6 footer-newsletter">
            <h4>Our Newsletter</h4>
            <form action="" method="post">
              <input type="email" name="email"><input type="submit"  value="Subscribe">
            </form>
          </div>

        </div>
      </div>
    </div>

    <div class="container">
      <div class="copyright">
        &copy; Copyright <strong>Sharda University</strong>. All Rights Reserved
      </div>
      <div class="credits">
       
        Designed by <a href="#">B.Tech Students</a>
      </div>
    </div>
  </footer><!-- #footer -->

  <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

  <!-- JavaScript Libraries -->
  <script src="lib/jquery/jquery.min.js"></script>
  <script src="lib/jquery/jquery-migrate.min.js"></script>
  <script src="lib/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="lib/easing/easing.min.js"></script>
  <script src="lib/superfish/hoverIntent.js"></script>
  <script src="lib/superfish/superfish.min.js"></script>
  <script src="lib/wow/wow.min.js"></script>
  <script src="lib/waypoints/waypoints.min.js"></script>
  <script src="lib/counterup/counterup.min.js"></script>
  <script src="lib/owlcarousel/owl.carousel.min.js"></script>
  <script src="lib/isotope/isotope.pkgd.min.js"></script>
  <script src="lib/lightbox/js/lightbox.min.js"></script>
  <script src="lib/touchSwipe/jquery.touchSwipe.min.js"></script>
  <!-- Contact Form JavaScript File -->
  <script src="contactform/contactform.js"></script>

  <!-- Template Main Javascript File -->
  <script src="js/main.js"></script>

</body>
</html>
