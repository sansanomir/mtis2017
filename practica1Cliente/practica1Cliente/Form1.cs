using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace practica1Cliente
{
    public partial class Form1 : Form
    {
        private practica1Cliente.localhost.servicio sv;

        public Form1()
        {
            InitializeComponent();
            this.sv = new practica1Cliente.localhost.servicio();
            textBoxLlave.PasswordChar = '*';
            labelDniResult.Text = "";
            labelIbanResult.Text = "";
            label3.Text = "";
            labelProvincia.Text = "";
            labelPoblacion.Text = "";
            labelErrorSol.Text = "";
            labelPrecio.Text = "";
            labelDisp.Text = "";
            labelFechaMostrar.Text = "";
            labelPrecioEuros.Text = "";
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
        private void buttonDni_Click(object sender, EventArgs e)
        {
            bool a = sv.validarNIF(textBoxDni.Text,textBoxLlave.Text);
            if(a)
                labelDniResult.Text = "Ok";
            else
                labelDniResult.Text = "Dni o clave inválida";
        }

        private void textBoxLlave_TextChanged(object sender, EventArgs e)
        {

        }

        private void buttonIban_Click(object sender, EventArgs e)
        {
            String error = "";
            bool a = sv.validarIBAN(textBoxIban.Text, textBoxLlave.Text,out error);
                labelIbanResult.Text = error;
        }

        private void buttonCodigoPostal_Click(object sender, EventArgs e)
        {
            String provincia="", poblacion="";
            String resultado = sv.consultaCodigoPostal(textBoxCodigoPostal.Text,textBoxLlave.Text,out poblacion,out provincia);

            if (resultado == ""){
                labelPoblacion.Text = "";
                labelProvincia.Text = "";
                label3.Text = "Clave no válida";
            }
                
            else if (poblacion == "No encontrado")
            {
                labelPoblacion.Text = "";
                labelProvincia.Text = "";
                label3.Text = "Código no encontrado en la base de datos";
            }
            else
            {
                labelPoblacion.Text = poblacion;
                labelProvincia.Text = provincia;
                label3.Text = "";
            }
        }

        private void buttonSolPres_Click(object sender, EventArgs e)
        {
            bool disponible=false;
            System.DateTime fecha = new System.DateTime();
            int proveedor = -1;
            float resultado = -1;
            try
            {
                proveedor = Convert.ToInt32(textBoxIdProv.Text);
            }
            catch (OverflowException)
            {
                textBoxIdProv.Text = "";
                labelErrorSol.Text = "Número muy grande";
                labelFechaMostrar.Text = "";
                labelPrecioEuros.Text = "";
                labelPrecio.Text = "";
                labelDisp.Text = "";
            }
            catch (FormatException)
            {
                textBoxIdProv.Text = "";
                labelErrorSol.Text = "El identificator tiene que ser entero";
                labelFechaMostrar.Text = "";
                labelPrecioEuros.Text = "";
                labelPrecio.Text = "";
                labelDisp.Text = "";
            } 
            resultado = sv.solicitarPresupuesto(textBoxRefPieza.Text, proveedor, textBoxLlave.Text, out disponible, out fecha);
            if (resultado != 0.0)
            {
                labelErrorSol.Text = "";
                labelPrecio.Text = resultado.ToString();
                String formato = fecha.Day + "-" + fecha.Month + "-" + fecha.Year;
                labelDisp.Text = formato;

                labelFechaMostrar.Text = "Fecha disponibilidad:";
                labelPrecioEuros.Text = "Precio (€):";
            }
            else
            {
                labelErrorSol.Text = "Referencia o proveedor no encontrados";
                labelFechaMostrar.Text = "";
                labelPrecioEuros.Text = "";
                labelPrecio.Text = "";
                labelDisp.Text = "";
            }
        }

        private void labelIbanResult_Click(object sender, EventArgs e)
        {

        }

        private void labelProvincia_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void label5_Click(object sender, EventArgs e)
        {

        }    
    }
}
