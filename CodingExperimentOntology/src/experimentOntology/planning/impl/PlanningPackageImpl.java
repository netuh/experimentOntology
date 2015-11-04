/**
 */
package experimentOntology.planning.impl;

import codingExperimentOntology.CodingExperimentOntologyPackage;

import codingExperimentOntology.apparatus.NewPackage4Package;

import codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl;

import codingExperimentOntology.impl.CodingExperimentOntologyPackageImpl;

import codingExperimentOntology.tasks.NewPackage2Package;

import codingExperimentOntology.tasks.impl.NewPackage2PackageImpl;

import codingExperimentOntology.threats.NewPackage3Package;

import codingExperimentOntology.threats.impl.NewPackage3PackageImpl;

import codingExperimentOntology.variables.NewPackage1Package;

import codingExperimentOntology.variables.impl.NewPackage1PackageImpl;

import experimentOntology.ExperimentOntologyPackage;

import experimentOntology.description.DescriptionPackage;

import experimentOntology.description.gqm.GqmPackage;

import experimentOntology.description.gqm.impl.GqmPackageImpl;

import experimentOntology.description.impl.DescriptionPackageImpl;

import experimentOntology.impl.ExperimentOntologyPackageImpl;

import experimentOntology.operation.OperationPackage;

import experimentOntology.operation.impl.OperationPackageImpl;

import experimentOntology.operation.taskCompositionFramework.TaskCompositionFrameworkPackage;

import experimentOntology.operation.taskCompositionFramework.impl.TaskCompositionFrameworkPackageImpl;

import experimentOntology.planning.Apparatus;
import experimentOntology.planning.Artifact;
import experimentOntology.planning.DependentVariable;
import experimentOntology.planning.DependentVariables;
import experimentOntology.planning.DualFactorPlan;
import experimentOntology.planning.DualTreatmentFactor;
import experimentOntology.planning.ExperimentalPlan;
import experimentOntology.planning.ExperimentalPlanDescription;
import experimentOntology.planning.Factor;
import experimentOntology.planning.GenericPlan;
import experimentOntology.planning.IndependentVariable;
import experimentOntology.planning.IndependentVariables;
import experimentOntology.planning.Instrument;
import experimentOntology.planning.MonoFactorMultTreatmentPlan;
import experimentOntology.planning.MonoFactorTreatmentPlan;
import experimentOntology.planning.MultiTreatmentFactor;
import experimentOntology.planning.PiecesOfApparatus;
import experimentOntology.planning.PlanningFactory;
import experimentOntology.planning.PlanningPackage;
import experimentOntology.planning.TernaryFactorPlan;
import experimentOntology.planning.Treatment;

import experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage;

import experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl;

import experimentOntology.planning.sampling.SamplingPackage;

import experimentOntology.planning.sampling.impl.SamplingPackageImpl;

import experimentOntology.planning.threats.ThreatsPackage;

