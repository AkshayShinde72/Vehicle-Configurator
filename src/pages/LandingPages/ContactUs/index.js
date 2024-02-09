import { useState } from "react";
import { Link } from "react-router-dom";
import Card from "@mui/material/Card";
//import CardContent from "@mui/material/CardContent";
import Switch from "@mui/material/Switch";
import Grid from "@mui/material/Grid";
import MKBox from "components/MKBox";
import MKInput from "components/MKInput";
import MKButton from "components/MKButton";
import MKTypography from "components/MKTypography";
import SimpleFooter from "examples/Footers/SimpleFooter";
import bgImage from "assets/images/Home3.jpg";

function RegistrationForm() {
  const [checked, setChecked] = useState(true);

  const handleChecked = () => setChecked(!checked);

  return (
    <>
      <MKBox
        position="absolute"
        top={0}
        left={0}
        zIndex={1}
        width="100%"
        minHeight="100vh"
        sx={{
          backgroundImage: ({ functions: { linearGradient, rgba }, palette: { gradients } }) =>
            `${linearGradient(
              rgba(gradients.dark.main, 0.6),
              rgba(gradients.dark.state, 0.6)
            )}, url(${bgImage})`,
          backgroundSize: "cover",
          backgroundPosition: "center",
          backgroundRepeat: "no-repeat",
        }}
      />
      <MKBox px={1} width="100%" height="100vh" mx="auto" position="relative" zIndex={2}>
        <Grid container spacing={1} justifyContent="center" alignItems="center" height="100%">
          <Grid item xs={11} sm={9} md={5} lg={4} xl={3}>
            <Card>
              <MKBox
                variant="gradient"
                bgColor="info"
                borderRadius="lg"
                coloredShadow="info"
                mx={2}
                mt={-3}
                p={2}
                mb={1}
                textAlign="center"
              >
                <MKTypography variant="h4" fontWeight="medium" color="white" mt={1}>
                  Register
                </MKTypography>
              </MKBox>
              <MKBox pt={4} pb={3} px={3}>
                <MKBox component="form" role="form">
                  <MKBox mb={2}>
                    <MKInput variant="standard" label="First Name" fullWidth />
                  </MKBox>
                  <MKBox mb={2}>
                    <MKInput variant="standard" label="Last Name" fullWidth />
                  </MKBox>
                  <MKBox mb={2}>
                    <MKInput variant="standard" type="password" label="Password" fullWidth />
                  </MKBox>
                  <MKBox mb={2}>
                    <MKInput variant="standard" label="City" fullWidth />
                  </MKBox>
                  <MKBox mb={2}>
                    <MKInput variant="standard" label="Country" fullWidth />
                  </MKBox>
                  <MKBox mb={2}>
                    <MKInput variant="standard" type="email" label="Email Address" fullWidth />
                  </MKBox>
                  <MKBox display="flex" alignItems="center" ml={-1}>
                    <Switch checked={checked} onChange={handleChecked} />
                    <MKTypography
                      variant="button"
                      fontWeight="regular"
                      color="text"
                      onClick={handleChecked}
                      sx={{ cursor: "pointer", userSelect: "none", ml: -1 }}
                    >
                      &nbsp;&nbsp;I agree the&nbsp;
                    </MKTypography>
                    <MKTypography
                      component="a"
                      href="#"
                      variant="button"
                      fontWeight="regular"
                      color="text"
                    >
                      Terms and Conditions
                    </MKTypography>
                  </MKBox>
                  <MKBox mt={4} mb={1}>
                    <MKButton variant="gradient" color="info" fullWidth>
                      Register
                    </MKButton>
                  </MKBox>
                  <MKBox mt={3} mb={1} textAlign="center">
                    <MKTypography variant="button" color="text">
                      Already have an account?{" "}
                      <MKTypography
                        component={Link}
                        to="/authentication/sign-in"
                        variant="button"
                        color="info"
                        fontWeight="medium"
                        textGradient
                      >
                        Sign in
                      </MKTypography>
                    </MKTypography>
                  </MKBox>
                </MKBox>
              </MKBox>
            </Card>
          </Grid>
        </Grid>
      </MKBox>
      <MKBox width="100%" position="absolute" zIndex={2} bottom="1.625rem">
        <SimpleFooter light />
      </MKBox>
    </>
  );
}

export default RegistrationForm;
