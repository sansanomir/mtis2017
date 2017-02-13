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
        public Form1()
        {
            String url="http://localhost:9080/practica1/services/servicio.wsdl";
            InitializeComponent();
            
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void buttonDni_Click(object sender, EventArgs e)
        {
             
        }
    }
}
