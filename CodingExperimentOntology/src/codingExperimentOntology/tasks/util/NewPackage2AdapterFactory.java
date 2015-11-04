/**
 */
package codingExperimentOntology.tasks.util;

import codingExperimentOntology.tasks.*;

import experimentOntology.operation.ContextRelatedTask;
import experimentOntology.operation.ExperimentalTasks;
import experimentOntology.operation.PreTasks;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see codingExperimentOntology.tasks.NewPackage2Package
 * @generated
 */
public class NewPackage2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NewPackage2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NewPackage2Package.eINSTANCE;
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
	protected NewPackage2Switch<Adapter> modelSwitch =
		new NewPackage2Switch<Adapter>() {
			@Override
			public Adapter caseCodingTask(CodingTask object) {
				return createCodingTaskAdapter();
			}
			@Override
			public Adapter caseConventionalCodingTask(ConventionalCodingTask object) {
				return createConventionalCodingTaskAdapter();
			}
			@Override
			public Adapter caseGenericCodingTask(GenericCodingTask object) {
				return createGenericCodingTaskAdapter();
			}
			@Override
			public Adapter caseCodingPreTask(CodingPreTask object) {
				return createCodingPreTaskAdapter();
			}
			@Override
			public Adapter caseTrainingClass(TrainingClass object) {
				return createTrainingClassAdapter();
			}
			@Override
			public Adapter casePilotTask(PilotTask object) {
				return createPilotTaskAdapter();
			}
			@Override
			public Adapter caseExperimentalCodingTask(ExperimentalCodingTask object) {
				return createExperimentalCodingTaskAdapter();
			}
			@Override
			public Adapter caseContextRelatedTask(ContextRelatedTask object) {
				return createContextRelatedTaskAdapter();
			}
			@Override
			public Adapter caseExperimentalTasks(ExperimentalTasks object) {
				return createExperimentalTasksAdapter();
			}
			@Override
			public Adapter casePreTasks(PreTasks object) {
				return createPreTasksAdapter();
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
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.tasks.CodingTask <em>Coding Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.tasks.CodingTask
	 * @generated
	 */
	public Adapter createCodingTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.tasks.ConventionalCodingTask <em>Conventional Coding Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.tasks.ConventionalCodingTask
	 * @generated
	 */
	public Adapter createConventionalCodingTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.tasks.GenericCodingTask <em>Generic Coding Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.tasks.GenericCodingTask
	 * @generated
	 */
	public Adapter createGenericCodingTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.tasks.CodingPreTask <em>Coding Pre Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.tasks.CodingPreTask
	 * @generated
	 */
	public Adapter createCodingPreTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.tasks.TrainingClass <em>Training Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.tasks.TrainingClass
	 * @generated
	 */
	public Adapter createTrainingClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.tasks.PilotTask <em>Pilot Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.tasks.PilotTask
	 * @generated
	 */
	public Adapter createPilotTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link codingExperimentOntology.tasks.ExperimentalCodingTask <em>Experimental Coding Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see codingExperimentOntology.tasks.ExperimentalCodingTask
	 * @generated
	 */
	public Adapter createExperimentalCodingTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.operation.ContextRelatedTask <em>Context Related Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.operation.ContextRelatedTask
	 * @generated
	 */
	public Adapter createContextRelatedTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.operation.ExperimentalTasks <em>Experimental Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.operation.ExperimentalTasks
	 * @generated
	 */
	public Adapter createExperimentalTasksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.operation.PreTasks <em>Pre Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.operation.PreTasks
	 * @generated
	 */
	public Adapter createPreTasksAdapter() {
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

} //NewPackage2AdapterFactory
