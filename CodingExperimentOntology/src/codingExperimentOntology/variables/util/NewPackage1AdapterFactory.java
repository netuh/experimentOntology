/**
 */
package codingExperimentOntology.variables.util;

import codingExperimentOntology.variables.*;

import experimentOntology.planning.DependentVariable;
import experimentOntology.planning.IndependentVariable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see codingExperimentOntology.variables.NewPackage1Package
 * @generated
 */
public class NewPackage1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NewPackage1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NewPackage1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewPackage1Switch<Adapter> modelSwitch =
		new NewPackage1Switch<Adapter>() {
			@Override
			public Adapter caseCodingDependentVariable(CodingDependentVariable object) {
				return createCodingDependentVariableAdapter();
			}
			@Override
			public Adapter caseCodingIndependentVariable(CodingIndependentVariable object) {
				return createCodingIndependentVariableAdapter();
			}
			@Override
			public Adapter caseTimeBoundVariable(TimeBoundVariable object) {
				return createTimeBoundVariableAdapter();
			}
			@Override
			public Adapter caseResourceBasedVariable(ResourceBasedVariable object) {
				return createResourceBasedVariableAdapter();
			}
			@Override
			public Adapter caseAwnserBasedVariable(AwnserBasedVariable object) {
				return createAwnserBasedVariableAdapter();
			}
			@Override
			public Adapter caseArtifactIndependentVariable(ArtifactIndependentVariable object) {
				return createArtifactIndependentVariableAdapter();
			}
			@Override
			public Adapter caseEnviromentIndependentVariable(EnviromentIndependentVariable object) {
				return createEnviromentIndependentVariableAdapter();
			}
			@Override
			public Adapter caseOtherCodingVariable(OtherCodingVariable object) {
				return createOtherCodingVariableAdapter();
			}
			@Override
			public Adapter caseDependentVariable(DependentVariable object) {
				return createDependentVariableAdapter();
			}
			@Override
			public Adapter caseIndependentVariable(IndependentVariable object) {
				return createIndependentVariableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.variables.CodingDependentVariable <em>Coding Dependent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.variables.CodingDependentVariable
	 * @generated
	 */
	public Adapter createCodingDependentVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.variables.CodingIndependentVariable <em>Coding Independent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.variables.CodingIndependentVariable
	 * @generated
	 */
	public Adapter createCodingIndependentVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.variables.TimeBoundVariable <em>Time Bound Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.variables.TimeBoundVariable
	 * @generated
	 */
	public Adapter createTimeBoundVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.variables.ResourceBasedVariable <em>Resource Based Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.variables.ResourceBasedVariable
	 * @generated
	 */
	public Adapter createResourceBasedVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.variables.AwnserBasedVariable <em>Awnser Based Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.variables.AwnserBasedVariable
	 * @generated
	 */
	public Adapter createAwnserBasedVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.variables.ArtifactIndependentVariable <em>Artifact Independent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.variables.ArtifactIndependentVariable
	 * @generated
	 */
	public Adapter createArtifactIndependentVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.variables.EnviromentIndependentVariable <em>Enviroment Independent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.variables.EnviromentIndependentVariable
	 * @generated
	 */
	public Adapter createEnviromentIndependentVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.variables.OtherCodingVariable <em>Other Coding Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.variables.OtherCodingVariable
	 * @generated
	 */
	public Adapter createOtherCodingVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.DependentVariable <em>Dependent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.DependentVariable
	 * @generated
	 */
	public Adapter createDependentVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.IndependentVariable <em>Independent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.IndependentVariable
	 * @generated
	 */
	public Adapter createIndependentVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NewPackage1AdapterFactory
