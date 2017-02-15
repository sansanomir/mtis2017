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
        practica1Cliente.localhost.servicio sv;

        public Form1()
        {
            InitializeComponent();
            this.sv = new practica1Cliente.localhost.servicio();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
        private void buttonDni_Click(object sender, EventArgs e)
        {
            bool a = sv.validarNIF("6553345","dgfsdf");
            labelDniResult.Text = "";
        }
    }
}