import experimentOntology.planning.threats.impl.ThreatsPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlanningPackageImpl extends EPackageImpl implements PlanningPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependentVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentalPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass independentVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apparatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instrumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dualTreatmentFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiTreatmentFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treatmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monoFactorTreatmentPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dualFactorPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ternaryFactorPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monoFactorMultTreatmentPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentalPlanDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass piecesOfApparatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass independentVariablesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependentVariablesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see experimentOntology.planning.PlanningPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlanningPackageImpl() {
		super(eNS_URI, PlanningFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PlanningPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlanningPackage init() {
		if (isInited) return (PlanningPackage)EPackage.Registry.INSTANCE.getEPackage(PlanningPackage.eNS_URI);

		// Obtain or create and register package
		PlanningPackageImpl thePlanningPackage = (PlanningPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PlanningPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PlanningPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CodingExperimentOntologyPackageImpl theCodingExperimentOntologyPackage = (CodingExperimentOntologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodingExperimentOntologyPackage.eNS_URI) instanceof CodingExperimentOntologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodingExperimentOntologyPackage.eNS_URI) : CodingExperimentOntologyPackage.eINSTANCE);
		NewPackage1PackageImpl theNewPackage1Package = (NewPackage1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage1Package.eNS_URI) instanceof NewPackage1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage1Package.eNS_URI) : NewPackage1Package.eINSTANCE);
		NewPackage2PackageImpl theNewPackage2Package = (NewPackage2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage2Package.eNS_URI) instanceof NewPackage2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage2Package.eNS_URI) : NewPackage2Package.eINSTANCE);
		NewPackage3PackageImpl theNewPackage3Package = (NewPackage3PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage3Package.eNS_URI) instanceof NewPackage3PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage3Package.eNS_URI) : NewPackage3Package.eINSTANCE);
		NewPackage4PackageImpl theNewPackage4Package = (NewPackage4PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage4Package.eNS_URI) instanceof NewPackage4PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage4Package.eNS_URI) : NewPackage4Package.eINSTANCE);
		ExperimentOntologyPackageImpl theExperimentOntologyPackage = (ExperimentOntologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExperimentOntologyPackage.eNS_URI) instanceof ExperimentOntologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExperimentOntologyPackage.eNS_URI) : ExperimentOntologyPackage.eINSTANCE);
		DescriptionPackageImpl theDescriptionPackage = (DescriptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI) instanceof DescriptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI) : DescriptionPackage.eINSTANCE);
		GqmPackageImpl theGqmPackage = (GqmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GqmPackage.eNS_URI) instanceof GqmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GqmPackage.eNS_URI) : GqmPackage.eINSTANCE);
		ThreatsPackageImpl theThreatsPackage = (ThreatsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) instanceof ThreatsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) : ThreatsPackage.eINSTANCE);
		SamplingPackageImpl theSamplingPackage = (SamplingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SamplingPackage.eNS_URI) instanceof SamplingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SamplingPackage.eNS_URI) : SamplingPackage.eINSTANCE);
		DesignOfExperimentPackageImpl theDesignOfExperimentPackage = (DesignOfExperimentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DesignOfExperimentPackage.eNS_URI) instanceof DesignOfExperimentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DesignOfExperimentPackage.eNS_URI) : DesignOfExperimentPackage.eINSTANCE);
		OperationPackageImpl theOperationPackage = (OperationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) instanceof OperationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) : OperationPackage.eINSTANCE);
		TaskCompositionFrameworkPackageImpl theTaskCompositionFrameworkPackage = (TaskCompositionFrameworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskCompositionFrameworkPackage.eNS_URI) instanceof TaskCompositionFrameworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskCompositionFrameworkPackage.eNS_URI) : TaskCompositionFrameworkPackage.eINSTANCE);

		// Create package meta-data objects
		thePlanningPackage.createPackageContents();
		theCodingExperimentOntologyPackage.createPackageContents();
		theNewPackage1Package.createPackageContents();
		theNewPackage2Package.createPackageContents();
		theNewPackage3Package.createPackageContents();
		theNewPackage4Package.createPackageContents();
		theExperimentOntologyPackage.createPackageContents();
		theDescriptionPackage.createPackageContents();
		theGqmPackage.createPackageContents();
		theThreatsPackage.createPackageContents();
		theSamplingPackage.createPackageContents();
		theDesignOfExperimentPackage.createPackageContents();
		theOperationPackage.createPackageContents();
		theTaskCompositionFrameworkPackage.createPackageContents();

		// Initialize created meta-data
		thePlanningPackage.initializePackageContents();
		theCodingExperimentOntologyPackage.initializePackageContents();
		theNewPackage1Package.initializePackageContents();
		theNewPackage2Package.initializePackageContents();
		theNewPackage3Package.initializePackageContents();
		theNewPackage4Package.initializePackageContents();
		theExperimentOntologyPackage.initializePackageContents();
		theDescriptionPackage.initializePackageContents();
		theGqmPackage.initializePackageContents();
		theThreatsPackage.initializePackageContents();
		theSamplingPackage.initializePackageContents();
		theDesignOfExperimentPackage.initializePackageContents();
		theOperationPackage.initializePackageContents();
		theTaskCompositionFrameworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePlanningPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlanningPackage.eNS_URI, thePlanningPackage);
		return thePlanningPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependentVariable() {
		return dependentVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperimentalPlan() {
		return experimentalPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentalPlan_Threats() {
		return (EReference)experimentalPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentalPlan_Samplingstrategy() {
		return (EReference)experimentalPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentalPlan_Apparatus() {
		return (EReference)experimentalPlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentalPlan_DependentVariables() {
		return (EReference)experimentalPlanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentalPlan_Independentvariables() {
		return (EReference)experimentalPlanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndependentVariable() {
		return independentVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApparatus() {
		return apparatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstrument() {
		return instrumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactor() {
		return factorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDualTreatmentFactor() {
		return dualTreatmentFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDualTreatmentFactor_Treatments() {
		return (EReference)dualTreatmentFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiTreatmentFactor() {
		return multiTreatmentFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiTreatmentFactor_Treatments() {
		return (EReference)multiTreatmentFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreatment() {
		return treatmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonoFactorTreatmentPlan() {
		return monoFactorTreatmentPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonoFactorTreatmentPlan_Design() {
		return (EReference)monoFactorTreatmentPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonoFactorTreatmentPlan_Factor() {
		return (EReference)monoFactorTreatmentPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDualFactorPlan() {
		return dualFactorPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDualFactorPlan_Factor() {
		return (EReference)dualFactorPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDualFactorPlan_Design() {
		return (EReference)dualFactorPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTernaryFactorPlan() {
		return ternaryFactorPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTernaryFactorPlan_Factors() {
		return (EReference)ternaryFactorPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTernaryFactorPlan_Design() {
		return (EReference)ternaryFactorPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericPlan() {
		return genericPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericPlan_Factors() {
		return (EReference)genericPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericPlan_Design() {
		return (EReference)genericPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonoFactorMultTreatmentPlan() {
		return monoFactorMultTreatmentPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonoFactorMultTreatmentPlan_Factor() {
		return (EReference)monoFactorMultTreatmentPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonoFactorMultTreatmentPlan_Design() {
		return (EReference)monoFactorMultTreatmentPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperimentalPlanDescription() {
		return experimentalPlanDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentalPlanDescription_Plan() {
		return (EReference)experimentalPlanDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPiecesOfApparatus() {
		return piecesOfApparatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPiecesOfApparatus_Components() {
		return (EReference)piecesOfApparatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndependentVariables() {
		return independentVariablesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndependentVariables_Variables() {
		return (EReference)independentVariablesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependentVariables() {
		return dependentVariablesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentVariables_Variables() {
		return (EReference)dependentVariablesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanningFactory getPlanningFactory() {
		return (PlanningFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dependentVariableEClass = createEClass(DEPENDENT_VARIABLE);

		experimentalPlanEClass = createEClass(EXPERIMENTAL_PLAN);
		createEReference(experimentalPlanEClass, EXPERIMENTAL_PLAN__THREATS);
		createEReference(experimentalPlanEClass, EXPERIMENTAL_PLAN__SAMPLINGSTRATEGY);
		createEReference(experimentalPlanEClass, EXPERIMENTAL_PLAN__APPARATUS);
		createEReference(experimentalPlanEClass, EXPERIMENTAL_PLAN__DEPENDENT_VARIABLES);
		createEReference(experimentalPlanEClass, EXPERIMENTAL_PLAN__INDEPENDENTVARIABLES);

		independentVariableEClass = createEClass(INDEPENDENT_VARIABLE);

		apparatusEClass = createEClass(APPARATUS);

		artifactEClass = createEClass(ARTIFACT);

		instrumentEClass = createEClass(INSTRUMENT);

		factorEClass = createEClass(FACTOR);

		dualTreatmentFactorEClass = createEClass(DUAL_TREATMENT_FACTOR);
		createEReference(dualTreatmentFactorEClass, DUAL_TREATMENT_FACTOR__TREATMENTS);

		multiTreatmentFactorEClass = createEClass(MULTI_TREATMENT_FACTOR);
		createEReference(multiTreatmentFactorEClass, MULTI_TREATMENT_FACTOR__TREATMENTS);

		treatmentEClass = createEClass(TREATMENT);

		monoFactorTreatmentPlanEClass = createEClass(MONO_FACTOR_TREATMENT_PLAN);
		createEReference(monoFactorTreatmentPlanEClass, MONO_FACTOR_TREATMENT_PLAN__DESIGN);
		createEReference(monoFactorTreatmentPlanEClass, MONO_FACTOR_TREATMENT_PLAN__FACTOR);

		dualFactorPlanEClass = createEClass(DUAL_FACTOR_PLAN);
		createEReference(dualFactorPlanEClass, DUAL_FACTOR_PLAN__FACTOR);
		createEReference(dualFactorPlanEClass, DUAL_FACTOR_PLAN__DESIGN);

		ternaryFactorPlanEClass = createEClass(TERNARY_FACTOR_PLAN);
		createEReference(ternaryFactorPlanEClass, TERNARY_FACTOR_PLAN__FACTORS);
		createEReference(ternaryFactorPlanEClass, TERNARY_FACTOR_PLAN__DESIGN);

		genericPlanEClass = createEClass(GENERIC_PLAN);
		createEReference(genericPlanEClass, GENERIC_PLAN__FACTORS);
		createEReference(genericPlanEClass, GENERIC_PLAN__DESIGN);

		monoFactorMultTreatmentPlanEClass = createEClass(MONO_FACTOR_MULT_TREATMENT_PLAN);
		createEReference(monoFactorMultTreatmentPlanEClass, MONO_FACTOR_MULT_TREATMENT_PLAN__FACTOR);
		createEReference(monoFactorMultTreatmentPlanEClass, MONO_FACTOR_MULT_TREATMENT_PLAN__DESIGN);

		experimentalPlanDescriptionEClass = createEClass(EXPERIMENTAL_PLAN_DESCRIPTION);
		createEReference(experimentalPlanDescriptionEClass, EXPERIMENTAL_PLAN_DESCRIPTION__PLAN);

		piecesOfApparatusEClass = createEClass(PIECES_OF_APPARATUS);
		createEReference(piecesOfApparatusEClass, PIECES_OF_APPARATUS__COMPONENTS);

		independentVariablesEClass = createEClass(INDEPENDENT_VARIABLES);
		createEReference(independentVariablesEClass, INDEPENDENT_VARIABLES__VARIABLES);

		dependentVariablesEClass = createEClass(DEPENDENT_VARIABLES);
		createEReference(dependentVariablesEClass, DEPENDENT_VARIABLES__VARIABLES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ThreatsPackage theThreatsPackage = (ThreatsPackage)EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI);
		SamplingPackage theSamplingPackage = (SamplingPackage)EPackage.Registry.INSTANCE.getEPackage(SamplingPackage.eNS_URI);
		DesignOfExperimentPackage theDesignOfExperimentPackage = (DesignOfExperimentPackage)EPackage.Registry.INSTANCE.getEPackage(DesignOfExperimentPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theThreatsPackage);
		getESubpackages().add(theSamplingPackage);
		getESubpackages().add(theDesignOfExperimentPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		artifactEClass.getESuperTypes().add(this.getApparatus());
		instrumentEClass.getESuperTypes().add(this.getApparatus());
		dualTreatmentFactorEClass.getESuperTypes().add(this.getFactor());
		multiTreatmentFactorEClass.getESuperTypes().add(this.getFactor());
		monoFactorTreatmentPlanEClass.getESuperTypes().add(this.getExperimentalPlan());
		dualFactorPlanEClass.getESuperTypes().add(this.getExperimentalPlan());
		ternaryFactorPlanEClass.getESuperTypes().add(this.getExperimentalPlan());
		genericPlanEClass.getESuperTypes().add(this.getExperimentalPlan());
		monoFactorMultTreatmentPlanEClass.getESuperTypes().add(this.getExperimentalPlan());

		// Initialize classes, features, and operations; add parameters
		initEClass(dependentVariableEClass, DependentVariable.class, "DependentVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(experimentalPlanEClass, ExperimentalPlan.class, "ExperimentalPlan", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperimentalPlan_Threats(), theThreatsPackage.getThreats(), null, "threats", null, 0, 1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalPlan_Samplingstrategy(), theSamplingPackage.getSamplingStrategy(), null, "samplingstrategy", null, 0, 1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalPlan_Apparatus(), this.getPiecesOfApparatus(), null, "apparatus", null, 0, 1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalPlan_DependentVariables(), this.getDependentVariables(), null, "dependentVariables", null, 1, 1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentalPlan_Independentvariables(), this.getIndependentVariables(), null, "independentvariables", null, 0, 1, ExperimentalPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(independentVariableEClass, IndependentVariable.class, "IndependentVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apparatusEClass, Apparatus.class, "Apparatus", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(artifactEClass, Artifact.class, "Artifact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instrumentEClass, Instrument.class, "Instrument", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(factorEClass, Factor.class, "Factor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dualTreatmentFactorEClass, DualTreatmentFactor.class, "DualTreatmentFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDualTreatmentFactor_Treatments(), this.getTreatment(), null, "treatments", null, 2, 2, DualTreatmentFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiTreatmentFactorEClass, MultiTreatmentFactor.class, "MultiTreatmentFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiTreatmentFactor_Treatments(), this.getTreatment(), null, "treatments", null, 3, -1, MultiTreatmentFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treatmentEClass, Treatment.class, "Treatment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(monoFactorTreatmentPlanEClass, MonoFactorTreatmentPlan.class, "MonoFactorTreatmentPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonoFactorTreatmentPlan_Design(), theDesignOfExperimentPackage.getTwoTreatmentDesign(), null, "design", null, 1, 1, MonoFactorTreatmentPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonoFactorTreatmentPlan_Factor(), this.getDualTreatmentFactor(), null, "factor", null, 1, 1, MonoFactorTreatmentPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dualFactorPlanEClass, DualFactorPlan.class, "DualFactorPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDualFactorPlan_Factor(), this.getFactor(), null, "factor", null, 2, 2, DualFactorPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDualFactorPlan_Design(), theDesignOfExperimentPackage.getTwoFactorDesign(), null, "design", null, 1, 1, DualFactorPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ternaryFactorPlanEClass, TernaryFactorPlan.class, "TernaryFactorPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTernaryFactorPlan_Factors(), this.getDualTreatmentFactor(), null, "factors", null, 3, -1, TernaryFactorPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTernaryFactorPlan_Design(), theDesignOfExperimentPackage.getTriFactorDesign(), null, "design", null, 1, 1, TernaryFactorPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericPlanEClass, GenericPlan.class, "GenericPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericPlan_Factors(), this.getFactor(), null, "factors", null, 1, -1, GenericPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericPlan_Design(), theDesignOfExperimentPackage.getGenericDesign(), null, "design", null, 1, 1, GenericPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monoFactorMultTreatmentPlanEClass, MonoFactorMultTreatmentPlan.class, "MonoFactorMultTreatmentPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonoFactorMultTreatmentPlan_Factor(), this.getMultiTreatmentFactor(), null, "factor", null, 1, 1, MonoFactorMultTreatmentPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonoFactorMultTreatmentPlan_Design(), theDesignOfExperimentPackage.getMultTreatmentDesign(), null, "design", null, 1, 1, MonoFactorMultTreatmentPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experimentalPlanDescriptionEClass, ExperimentalPlanDescription.class, "ExperimentalPlanDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperimentalPlanDescription_Plan(), this.getExperimentalPlan(), null, "plan", null, 1, 1, ExperimentalPlanDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(piecesOfApparatusEClass, PiecesOfApparatus.class, "PiecesOfApparatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPiecesOfApparatus_Components(), this.getApparatus(), null, "components", null, 1, -1, PiecesOfApparatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(independentVariablesEClass, IndependentVariables.class, "IndependentVariables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndependentVariables_Variables(), this.getIndependentVariable(), null, "variables", null, 1, -1, IndependentVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependentVariablesEClass, DependentVariables.class, "DependentVariables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependentVariables_Variables(), this.getDependentVariable(), null, "variables", null, 1, -1, DependentVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PlanningPackageImpl
